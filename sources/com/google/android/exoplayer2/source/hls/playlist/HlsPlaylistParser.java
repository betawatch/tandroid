package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMultivariantPlaylist;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser {
    private final HlsMultivariantPlaylist multivariantPlaylist;
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_MIME = Pattern.compile("MIME=\"(.+?)\"");
    private static final Pattern REGEX_CACHED = Pattern.compile("CACHED=\"(.+?)\"");
    private static final Pattern REGEX_DOC_ID = Pattern.compile("DOCID=\"(.+?)\"");
    private static final Pattern REGEX_DOC_FILENAME = Pattern.compile("DOCFILENAME=\"(.+?)\"");
    private static final Pattern REGEX_ACCOUNT = Pattern.compile("ACCOUNT=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class DeltaUpdateException extends IOException {
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw ParserException.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    trim = readLine.trim();
                    if (!trim.isEmpty()) {
                        if (trim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(trim);
                            return parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                        }
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    }
                } else {
                    Util.closeQuietly(bufferedReader);
                    throw ParserException.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
            }
            arrayDeque.add(trim);
            return parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
        } finally {
            Util.closeQuietly(bufferedReader);
        }
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int skipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, read);
        for (int i = 0; i < 7; i++) {
            if (skipIgnorableWhitespace != "#EXTM3U".charAt(i)) {
                return false;
            }
            skipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, skipIgnorableWhitespace));
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0134, code lost:
    
        if (r5 > 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, String str) {
        char c;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        HlsMultivariantPlaylist.Variant variant;
        String str4;
        int i;
        int i2;
        int i3;
        Uri resolveToUri;
        String str5 = str;
        int i4 = 1;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith("#EXT")) {
                arrayList11.add(next);
            }
            boolean startsWith = next.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (next.startsWith("#EXT-X-DEFINE")) {
                hashMap2.put(parseStringAttr(next, REGEX_NAME, hashMap2), parseStringAttr(next, REGEX_VALUE, hashMap2));
            } else if (next.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                z = true;
            } else if (next.startsWith("#EXT-X-MEDIA")) {
                arrayList9.add(next);
            } else if (next.startsWith("#EXT-X-SESSION-KEY")) {
                DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, "identity", hashMap2), hashMap2);
                if (parseDrmSchemeData != null) {
                    String parseEncryptionScheme = parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, hashMap2));
                    DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[i4];
                    schemeDataArr[0] = parseDrmSchemeData;
                    arrayList10.add(new DrmInitData(parseEncryptionScheme, schemeDataArr));
                }
            } else if (next.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                z2 |= next.contains("CLOSED-CAPTIONS=NONE");
                int i5 = startsWith ? 16384 : 0;
                int parseIntAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                boolean z3 = z;
                int parseOptionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                String parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_CODECS, hashMap2);
                ArrayList arrayList12 = arrayList10;
                String parseOptionalStringAttr2 = parseOptionalStringAttr(next, REGEX_MIME, hashMap2);
                ArrayList arrayList13 = arrayList11;
                ArrayList arrayList14 = arrayList7;
                boolean equals = TextUtils.equals(parseOptionalStringAttr(next, REGEX_CACHED, hashMap2), "true");
                String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_DOC_ID, hashMap2);
                ArrayList arrayList15 = arrayList6;
                String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_DOC_FILENAME, hashMap2);
                ArrayList arrayList16 = arrayList5;
                String parseOptionalStringAttr5 = parseOptionalStringAttr(next, REGEX_ACCOUNT, hashMap2);
                ArrayList arrayList17 = arrayList9;
                String parseOptionalStringAttr6 = parseOptionalStringAttr(next, REGEX_RESOLUTION, hashMap2);
                HashMap hashMap3 = hashMap;
                if (parseOptionalStringAttr6 != null) {
                    String[] split = Util.split(parseOptionalStringAttr6, "x");
                    i3 = Integer.parseInt(split[0]);
                    i2 = Integer.parseInt(split[1]);
                    if (i3 > 0) {
                    }
                }
                i2 = -1;
                i3 = -1;
                ArrayList arrayList18 = arrayList4;
                String parseOptionalStringAttr7 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, hashMap2);
                float parseFloat = parseOptionalStringAttr7 != null ? Float.parseFloat(parseOptionalStringAttr7) : -1.0f;
                String parseOptionalStringAttr8 = parseOptionalStringAttr(next, REGEX_VIDEO, hashMap2);
                String parseOptionalStringAttr9 = parseOptionalStringAttr(next, REGEX_AUDIO, hashMap2);
                String parseOptionalStringAttr10 = parseOptionalStringAttr(next, REGEX_SUBTITLES, hashMap2);
                String parseOptionalStringAttr11 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, hashMap2);
                if (startsWith) {
                    resolveToUri = UriUtil.resolveToUri(str5, parseStringAttr(next, REGEX_URI, hashMap2));
                } else {
                    if (!lineIterator.hasNext()) {
                        throw ParserException.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    resolveToUri = UriUtil.resolveToUri(str5, replaceVariableReferences(lineIterator.next(), hashMap2));
                }
                Uri uri = resolveToUri;
                arrayList18.add(new HlsMultivariantPlaylist.Variant(uri, new Format.Builder().setId(arrayList18.size()).setContainerMimeType("application/x-mpegURL").setCodecs(parseOptionalStringAttr).setSampleMimeType(parseOptionalStringAttr2).setAverageBitrate(parseOptionalIntAttr).setPeakBitrate(parseIntAttr).setWidth(i3).setHeight(i2).setFrameRate(parseFloat).setRoleFlags(i5).setCached(equals).setDocumentId(parseOptionalStringAttr3).setDocumentFilename(parseOptionalStringAttr4).setCurrentAccount(parseOptionalStringAttr5).build(), parseOptionalStringAttr8, parseOptionalStringAttr9, parseOptionalStringAttr10, parseOptionalStringAttr11));
                hashMap = hashMap3;
                ArrayList arrayList19 = (ArrayList) hashMap.get(uri);
                if (arrayList19 == null) {
                    arrayList19 = new ArrayList();
                    hashMap.put(uri, arrayList19);
                }
                arrayList19.add(new HlsTrackMetadataEntry.VariantInfo(parseOptionalIntAttr, parseIntAttr, parseOptionalStringAttr8, parseOptionalStringAttr9, parseOptionalStringAttr10, parseOptionalStringAttr11));
                arrayList4 = arrayList18;
                z = z3;
                arrayList10 = arrayList12;
                arrayList11 = arrayList13;
                arrayList7 = arrayList14;
                arrayList6 = arrayList15;
                arrayList5 = arrayList16;
                arrayList9 = arrayList17;
                i4 = 1;
            }
        }
        ArrayList arrayList20 = arrayList4;
        ArrayList arrayList21 = arrayList5;
        ArrayList arrayList22 = arrayList6;
        ArrayList arrayList23 = arrayList7;
        boolean z4 = z;
        ArrayList arrayList24 = arrayList9;
        ArrayList arrayList25 = arrayList10;
        ArrayList arrayList26 = arrayList11;
        ArrayList arrayList27 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i6 = 0;
        while (i6 < arrayList20.size()) {
            HlsMultivariantPlaylist.Variant variant2 = (HlsMultivariantPlaylist.Variant) arrayList20.get(i6);
            if (hashSet.add(variant2.url)) {
                Assertions.checkState(variant2.format.metadata == null);
                i = 1;
                arrayList27.add(variant2.copyWithFormat(variant2.format.buildUpon().setMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull((ArrayList) hashMap.get(variant2.url))))).build()));
            } else {
                i = 1;
            }
            i6 += i;
        }
        Uri uri2 = null;
        ArrayList arrayList28 = null;
        Format format = null;
        int i7 = 0;
        while (i7 < arrayList24.size()) {
            ArrayList arrayList29 = arrayList24;
            String str6 = (String) arrayList29.get(i7);
            String parseStringAttr = parseStringAttr(str6, REGEX_GROUP_ID, hashMap2);
            String parseStringAttr2 = parseStringAttr(str6, REGEX_NAME, hashMap2);
            Format.Builder language = new Format.Builder().setId(parseStringAttr + ":" + parseStringAttr2).setLabel(parseStringAttr2).setContainerMimeType("application/x-mpegURL").setSelectionFlags(parseSelectionFlags(str6)).setRoleFlags(parseRoleFlags(str6, hashMap2)).setLanguage(parseOptionalStringAttr(str6, REGEX_LANGUAGE, hashMap2));
            String parseOptionalStringAttr12 = parseOptionalStringAttr(str6, REGEX_URI, hashMap2);
            Uri resolveToUri2 = parseOptionalStringAttr12 == null ? uri2 : UriUtil.resolveToUri(str5, parseOptionalStringAttr12);
            ArrayList arrayList30 = arrayList28;
            Metadata metadata = new Metadata(new HlsTrackMetadataEntry(parseStringAttr, parseStringAttr2, Collections.EMPTY_LIST));
            String parseStringAttr3 = parseStringAttr(str6, REGEX_TYPE, hashMap2);
            parseStringAttr3.getClass();
            switch (parseStringAttr3.hashCode()) {
                case -959297733:
                    if (parseStringAttr3.equals("SUBTITLES")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -333210994:
                    if (parseStringAttr3.equals("CLOSED-CAPTIONS")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 62628790:
                    if (parseStringAttr3.equals("AUDIO")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 81665115:
                    if (parseStringAttr3.equals("VIDEO")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    arrayList = arrayList22;
                    arrayList2 = arrayList21;
                    HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList20, parseStringAttr);
                    if (variantWithSubtitleGroup != null) {
                        String codecsOfType = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                        language.setCodecs(codecsOfType);
                        str2 = MimeTypes.getMediaMimeType(codecsOfType);
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = "text/vtt";
                    }
                    language.setSampleMimeType(str2).setMetadata(metadata);
                    if (resolveToUri2 != null) {
                        HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2);
                        arrayList3 = arrayList23;
                        arrayList3.add(rendition);
                    } else {
                        arrayList3 = arrayList23;
                        Log.w("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                    }
                    arrayList28 = arrayList30;
                    break;
                case 1:
                    arrayList = arrayList22;
                    arrayList2 = arrayList21;
                    String parseStringAttr4 = parseStringAttr(str6, REGEX_INSTREAM_ID, hashMap2);
                    if (parseStringAttr4.startsWith("CC")) {
                        parseInt = Integer.parseInt(parseStringAttr4.substring(2));
                        str3 = "application/cea-608";
                    } else {
                        parseInt = Integer.parseInt(parseStringAttr4.substring(7));
                        str3 = "application/cea-708";
                    }
                    ArrayList arrayList31 = arrayList30 == null ? new ArrayList() : arrayList30;
                    language.setSampleMimeType(str3).setAccessibilityChannel(parseInt);
                    arrayList31.add(language.build());
                    arrayList28 = arrayList31;
                    arrayList3 = arrayList23;
                    break;
                case 2:
                    arrayList2 = arrayList21;
                    HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList20, parseStringAttr);
                    if (variantWithAudioGroup != null) {
                        variant = variantWithAudioGroup;
                        String codecsOfType2 = Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1);
                        language.setCodecs(codecsOfType2);
                        str4 = MimeTypes.getMediaMimeType(codecsOfType2);
                    } else {
                        variant = variantWithAudioGroup;
                        str4 = null;
                    }
                    String parseOptionalStringAttr13 = parseOptionalStringAttr(str6, REGEX_CHANNELS, hashMap2);
                    if (parseOptionalStringAttr13 != null) {
                        language.setChannelCount(Integer.parseInt(Util.splitAtFirst(parseOptionalStringAttr13, "/")[0]));
                        if ("audio/eac3".equals(str4) && parseOptionalStringAttr13.endsWith("/JOC")) {
                            language.setCodecs("ec+3");
                            str4 = "audio/eac3-joc";
                        }
                    }
                    language.setSampleMimeType(str4);
                    if (resolveToUri2 == null) {
                        arrayList = arrayList22;
                        if (variant != null) {
                            format = language.build();
                            arrayList3 = arrayList23;
                            arrayList28 = arrayList30;
                            break;
                        }
                    } else {
                        language.setMetadata(metadata);
                        arrayList = arrayList22;
                        arrayList.add(new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                    }
                    arrayList3 = arrayList23;
                    arrayList28 = arrayList30;
                    break;
                case 3:
                    HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList20, parseStringAttr);
                    if (variantWithVideoGroup != null) {
                        Format format2 = variantWithVideoGroup.format;
                        String codecsOfType3 = Util.getCodecsOfType(format2.codecs, 2);
                        language.setCodecs(codecsOfType3).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType3)).setWidth(format2.width).setHeight(format2.height).setFrameRate(format2.frameRate);
                    }
                    if (resolveToUri2 != null) {
                        language.setMetadata(metadata);
                        arrayList2 = arrayList21;
                        arrayList2.add(new HlsMultivariantPlaylist.Rendition(resolveToUri2, language.build(), parseStringAttr, parseStringAttr2));
                        arrayList3 = arrayList23;
                        arrayList = arrayList22;
                        arrayList28 = arrayList30;
                        break;
                    }
                default:
                    arrayList3 = arrayList23;
                    arrayList = arrayList22;
                    arrayList2 = arrayList21;
                    arrayList28 = arrayList30;
                    break;
            }
            i7++;
            arrayList21 = arrayList2;
            arrayList24 = arrayList29;
            arrayList23 = arrayList3;
            arrayList22 = arrayList;
            uri2 = null;
            str5 = str;
        }
        return new HlsMultivariantPlaylist(str, arrayList26, arrayList27, arrayList21, arrayList22, arrayList23, arrayList8, format, z2 ? Collections.EMPTY_LIST : arrayList28, z4, hashMap2, arrayList25);
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = (HlsMultivariantPlaylist.Variant) arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = (HlsMultivariantPlaylist.Variant) arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = (HlsMultivariantPlaylist.Variant) arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x06d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HlsMediaPlaylist parseMediaPlaylist(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) {
        ArrayList arrayList;
        HlsMediaPlaylist.ServerControl serverControl;
        DrmInitData drmInitData;
        int i;
        String str2;
        String str3;
        long j;
        int i2;
        long j2;
        TreeMap treeMap;
        long j3;
        String str4;
        HlsMediaPlaylist.Segment segment;
        long j4;
        DrmInitData drmInitData2;
        HlsMediaPlaylist.Segment segment2;
        String str5;
        DrmInitData drmInitData3;
        DrmInitData drmInitData4;
        long j5;
        DrmInitData drmInitData5;
        Throwable th;
        String str6;
        long j6;
        HlsMultivariantPlaylist hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        boolean z = hlsMultivariantPlaylist2.hasIndependentSegments;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl2 = new HlsMediaPlaylist.ServerControl(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        boolean z2 = z;
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        String str7 = "";
        String str8 = str7;
        HlsMediaPlaylist.Part part = null;
        String str9 = null;
        DrmInitData drmInitData6 = null;
        int i3 = 0;
        Throwable th2 = null;
        DrmInitData drmInitData7 = null;
        String str10 = null;
        long j16 = -1;
        boolean z3 = false;
        int i4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        HlsMediaPlaylist.Segment segment3 = null;
        int i5 = 0;
        String str11 = null;
        long j17 = -1;
        boolean z7 = false;
        long j18 = -9223372036854775807L;
        long j19 = 0;
        int i6 = 1;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith("#EXT")) {
                arrayList5.add(next);
            }
            if (next.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String parseStringAttr = parseStringAttr(next, REGEX_PLAYLIST_TYPE, hashMap);
                if ("VOD".equals(parseStringAttr)) {
                    i4 = 1;
                } else if ("EVENT".equals(parseStringAttr)) {
                    i4 = 2;
                } else {
                    arrayList = arrayList5;
                    serverControl = serverControl2;
                    drmInitData = drmInitData6;
                    i = i3;
                    str2 = str7;
                    str3 = str10;
                    j = j10;
                    i2 = i5;
                    j2 = j13;
                    treeMap = treeMap2;
                    j3 = j9;
                    str4 = str8;
                    segment = segment3;
                    j4 = j14;
                }
            } else if (next.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (next.startsWith("#EXT-X-START")) {
                    ArrayList arrayList6 = arrayList5;
                    serverControl = serverControl2;
                    long parseDoubleAttr = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
                    z4 = parseOptionalBooleanAttribute(next, REGEX_PRECISE, false);
                    arrayList5 = arrayList6;
                    j8 = parseDoubleAttr;
                } else {
                    ArrayList arrayList7 = arrayList5;
                    serverControl = serverControl2;
                    if (next.startsWith("#EXT-X-SERVER-CONTROL")) {
                        serverControl2 = parseServerControl(next);
                        arrayList5 = arrayList7;
                    } else if (next.startsWith("#EXT-X-PART-INF")) {
                        j7 = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
                        arrayList5 = arrayList7;
                    } else if (next.startsWith("#EXT-X-MAP")) {
                        String parseStringAttr2 = parseStringAttr(next, REGEX_URI, hashMap);
                        String parseOptionalStringAttr = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap);
                        if (parseOptionalStringAttr != null) {
                            String[] split = Util.split(parseOptionalStringAttr, "@");
                            j16 = Long.parseLong(split[0]);
                            if (split.length > 1) {
                                j9 = Long.parseLong(split[1]);
                            }
                        }
                        long j20 = j16;
                        if (j20 == j17) {
                            j9 = 0;
                        }
                        if (str11 == null) {
                            th = th2;
                            str6 = parseStringAttr2;
                            j6 = j9;
                        } else {
                            if (str10 == null) {
                                throw ParserException.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", th2);
                            }
                            str6 = parseStringAttr2;
                            j6 = j9;
                            th = th2;
                        }
                        HlsMediaPlaylist.Segment segment4 = new HlsMediaPlaylist.Segment(str6, j6, j20, str11, str10);
                        if (j20 != j17) {
                            j6 += j20;
                        }
                        th2 = th;
                        arrayList5 = arrayList7;
                        segment3 = segment4;
                        j9 = j6;
                        j16 = j17;
                    } else {
                        arrayList = arrayList7;
                        drmInitData = drmInitData6;
                        str3 = str10;
                        String str12 = str11;
                        if (next.startsWith("#EXT-X-TARGETDURATION")) {
                            i = i3;
                            j18 = 1000000 * parseIntAttr(next, REGEX_TARGET_DURATION);
                        } else {
                            i = i3;
                            if (next.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j13 = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                                str10 = str3;
                                str11 = str12;
                                drmInitData6 = drmInitData;
                                j19 = j13;
                                serverControl2 = serverControl;
                                arrayList5 = arrayList;
                                i3 = i;
                                th2 = null;
                            } else if (next.startsWith("#EXT-X-VERSION")) {
                                i6 = parseIntAttr(next, REGEX_VERSION);
                            } else {
                                if (next.startsWith("#EXT-X-DEFINE")) {
                                    String parseOptionalStringAttr2 = parseOptionalStringAttr(next, REGEX_IMPORT, hashMap);
                                    if (parseOptionalStringAttr2 != null) {
                                        String str13 = (String) hlsMultivariantPlaylist2.variableDefinitions.get(parseOptionalStringAttr2);
                                        if (str13 != null) {
                                            hashMap.put(parseOptionalStringAttr2, str13);
                                        }
                                    } else {
                                        hashMap.put(parseStringAttr(next, REGEX_NAME, hashMap), parseStringAttr(next, REGEX_VALUE, hashMap));
                                    }
                                    treeMap = treeMap2;
                                    str11 = str12;
                                    str2 = str7;
                                } else if (next.startsWith("#EXTINF")) {
                                    j14 = parseTimeSecondsToUs(next, REGEX_MEDIA_DURATION);
                                    str8 = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str7, hashMap);
                                } else {
                                    String str14 = str7;
                                    if (next.startsWith("#EXT-X-SKIP")) {
                                        int parseIntAttr = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                                        Assertions.checkState(hlsMediaPlaylist2 != null && arrayList2.isEmpty());
                                        int i7 = (int) (j19 - ((HlsMediaPlaylist) Util.castNonNull(hlsMediaPlaylist2)).mediaSequence);
                                        int i8 = parseIntAttr + i7;
                                        if (i7 < 0 || i8 > hlsMediaPlaylist2.segments.size()) {
                                            throw new DeltaUpdateException();
                                        }
                                        str10 = str3;
                                        str11 = str12;
                                        DrmInitData drmInitData8 = drmInitData;
                                        long j21 = j10;
                                        while (i7 < i8) {
                                            HlsMediaPlaylist.Segment segment5 = (HlsMediaPlaylist.Segment) hlsMediaPlaylist2.segments.get(i7);
                                            int i9 = i7;
                                            if (j19 != hlsMediaPlaylist2.mediaSequence) {
                                                segment5 = segment5.copyWith(j21, (hlsMediaPlaylist2.discontinuitySequence - i) + segment5.relativeDiscontinuitySequence);
                                            }
                                            arrayList2.add(segment5);
                                            j12 = j21 + segment5.durationUs;
                                            long j22 = segment5.byteRangeLength;
                                            if (j22 != j17) {
                                                j9 = segment5.byteRangeOffset + j22;
                                            }
                                            int i10 = segment5.relativeDiscontinuitySequence;
                                            HlsMediaPlaylist.Segment segment6 = segment5.initializationSegment;
                                            DrmInitData drmInitData9 = segment5.drmInitData;
                                            String str15 = segment5.fullSegmentEncryptionKeyUri;
                                            String str16 = segment5.encryptionIV;
                                            if (str16 == null || !str16.equals(Long.toHexString(j13))) {
                                                str10 = segment5.encryptionIV;
                                            }
                                            j13++;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            i5 = i10;
                                            segment3 = segment6;
                                            drmInitData8 = drmInitData9;
                                            str11 = str15;
                                            j21 = j12;
                                            i7 = i9 + 1;
                                        }
                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                        j10 = j21;
                                        serverControl2 = serverControl;
                                        i3 = i;
                                        str7 = str14;
                                        th2 = null;
                                        drmInitData6 = drmInitData8;
                                        arrayList5 = arrayList;
                                    } else {
                                        str2 = str14;
                                        if (next.startsWith("#EXT-X-KEY")) {
                                            String parseStringAttr3 = parseStringAttr(next, REGEX_METHOD, hashMap);
                                            String parseOptionalStringAttr3 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, "identity", hashMap);
                                            if ("NONE".equals(parseStringAttr3)) {
                                                treeMap2.clear();
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                serverControl2 = serverControl;
                                                arrayList5 = arrayList;
                                                i3 = i;
                                                str7 = str2;
                                                drmInitData6 = null;
                                                th2 = null;
                                                str10 = null;
                                            } else {
                                                str10 = parseOptionalStringAttr(next, REGEX_IV, hashMap);
                                                if ("identity".equals(parseOptionalStringAttr3)) {
                                                    if ("AES-128".equals(parseStringAttr3)) {
                                                        str11 = parseStringAttr(next, REGEX_URI, hashMap);
                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                        drmInitData6 = drmInitData;
                                                        serverControl2 = serverControl;
                                                        arrayList5 = arrayList;
                                                        i3 = i;
                                                        str7 = str2;
                                                    }
                                                } else {
                                                    if (str9 == null) {
                                                        str9 = parseEncryptionScheme(parseStringAttr3);
                                                    }
                                                    DrmInitData.SchemeData parseDrmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr3, hashMap);
                                                    if (parseDrmSchemeData != null) {
                                                        treeMap2.put(parseOptionalStringAttr3, parseDrmSchemeData);
                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                        serverControl2 = serverControl;
                                                        arrayList5 = arrayList;
                                                        i3 = i;
                                                        str7 = str2;
                                                        drmInitData6 = null;
                                                        th2 = null;
                                                    }
                                                }
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                drmInitData6 = drmInitData;
                                                serverControl2 = serverControl;
                                                arrayList5 = arrayList;
                                                i3 = i;
                                                str7 = str2;
                                                th2 = null;
                                            }
                                            str11 = null;
                                        } else {
                                            if (next.startsWith("#EXT-X-BYTERANGE")) {
                                                String[] split2 = Util.split(parseStringAttr(next, REGEX_BYTERANGE, hashMap), "@");
                                                j16 = Long.parseLong(split2[0]);
                                                if (split2.length > 1) {
                                                    j9 = Long.parseLong(split2[1]);
                                                }
                                            } else if (next.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                i3 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                str10 = str3;
                                                str11 = str12;
                                                drmInitData6 = drmInitData;
                                                serverControl2 = serverControl;
                                                arrayList5 = arrayList;
                                                str7 = str2;
                                                th2 = null;
                                                z5 = true;
                                            } else if (next.equals("#EXT-X-DISCONTINUITY")) {
                                                i5++;
                                            } else {
                                                if (next.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                    if (j11 == 0) {
                                                        j11 = Util.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + 1))) - j10;
                                                    }
                                                } else if (next.equals("#EXT-X-GAP")) {
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    str10 = str3;
                                                    str11 = str12;
                                                    drmInitData6 = drmInitData;
                                                    serverControl2 = serverControl;
                                                    arrayList5 = arrayList;
                                                    i3 = i;
                                                    str7 = str2;
                                                    th2 = null;
                                                    z3 = true;
                                                } else if (next.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    str10 = str3;
                                                    str11 = str12;
                                                    drmInitData6 = drmInitData;
                                                    serverControl2 = serverControl;
                                                    arrayList5 = arrayList;
                                                    i3 = i;
                                                    str7 = str2;
                                                    z2 = true;
                                                } else if (next.equals("#EXT-X-ENDLIST")) {
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    str10 = str3;
                                                    str11 = str12;
                                                    drmInitData6 = drmInitData;
                                                    serverControl2 = serverControl;
                                                    arrayList5 = arrayList;
                                                    i3 = i;
                                                    str7 = str2;
                                                    th2 = null;
                                                    z6 = true;
                                                } else if (next.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                    arrayList4.add(new HlsMediaPlaylist.RenditionReport(Uri.parse(UriUtil.resolve(str, parseStringAttr(next, REGEX_URI, hashMap))), parseOptionalLongAttr(next, REGEX_LAST_MSN, j17), parseOptionalIntAttr(next, REGEX_LAST_PART, -1)));
                                                } else {
                                                    if (next.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                        if (part == null && "PART".equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, hashMap))) {
                                                            String parseStringAttr4 = parseStringAttr(next, REGEX_URI, hashMap);
                                                            TreeMap treeMap3 = treeMap2;
                                                            long parseOptionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L);
                                                            long parseOptionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L);
                                                            long j23 = j13;
                                                            String segmentEncryptionIV = getSegmentEncryptionIV(j23, str12, str3);
                                                            if (drmInitData != null || treeMap3.isEmpty()) {
                                                                drmInitData2 = drmInitData;
                                                            } else {
                                                                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap3.values().toArray(new DrmInitData.SchemeData[0]);
                                                                DrmInitData drmInitData10 = new DrmInitData(str9, schemeDataArr);
                                                                if (drmInitData7 == null) {
                                                                    drmInitData7 = getPlaylistProtectionSchemes(str9, schemeDataArr);
                                                                }
                                                                drmInitData2 = drmInitData10;
                                                            }
                                                            if (parseOptionalLongAttr == -1 || parseOptionalLongAttr2 != -1) {
                                                                str11 = str12;
                                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                str10 = str3;
                                                                j13 = j23;
                                                                part = new HlsMediaPlaylist.Part(parseStringAttr4, segment3, 0L, i5, j12, drmInitData2, str11, segmentEncryptionIV, parseOptionalLongAttr != -1 ? parseOptionalLongAttr : 0L, parseOptionalLongAttr2, false, false, true);
                                                            } else {
                                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                str10 = str3;
                                                                j13 = j23;
                                                                str11 = str12;
                                                            }
                                                            drmInitData6 = drmInitData2;
                                                            serverControl2 = serverControl;
                                                            arrayList5 = arrayList;
                                                            i3 = i;
                                                            str7 = str2;
                                                            th2 = null;
                                                            j17 = -1;
                                                            treeMap2 = treeMap3;
                                                        }
                                                    } else {
                                                        treeMap = treeMap2;
                                                        j2 = j13;
                                                        if (next.startsWith("#EXT-X-PART")) {
                                                            String segmentEncryptionIV2 = getSegmentEncryptionIV(j2, str12, str3);
                                                            String parseStringAttr5 = parseStringAttr(next, REGEX_URI, hashMap);
                                                            long parseDoubleAttr2 = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                                            boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z2 && arrayList3.isEmpty());
                                                            boolean parseOptionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                                            String parseOptionalStringAttr4 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, hashMap);
                                                            if (parseOptionalStringAttr4 != null) {
                                                                String[] split3 = Util.split(parseOptionalStringAttr4, "@");
                                                                long parseLong = Long.parseLong(split3[0]);
                                                                if (split3.length > 1) {
                                                                    j15 = Long.parseLong(split3[1]);
                                                                }
                                                                j5 = parseLong;
                                                            } else {
                                                                j5 = -1;
                                                            }
                                                            long j24 = j5 == -1 ? 0L : j15;
                                                            if (drmInitData != null || treeMap.isEmpty()) {
                                                                drmInitData5 = drmInitData;
                                                            } else {
                                                                DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                DrmInitData drmInitData11 = new DrmInitData(str9, schemeDataArr2);
                                                                if (drmInitData7 == null) {
                                                                    drmInitData7 = getPlaylistProtectionSchemes(str9, schemeDataArr2);
                                                                }
                                                                drmInitData5 = drmInitData11;
                                                            }
                                                            HlsMediaPlaylist.Part part2 = new HlsMediaPlaylist.Part(parseStringAttr5, segment3, parseDoubleAttr2, i5, j12, drmInitData5, str12, segmentEncryptionIV2, j24, j5, parseOptionalBooleanAttribute2, parseOptionalBooleanAttribute, false);
                                                            HlsMediaPlaylist.Segment segment7 = segment3;
                                                            int i11 = i5;
                                                            arrayList3.add(part2);
                                                            j12 += parseDoubleAttr2;
                                                            if (j5 != -1) {
                                                                j15 = j24 + j5;
                                                                j13 = j2;
                                                                str10 = str3;
                                                                segment3 = segment7;
                                                                str11 = str12;
                                                                treeMap2 = treeMap;
                                                                i5 = i11;
                                                                drmInitData6 = drmInitData5;
                                                            } else {
                                                                j13 = j2;
                                                                str10 = str3;
                                                                segment3 = segment7;
                                                                str11 = str12;
                                                                treeMap2 = treeMap;
                                                                i5 = i11;
                                                                drmInitData6 = drmInitData5;
                                                                j15 = j24;
                                                            }
                                                            serverControl2 = serverControl;
                                                            arrayList5 = arrayList;
                                                            i3 = i;
                                                            str7 = str2;
                                                            th2 = null;
                                                            j17 = -1;
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        } else {
                                                            segment = segment3;
                                                            i2 = i5;
                                                            if (next.startsWith("#")) {
                                                                str11 = str12;
                                                                j3 = j9;
                                                                j = j10;
                                                                str4 = str8;
                                                                j4 = j14;
                                                            } else {
                                                                long j25 = j10;
                                                                String segmentEncryptionIV3 = getSegmentEncryptionIV(j2, str12, str3);
                                                                j13 = j2 + 1;
                                                                String replaceVariableReferences = replaceVariableReferences(next, hashMap);
                                                                HlsMediaPlaylist.Segment segment8 = (HlsMediaPlaylist.Segment) hashMap2.get(replaceVariableReferences);
                                                                if (j16 == -1) {
                                                                    segment2 = segment8;
                                                                    j9 = 0;
                                                                } else if (z7 && segment == null && segment8 == null) {
                                                                    HlsMediaPlaylist.Segment segment9 = new HlsMediaPlaylist.Segment(replaceVariableReferences, 0L, j9, null, null);
                                                                    hashMap2.put(replaceVariableReferences, segment9);
                                                                    segment2 = segment9;
                                                                } else {
                                                                    segment2 = segment8;
                                                                    j9 = j9;
                                                                }
                                                                if (drmInitData != null || treeMap.isEmpty()) {
                                                                    str5 = replaceVariableReferences;
                                                                    drmInitData3 = drmInitData;
                                                                } else {
                                                                    str5 = replaceVariableReferences;
                                                                    DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                                    DrmInitData drmInitData12 = new DrmInitData(str9, schemeDataArr3);
                                                                    if (drmInitData7 == null) {
                                                                        drmInitData4 = getPlaylistProtectionSchemes(str9, schemeDataArr3);
                                                                        drmInitData3 = drmInitData12;
                                                                        long j26 = j9;
                                                                        long j27 = j14;
                                                                        str11 = str12;
                                                                        arrayList2.add(new HlsMediaPlaylist.Segment(str5, segment == null ? segment : segment2, str8, j27, i2, j25, drmInitData3, str12, segmentEncryptionIV3, j26, j16, z3, arrayList3));
                                                                        j12 = j25 + j27;
                                                                        arrayList3 = new ArrayList();
                                                                        j9 = j16 == -1 ? j26 + j16 : j26;
                                                                        hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                        drmInitData7 = drmInitData4;
                                                                        str10 = str3;
                                                                        segment3 = segment;
                                                                        treeMap2 = treeMap;
                                                                        i5 = i2;
                                                                        drmInitData6 = drmInitData3;
                                                                        j14 = 0;
                                                                        j10 = j12;
                                                                        serverControl2 = serverControl;
                                                                        arrayList5 = arrayList;
                                                                        i3 = i;
                                                                        str7 = str2;
                                                                        str8 = str7;
                                                                        th2 = null;
                                                                        j16 = -1;
                                                                        z3 = false;
                                                                        j17 = -1;
                                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                    } else {
                                                                        drmInitData3 = drmInitData12;
                                                                    }
                                                                }
                                                                drmInitData4 = drmInitData7;
                                                                long j262 = j9;
                                                                long j272 = j14;
                                                                str11 = str12;
                                                                arrayList2.add(new HlsMediaPlaylist.Segment(str5, segment == null ? segment : segment2, str8, j272, i2, j25, drmInitData3, str12, segmentEncryptionIV3, j262, j16, z3, arrayList3));
                                                                j12 = j25 + j272;
                                                                arrayList3 = new ArrayList();
                                                                if (j16 == -1) {
                                                                }
                                                                hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                                drmInitData7 = drmInitData4;
                                                                str10 = str3;
                                                                segment3 = segment;
                                                                treeMap2 = treeMap;
                                                                i5 = i2;
                                                                drmInitData6 = drmInitData3;
                                                                j14 = 0;
                                                                j10 = j12;
                                                                serverControl2 = serverControl;
                                                                arrayList5 = arrayList;
                                                                i3 = i;
                                                                str7 = str2;
                                                                str8 = str7;
                                                                th2 = null;
                                                                j16 = -1;
                                                                z3 = false;
                                                                j17 = -1;
                                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            }
                                                        }
                                                    }
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                }
                                                treeMap = treeMap2;
                                                str11 = str12;
                                            }
                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                            str10 = str3;
                                            str11 = str12;
                                            drmInitData6 = drmInitData;
                                            serverControl2 = serverControl;
                                            arrayList5 = arrayList;
                                            i3 = i;
                                            str7 = str2;
                                        }
                                        th2 = null;
                                    }
                                }
                                j = j10;
                                segment = segment3;
                                i2 = i5;
                                j2 = j13;
                                j3 = j9;
                                str4 = str8;
                                j4 = j14;
                            }
                        }
                        str10 = str3;
                        str11 = str12;
                        drmInitData6 = drmInitData;
                        serverControl2 = serverControl;
                        arrayList5 = arrayList;
                        i3 = i;
                        th2 = null;
                    }
                }
                serverControl2 = serverControl;
            }
            j13 = j2;
            str10 = str3;
            segment3 = segment;
            treeMap2 = treeMap;
            drmInitData6 = drmInitData;
            str8 = str4;
            j14 = j4;
            j10 = j;
            j9 = j3;
            serverControl2 = serverControl;
            arrayList5 = arrayList;
            i3 = i;
            str7 = str2;
            th2 = null;
            j17 = -1;
            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
            hlsMediaPlaylist2 = hlsMediaPlaylist;
            i5 = i2;
        }
        ArrayList arrayList8 = arrayList5;
        HlsMediaPlaylist.ServerControl serverControl3 = serverControl2;
        int i12 = i3;
        HashMap hashMap3 = new HashMap();
        for (int i13 = 0; i13 < arrayList4.size(); i13++) {
            HlsMediaPlaylist.RenditionReport renditionReport = (HlsMediaPlaylist.RenditionReport) arrayList4.get(i13);
            long j28 = renditionReport.lastMediaSequence;
            if (j28 == -1) {
                j28 = (j19 + arrayList2.size()) - (arrayList3.isEmpty() ? 1L : 0L);
            }
            int i14 = renditionReport.lastPartIndex;
            if (i14 == -1 && j7 != -9223372036854775807L) {
                i14 = (arrayList3.isEmpty() ? ((HlsMediaPlaylist.Segment) Iterables.getLast(arrayList2)).parts : arrayList3).size() - 1;
            }
            Uri uri = renditionReport.playlistUri;
            hashMap3.put(uri, new HlsMediaPlaylist.RenditionReport(uri, j28, i14));
        }
        if (part != null) {
            arrayList3.add(part);
        }
        return new HlsMediaPlaylist(i4, str, arrayList8, j8, z4, j11, z5, i12, j19, i6, j18, j7, z2, z6, j11 != 0, drmInitData7, arrayList2, arrayList3, serverControl3, hashMap3);
    }

    private static DrmInitData getPlaylistProtectionSchemes(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i = 0; i < schemeDataArr.length; i++) {
            schemeDataArr2[i] = schemeDataArr[i].copyWithData(null);
        }
        return new DrmInitData(str, schemeDataArr2);
    }

    private static String getSegmentEncryptionIV(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int parseSelectionFlags(String str) {
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r0 = parseOptionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r0 = (parseOptionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r0 | 4 : r0;
    }

    private static int parseRoleFlags(String str, Map map) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(parseOptionalStringAttr)) {
            return 0;
        }
        String[] split = Util.split(parseOptionalStringAttr, ",");
        int i = Util.contains(split, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(split, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.contains(split, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return Util.contains(split, "public.easy-to-read") ? i | 8192 : i;
    }

    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map map) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String parseStringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "video/mp4", Base64.decode(parseStringAttr.substring(parseStringAttr.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", Util.getUtf8Bytes(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(parseOptionalStringAttr)) {
            return null;
        }
        String parseStringAttr2 = parseStringAttr(str, REGEX_URI, map);
        byte[] decode = Base64.decode(parseStringAttr2.substring(parseStringAttr2.indexOf(44)), 0);
        UUID uuid = C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, "video/mp4", PsshAtomUtil.buildPsshAtom(uuid, decode));
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double parseOptionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j = parseOptionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr * 1000000.0d);
        boolean parseOptionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double parseOptionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j2 = parseOptionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (parseOptionalDoubleAttr2 * 1000000.0d);
        double parseOptionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        return new HlsMediaPlaylist.ServerControl(j, parseOptionalBooleanAttribute, j2, parseOptionalDoubleAttr3 != -9.223372036854776E18d ? (long) (parseOptionalDoubleAttr3 * 1000000.0d) : -9223372036854775807L, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static String parseEncryptionScheme(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int parseIntAttr(String str, Pattern pattern) {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))) : i;
    }

    private static long parseLongAttr(String str, Pattern pattern) {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) Assertions.checkNotNull(matcher.group(1))) : j;
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern) {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static double parseDoubleAttr(String str, Pattern pattern) {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map map) {
        String parseOptionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (parseOptionalStringAttr != null) {
            return parseOptionalStringAttr;
        }
        throw ParserException.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, Map map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) Assertions.checkNotNull(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) Assertions.checkNotNull(matcher.group(1))) : d;
    }

    private static String replaceVariableReferences(String str, Map map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z;
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static class LineIterator {
        private final Queue extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        public boolean hasNext() {
            String trim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull((String) this.extraLines.poll());
                return true;
            }
            do {
                String readLine = this.reader.readLine();
                this.next = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.next = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String next() {
            if (hasNext()) {
                String str = this.next;
                this.next = null;
                return str;
            }
            throw new NoSuchElementException();
        }
    }
}
