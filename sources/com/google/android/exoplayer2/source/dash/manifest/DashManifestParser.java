package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser {
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    private static long getFinalAvailabilityTimeOffset(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() != 2 || !"MPD".equals(newPullParser.getName())) {
                throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
            }
            return parseMediaPresentationDescription(newPullParser, uri);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01c8 A[LOOP:0: B:18:0x00a4->B:26:0x01c8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j;
        ArrayList arrayList3;
        Throwable th;
        long j2;
        DashManifestParser dashManifestParser = this;
        boolean isDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long parseDateTime = parseDateTime(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long parseDuration = parseDuration(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long parseDuration2 = parseDuration(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean equals = "dynamic".equals(xmlPullParser.getAttributeValue(null, TeXSymbolParser.TYPE_ATTR));
        long parseDuration3 = equals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration4 = equals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long parseDuration5 = equals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long parseDateTime2 = parseDateTime(xmlPullParser, "publishTime", -9223372036854775807L);
        long j3 = equals ? 0L : -9223372036854775807L;
        boolean z = false;
        ArrayList newArrayList = Lists.newArrayList(new BaseUrl(uri.toString(), uri.toString(), isDvbProfileDeclared ? 1 : TLObject.FLAG_31, 1));
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        long j4 = equals ? -9223372036854775807L : 0L;
        long j5 = j3;
        ProgramInformation programInformation = null;
        boolean z2 = false;
        UtcTimingElement utcTimingElement = null;
        Uri uri2 = null;
        ServiceDescriptionElement serviceDescriptionElement = null;
        while (true) {
            xmlPullParser.next();
            ArrayList arrayList6 = arrayList4;
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (!z) {
                    j5 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, j5);
                    z = true;
                }
                arrayList5.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, newArrayList, isDvbProfileDeclared));
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                programInformation = parseProgramInformation(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                utcTimingElement = parseUtcTiming(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Location")) {
                uri2 = UriUtil.resolveToUri(uri.toString(), xmlPullParser.nextText());
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ServiceDescription")) {
                serviceDescriptionElement = parseServiceDescription(xmlPullParser);
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "Period") && !z2) {
                    arrayList2 = arrayList5;
                    j = j4;
                    long j6 = j5;
                    ArrayList arrayList7 = newArrayList;
                    if (!arrayList5.isEmpty()) {
                        newArrayList = arrayList2;
                    }
                    Pair parsePeriod = parsePeriod(xmlPullParser, newArrayList, j, j6, parseDateTime, parseDuration4, isDvbProfileDeclared);
                    Period period = (Period) parsePeriod.first;
                    arrayList = arrayList7;
                    if (period.startMs != -9223372036854775807L) {
                        long longValue = ((Long) parsePeriod.second).longValue();
                        long j7 = longValue == -9223372036854775807L ? -9223372036854775807L : period.startMs + longValue;
                        arrayList3 = arrayList6;
                        arrayList3.add(period);
                        long j8 = j7;
                        j5 = j6;
                        j4 = j8;
                        if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                            if (parseDuration == -9223372036854775807L) {
                                if (j4 != -9223372036854775807L) {
                                    j2 = j4;
                                    th = null;
                                    if (!arrayList3.isEmpty()) {
                                        throw ParserException.createForMalformedManifest("No periods found.", th);
                                    }
                                    return buildMediaPresentationDescription(parseDateTime, j2, parseDuration2, equals, parseDuration3, parseDuration4, parseDuration5, parseDateTime2, programInformation, utcTimingElement, serviceDescriptionElement, uri2, arrayList3);
                                }
                                if (!equals) {
                                    throw ParserException.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                                }
                            }
                            th = null;
                            j2 = parseDuration;
                            if (!arrayList3.isEmpty()) {
                            }
                        } else {
                            uri2 = uri2;
                            parseDuration3 = parseDuration3;
                            parseDuration4 = parseDuration4;
                            parseDuration5 = parseDuration5;
                            parseDateTime2 = parseDateTime2;
                            dashManifestParser = this;
                            utcTimingElement = utcTimingElement;
                            parseDuration2 = parseDuration2;
                            equals = equals;
                            arrayList5 = arrayList2;
                            arrayList4 = arrayList3;
                            newArrayList = arrayList;
                        }
                    } else {
                        if (!equals) {
                            throw ParserException.createForMalformedManifest("Unable to determine start of period " + arrayList6.size(), null);
                        }
                        j5 = j6;
                        arrayList3 = arrayList6;
                        z2 = true;
                    }
                } else {
                    arrayList = newArrayList;
                    arrayList2 = arrayList5;
                    j = j4;
                    arrayList3 = arrayList6;
                    maybeSkipTag(xmlPullParser);
                    j5 = j5;
                }
                j4 = j;
                if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                }
            }
            arrayList = newArrayList;
            arrayList2 = arrayList5;
            arrayList3 = arrayList6;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
            }
        }
    }

    protected DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, ProgramInformation programInformation, UtcTimingElement utcTimingElement, ServiceDescriptionElement serviceDescriptionElement, Uri uri, List list) {
        return new DashManifest(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    protected UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    protected UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    protected ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, "target", -9223372036854775807L);
                j2 = parseLong(xmlPullParser, "min", -9223372036854775807L);
                j3 = parseLong(xmlPullParser, "max", -9223372036854775807L);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "PlaybackRate")) {
                f = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f2 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    protected android.util.Pair parsePeriod(org.xmlpull.v1.XmlPullParser r33, java.util.List r34, long r35, long r37, long r39, long r41, boolean r43) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.DashManifestParser.parsePeriod(org.xmlpull.v1.XmlPullParser, java.util.List, long, long, long, long, boolean):android.util.Pair");
    }

    protected Period buildPeriod(String str, long j, List list, List list2, Descriptor descriptor) {
        return new Period(str, j, list, list2, descriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0368 A[LOOP:0: B:2:0x0090->B:11:0x0368, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0323 A[EDGE_INSN: B:12:0x0323->B:13:0x0323 BREAK  A[LOOP:0: B:2:0x0090->B:11:0x0368], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, List list, SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) {
        ArrayList arrayList;
        String str;
        String str2;
        ArrayList arrayList2;
        SegmentBase segmentBase2;
        long j6;
        long j7;
        float f;
        ArrayList arrayList3;
        int i;
        ArrayList arrayList4;
        int i2;
        ArrayList arrayList5;
        int i3;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        SegmentBase parseSegmentTemplate;
        List list2;
        int i4;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String str3;
        int i5;
        long j8;
        long j9;
        XmlPullParser xmlPullParser2;
        boolean z2;
        String str4;
        String str5;
        int i6;
        DashManifestParser dashManifestParser;
        float f2;
        DashManifestParser dashManifestParser2 = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        int parseInt = parseInt(xmlPullParser3, "id", -1);
        int parseContentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser3.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser3.getAttributeValue(null, "codecs");
        int parseInt2 = parseInt(xmlPullParser3, "width", -1);
        int parseInt3 = parseInt(xmlPullParser3, "height", -1);
        float parseFrameRate = parseFrameRate(xmlPullParser3, -1.0f);
        int parseInt4 = parseInt(xmlPullParser3, "audioSamplingRate", -1);
        String str6 = "lang";
        String attributeValue3 = xmlPullParser3.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser3.getAttributeValue(null, "label");
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = arrayList12;
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        String str7 = attributeValue2;
        int i7 = parseContentType;
        long j10 = j3;
        ArrayList arrayList20 = arrayList18;
        int i8 = parseInt2;
        int i9 = parseInt3;
        float f3 = parseFrameRate;
        String str8 = attributeValue4;
        String str9 = attributeValue3;
        int i10 = -1;
        boolean z3 = false;
        String str10 = null;
        SegmentBase segmentBase3 = segmentBase;
        String str11 = attributeValue;
        long j11 = j2;
        while (true) {
            xmlPullParser3.next();
            float f4 = f3;
            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j11 = dashManifestParser2.parseAvailabilityTimeOffsetUs(xmlPullParser3, j11);
                    z3 = true;
                }
                arrayList19.addAll(dashManifestParser2.parseBaseUrl(xmlPullParser3, list, z));
                j11 = j11;
                arrayList = arrayList19;
                str2 = str6;
                arrayList2 = arrayList11;
                parseSegmentTemplate = segmentBase3;
                arrayList6 = arrayList20;
                arrayList8 = arrayList16;
            } else {
                long j12 = j11;
                if (XmlPullParserUtil.isStartTag(xmlPullParser3, "ContentProtection")) {
                    Pair parseContentProtection = parseContentProtection(xmlPullParser);
                    Object obj = parseContentProtection.first;
                    if (obj != null) {
                        str10 = (String) obj;
                    }
                    Object obj2 = parseContentProtection.second;
                    if (obj2 != null) {
                        arrayList11.add((DrmInitData.SchemeData) obj2);
                    }
                    arrayList = arrayList19;
                    str2 = str6;
                    arrayList2 = arrayList11;
                    parseSegmentTemplate = segmentBase3;
                    arrayList6 = arrayList20;
                    arrayList8 = arrayList16;
                    j11 = j12;
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser3, "ContentComponent")) {
                        String checkLanguageConsistency = checkLanguageConsistency(str9, xmlPullParser3.getAttributeValue(null, str6));
                        i7 = checkContentTypeConsistency(i7, parseContentType(xmlPullParser));
                        arrayList = arrayList19;
                        str9 = checkLanguageConsistency;
                    } else {
                        if (XmlPullParserUtil.isStartTag(xmlPullParser3, "Role")) {
                            arrayList14.add(parseDescriptor(xmlPullParser3, "Role"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "AudioChannelConfiguration")) {
                            arrayList = arrayList19;
                            i10 = parseAudioChannelConfiguration(xmlPullParser);
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "Accessibility")) {
                            arrayList13.add(parseDescriptor(xmlPullParser3, "Accessibility"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "EssentialProperty")) {
                            arrayList15.add(parseDescriptor(xmlPullParser3, "EssentialProperty"));
                        } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SupplementalProperty")) {
                            arrayList17.add(parseDescriptor(xmlPullParser3, "SupplementalProperty"));
                        } else {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "Representation")) {
                                arrayList = arrayList19;
                                arrayList2 = arrayList11;
                                ArrayList arrayList21 = arrayList15;
                                if (arrayList19.isEmpty()) {
                                    list2 = list;
                                    i4 = i7;
                                    str2 = str6;
                                    arrayList9 = arrayList20;
                                    arrayList10 = arrayList16;
                                    str3 = str7;
                                    i5 = i8;
                                    j8 = j12;
                                    j9 = j;
                                    xmlPullParser2 = xmlPullParser3;
                                    z2 = z;
                                    str4 = str9;
                                    str5 = str11;
                                    i6 = i9;
                                    dashManifestParser = this;
                                    f2 = f4;
                                } else {
                                    list2 = arrayList;
                                    f2 = f4;
                                    i4 = i7;
                                    str2 = str6;
                                    arrayList9 = arrayList20;
                                    arrayList10 = arrayList16;
                                    str3 = str7;
                                    i5 = i8;
                                    j8 = j12;
                                    j9 = j;
                                    xmlPullParser2 = xmlPullParser3;
                                    z2 = z;
                                    str4 = str9;
                                    str5 = str11;
                                    i6 = i9;
                                    dashManifestParser = this;
                                }
                                RepresentationInfo parseRepresentation = dashManifestParser.parseRepresentation(xmlPullParser2, list2, str5, str3, i5, i6, f2, i10, parseInt4, str4, arrayList14, arrayList13, arrayList21, arrayList17, segmentBase3, j4, j9, j8, j10, j5, z2);
                                str11 = str5;
                                i9 = i6;
                                arrayList5 = arrayList14;
                                arrayList3 = arrayList21;
                                SegmentBase segmentBase4 = segmentBase3;
                                f = f2;
                                arrayList4 = arrayList13;
                                ArrayList arrayList22 = arrayList17;
                                long j13 = j8;
                                str7 = str3;
                                i8 = i5;
                                i2 = parseInt4;
                                long j14 = j10;
                                int i11 = i10;
                                int checkContentTypeConsistency = checkContentTypeConsistency(i4, MimeTypes.getTrackType(parseRepresentation.format.sampleMimeType));
                                ArrayList arrayList23 = arrayList9;
                                arrayList23.add(parseRepresentation);
                                xmlPullParser3 = xmlPullParser2;
                                arrayList6 = arrayList23;
                                arrayList7 = arrayList22;
                                i10 = i11;
                                arrayList8 = arrayList10;
                                j10 = j14;
                                i7 = checkContentTypeConsistency;
                                parseSegmentTemplate = segmentBase4;
                                j11 = j13;
                                str9 = str4;
                            } else {
                                arrayList = arrayList19;
                                int i12 = i7;
                                str = str9;
                                str2 = str6;
                                arrayList2 = arrayList11;
                                segmentBase2 = segmentBase3;
                                ArrayList arrayList24 = arrayList16;
                                j6 = j10;
                                j7 = j12;
                                f = f4;
                                XmlPullParser xmlPullParser4 = xmlPullParser3;
                                arrayList3 = arrayList15;
                                i = i10;
                                arrayList4 = arrayList13;
                                ArrayList arrayList25 = arrayList17;
                                ArrayList arrayList26 = arrayList20;
                                i2 = parseInt4;
                                arrayList5 = arrayList14;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser4, "SegmentBase")) {
                                    SegmentBase.SingleSegmentBase parseSegmentBase = parseSegmentBase(xmlPullParser4, (SegmentBase.SingleSegmentBase) segmentBase2);
                                    xmlPullParser3 = xmlPullParser4;
                                    arrayList6 = arrayList26;
                                    i10 = i;
                                    arrayList8 = arrayList24;
                                    j10 = j6;
                                    j11 = j7;
                                    str9 = str;
                                    i7 = i12;
                                    parseSegmentTemplate = parseSegmentBase;
                                    arrayList7 = arrayList25;
                                } else if (XmlPullParserUtil.isStartTag(xmlPullParser4, "SegmentList")) {
                                    long parseAvailabilityTimeOffsetUs = parseAvailabilityTimeOffsetUs(xmlPullParser4, j6);
                                    arrayList6 = arrayList26;
                                    xmlPullParser3 = xmlPullParser;
                                    parseSegmentTemplate = parseSegmentList(xmlPullParser3, (SegmentBase.SegmentList) segmentBase2, j4, j, j7, parseAvailabilityTimeOffsetUs, j5);
                                    j11 = j7;
                                    arrayList7 = arrayList25;
                                    str9 = str;
                                    i7 = i12;
                                    arrayList8 = arrayList24;
                                    i10 = i;
                                    j10 = parseAvailabilityTimeOffsetUs;
                                } else {
                                    i3 = i12;
                                    xmlPullParser3 = xmlPullParser4;
                                    arrayList6 = arrayList26;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentTemplate")) {
                                        long parseAvailabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser3, j6);
                                        arrayList7 = arrayList25;
                                        parseSegmentTemplate = parseSegmentTemplate(xmlPullParser3, (SegmentBase.SegmentTemplate) segmentBase2, arrayList7, j4, j, j7, parseAvailabilityTimeOffsetUs2, j5);
                                        j11 = j7;
                                        str9 = str;
                                        i10 = i;
                                        i7 = i3;
                                        arrayList8 = arrayList24;
                                        j10 = parseAvailabilityTimeOffsetUs2;
                                    } else {
                                        arrayList7 = arrayList25;
                                        if (XmlPullParserUtil.isStartTag(xmlPullParser3, "InbandEventStream")) {
                                            arrayList8 = arrayList24;
                                            arrayList8.add(parseDescriptor(xmlPullParser3, "InbandEventStream"));
                                        } else {
                                            arrayList8 = arrayList24;
                                            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "Label")) {
                                                str8 = parseLabel(xmlPullParser);
                                            } else if (XmlPullParserUtil.isStartTag(xmlPullParser3)) {
                                                parseAdaptationSetChild(xmlPullParser);
                                            }
                                        }
                                        parseSegmentTemplate = segmentBase2;
                                        i10 = i;
                                        long j15 = j7;
                                        str9 = str;
                                        i7 = i3;
                                        j10 = j6;
                                        j11 = j15;
                                    }
                                }
                            }
                            if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
                                break;
                            }
                            f3 = f;
                            parseInt4 = i2;
                            arrayList13 = arrayList4;
                            arrayList14 = arrayList5;
                            str6 = str2;
                            arrayList11 = arrayList2;
                            arrayList20 = arrayList6;
                            segmentBase3 = parseSegmentTemplate;
                            arrayList17 = arrayList7;
                            arrayList15 = arrayList3;
                            dashManifestParser2 = this;
                            arrayList16 = arrayList8;
                            arrayList19 = arrayList;
                        }
                        i3 = i7;
                        j6 = j10;
                        arrayList = arrayList19;
                        str = str9;
                        i = i10;
                        str2 = str6;
                        arrayList2 = arrayList11;
                        segmentBase2 = segmentBase3;
                        arrayList6 = arrayList20;
                        arrayList8 = arrayList16;
                        j7 = j12;
                        f = f4;
                        arrayList3 = arrayList15;
                        arrayList5 = arrayList14;
                        arrayList4 = arrayList13;
                        arrayList7 = arrayList17;
                        i2 = parseInt4;
                        parseSegmentTemplate = segmentBase2;
                        i10 = i;
                        long j152 = j7;
                        str9 = str;
                        i7 = i3;
                        j10 = j6;
                        j11 = j152;
                        if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
                        }
                    }
                    str2 = str6;
                    arrayList2 = arrayList11;
                    parseSegmentTemplate = segmentBase3;
                    arrayList6 = arrayList20;
                    arrayList8 = arrayList16;
                    j11 = j12;
                    f = f4;
                    arrayList3 = arrayList15;
                    arrayList5 = arrayList14;
                    arrayList4 = arrayList13;
                    arrayList7 = arrayList17;
                    i2 = parseInt4;
                    if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
                    }
                }
            }
            f = f4;
            arrayList3 = arrayList15;
            arrayList5 = arrayList14;
            arrayList4 = arrayList13;
            arrayList7 = arrayList17;
            i2 = parseInt4;
            if (!XmlPullParserUtil.isEndTag(xmlPullParser3, "AdaptationSet")) {
            }
        }
        ArrayList arrayList27 = new ArrayList(arrayList6.size());
        int i13 = 0;
        while (i13 < arrayList6.size()) {
            ArrayList arrayList28 = arrayList8;
            arrayList27.add(buildRepresentation((RepresentationInfo) arrayList6.get(i13), str8, str10, arrayList2, arrayList28));
            i13++;
            arrayList8 = arrayList28;
        }
        return buildAdaptationSet(parseInt, i7, arrayList27, arrayList4, arrayList3, arrayList7);
    }

    protected AdaptationSet buildAdaptationSet(int i, int i2, List list, List list2, List list3, List list4) {
        return new AdaptationSet(i, i2, list, list2, list3, list4);
    }

    protected int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(attributeValue)) {
            return 1;
        }
        if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected Pair parseContentProtection(XmlPullParser xmlPullParser) {
        UUID uuid;
        String str;
        String str2;
        String str3;
        ?? r4;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue != null) {
            String lowerCase = Ascii.toLowerCase(attributeValue);
            lowerCase.getClass();
            switch (lowerCase) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = C.CLEARKEY_UUID;
                    str = null;
                    str2 = str;
                    str3 = str2;
                    r4 = str2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = C.PLAYREADY_UUID;
                    str = null;
                    str2 = str;
                    str3 = str2;
                    r4 = str2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = C.WIDEVINE_UUID;
                    str = null;
                    str2 = str;
                    str3 = str2;
                    r4 = str2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    str = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        String[] split = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[split.length];
                        for (int i = 0; i < split.length; i++) {
                            uuidArr[i] = UUID.fromString(split[i]);
                        }
                        uuid = C.COMMON_PSSH_UUID;
                        byte[] buildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid, uuidArr, null);
                        str3 = null;
                        r4 = buildPsshAtom;
                        break;
                    } else {
                        uuid = null;
                        str2 = null;
                        str3 = str2;
                        r4 = str2;
                        break;
                    }
                    break;
            }
            do {
                xmlPullParser.next();
                if (!XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl") && xmlPullParser.next() == 4) {
                    str3 = xmlPullParser.getText();
                    r4 = r4;
                } else if (!XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                    str3 = xmlPullParser.getAttributeValue(null, "licenseUrl");
                    r4 = r4;
                } else if (r4 == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                    byte[] decode = Base64.decode(xmlPullParser.getText(), 0);
                    UUID parseUuid = PsshAtomUtil.parseUuid(decode);
                    if (parseUuid == null) {
                        Log.w("MpdParser", "Skipping malformed cenc:pssh data");
                        uuid = parseUuid;
                        r4 = 0;
                    } else {
                        r4 = decode;
                        uuid = parseUuid;
                    }
                } else {
                    if (r4 == 0) {
                        UUID uuid2 = C.PLAYREADY_UUID;
                        if (uuid2.equals(uuid) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                            r4 = PsshAtomUtil.buildPsshAtom(uuid2, Base64.decode(xmlPullParser.getText(), 0));
                        }
                    }
                    maybeSkipTag(xmlPullParser);
                    r4 = r4;
                }
            } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
            return Pair.create(str, uuid != null ? new DrmInitData.SchemeData(uuid, str3, "video/mp4", r4) : null);
        }
        uuid = null;
        str = null;
        str2 = str;
        str3 = str2;
        r4 = str2;
        do {
            xmlPullParser.next();
            if (!XmlPullParserUtil.isStartTag(xmlPullParser, "clearkey:Laurl")) {
            }
            if (!XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(str, uuid != null ? new DrmInitData.SchemeData(uuid, str3, "video/mp4", r4) : null);
    }

    protected void parseAdaptationSetChild(XmlPullParser xmlPullParser) {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0214 A[LOOP:0: B:2:0x006c->B:10:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01c7 A[EDGE_INSN: B:11:0x01c7->B:12:0x01c7 BREAK  A[LOOP:0: B:2:0x006c->B:10:0x0214], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List list, String str, String str2, int i, int i2, float f, int i3, int i4, String str3, List list2, List list3, List list4, List list5, SegmentBase segmentBase, long j, long j2, long j3, long j4, long j5, boolean z) {
        ArrayList arrayList;
        int i5;
        ArrayList arrayList2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j6;
        int i6;
        String str4;
        boolean z2;
        SegmentBase segmentBase2;
        long j7;
        SegmentBase parseSegmentTemplate;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        int parseInt = parseInt(xmlPullParser3, "bandwidth", -1);
        String parseString = parseString(xmlPullParser3, "mimeType", str);
        String parseString2 = parseString(xmlPullParser3, "codecs", str2);
        int parseInt2 = parseInt(xmlPullParser3, "width", i);
        int parseInt3 = parseInt(xmlPullParser3, "height", i2);
        float parseFrameRate = parseFrameRate(xmlPullParser3, f);
        int parseInt4 = parseInt(xmlPullParser3, "audioSamplingRate", i4);
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList(list4);
        ArrayList arrayList13 = new ArrayList(list5);
        ArrayList arrayList14 = new ArrayList();
        int i7 = i3;
        long j8 = j3;
        long j9 = j4;
        String str5 = null;
        boolean z3 = false;
        SegmentBase segmentBase3 = segmentBase;
        while (true) {
            xmlPullParser3.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser3, "BaseURL")) {
                if (!z3) {
                    j8 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j8);
                    z3 = true;
                }
                ArrayList arrayList15 = arrayList11;
                arrayList14.addAll(dashManifestParser.parseBaseUrl(xmlPullParser3, list, z));
                xmlPullParser2 = xmlPullParser3;
                arrayList9 = arrayList14;
                j6 = j9;
                arrayList5 = arrayList13;
                i5 = parseInt;
                i6 = i7;
                str4 = str5;
                z2 = z3;
                arrayList2 = arrayList15;
                segmentBase2 = segmentBase3;
                j7 = j8;
            } else {
                ArrayList arrayList16 = arrayList11;
                if (XmlPullParserUtil.isStartTag(xmlPullParser3, "AudioChannelConfiguration")) {
                    xmlPullParser2 = xmlPullParser3;
                    segmentBase2 = segmentBase3;
                    arrayList7 = arrayList14;
                    j6 = j9;
                    i5 = parseInt;
                    str4 = str5;
                    z2 = z3;
                    arrayList2 = arrayList16;
                    i6 = parseAudioChannelConfiguration(xmlPullParser);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentBase")) {
                    SegmentBase.SingleSegmentBase parseSegmentBase = dashManifestParser.parseSegmentBase(xmlPullParser3, (SegmentBase.SingleSegmentBase) segmentBase3);
                    xmlPullParser2 = xmlPullParser3;
                    arrayList7 = arrayList14;
                    j6 = j9;
                    i5 = parseInt;
                    i6 = i7;
                    str4 = str5;
                    z2 = z3;
                    arrayList2 = arrayList16;
                    segmentBase2 = parseSegmentBase;
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentList")) {
                        long parseAvailabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j9);
                        arrayList6 = arrayList14;
                        arrayList = arrayList13;
                        i5 = parseInt;
                        arrayList2 = arrayList16;
                        parseSegmentTemplate = dashManifestParser.parseSegmentList(xmlPullParser3, (SegmentBase.SegmentList) segmentBase3, j, j2, j8, parseAvailabilityTimeOffsetUs, j5);
                        arrayList3 = arrayList10;
                        arrayList4 = arrayList12;
                        xmlPullParser2 = xmlPullParser3;
                        j6 = parseAvailabilityTimeOffsetUs;
                    } else {
                        ArrayList arrayList17 = arrayList14;
                        arrayList = arrayList13;
                        i5 = parseInt;
                        arrayList2 = arrayList16;
                        ArrayList arrayList18 = arrayList12;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser3, "SegmentTemplate")) {
                            long parseAvailabilityTimeOffsetUs2 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j9);
                            long j10 = j8;
                            arrayList3 = arrayList10;
                            parseSegmentTemplate = dashManifestParser.parseSegmentTemplate(xmlPullParser3, (SegmentBase.SegmentTemplate) segmentBase3, list5, j, j2, j10, parseAvailabilityTimeOffsetUs2, j5);
                            xmlPullParser2 = xmlPullParser3;
                            j8 = j10;
                            arrayList4 = arrayList18;
                            j6 = parseAvailabilityTimeOffsetUs2;
                            arrayList6 = arrayList17;
                        } else {
                            xmlPullParser2 = xmlPullParser3;
                            arrayList3 = arrayList10;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                                Pair parseContentProtection = parseContentProtection(xmlPullParser);
                                Object obj = parseContentProtection.first;
                                if (obj != null) {
                                    str5 = (String) obj;
                                }
                                Object obj2 = parseContentProtection.second;
                                if (obj2 != null) {
                                    arrayList3.add((DrmInitData.SchemeData) obj2);
                                }
                                arrayList4 = arrayList18;
                            } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                arrayList2.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                arrayList4 = arrayList18;
                            } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                                arrayList4 = arrayList18;
                                arrayList4.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                            } else {
                                arrayList4 = arrayList18;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                                    arrayList5 = arrayList;
                                    arrayList5.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                                } else {
                                    arrayList5 = arrayList;
                                    maybeSkipTag(xmlPullParser2);
                                }
                                j6 = j9;
                                i6 = i7;
                                str4 = str5;
                                z2 = z3;
                                segmentBase2 = segmentBase3;
                                j7 = j8;
                                arrayList8 = arrayList17;
                                if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
                                    break;
                                }
                                ArrayList arrayList19 = arrayList5;
                                arrayList12 = arrayList4;
                                arrayList10 = arrayList3;
                                arrayList11 = arrayList2;
                                segmentBase3 = segmentBase2;
                                j8 = j7;
                                parseInt = i5;
                                j9 = j6;
                                z3 = z2;
                                str5 = str4;
                                arrayList13 = arrayList19;
                                i7 = i6;
                                arrayList14 = arrayList8;
                                dashManifestParser = this;
                                xmlPullParser3 = xmlPullParser;
                            }
                            arrayList5 = arrayList;
                            j6 = j9;
                            i6 = i7;
                            str4 = str5;
                            z2 = z3;
                            segmentBase2 = segmentBase3;
                            j7 = j8;
                            arrayList8 = arrayList17;
                            if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
                            }
                        }
                    }
                    i6 = i7;
                    str4 = str5;
                    z2 = z3;
                    segmentBase2 = parseSegmentTemplate;
                    j7 = j8;
                    arrayList5 = arrayList;
                    arrayList8 = arrayList6;
                    if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
                    }
                }
                j7 = j8;
                arrayList5 = arrayList13;
                arrayList9 = arrayList7;
            }
            arrayList3 = arrayList10;
            arrayList4 = arrayList12;
            arrayList8 = arrayList9;
            if (!XmlPullParserUtil.isEndTag(xmlPullParser2, "Representation")) {
            }
        }
        ArrayList arrayList20 = arrayList3;
        List list6 = arrayList5;
        Format buildFormat = buildFormat(attributeValue, parseString, parseInt2, parseInt3, parseFrameRate, i6, parseInt4, i5, str3, list2, list3, parseString2, arrayList4, list6);
        if (segmentBase2 == null) {
            segmentBase2 = new SegmentBase.SingleSegmentBase();
        }
        boolean isEmpty = arrayList8.isEmpty();
        List list7 = arrayList8;
        if (isEmpty) {
            list7 = list;
        }
        return new RepresentationInfo(buildFormat, list7, segmentBase2, str4, arrayList20, arrayList2, arrayList4, list6, -1L);
    }

    protected Format buildFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if ("audio/eac3".equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if ("audio/eac3-joc".equals(sampleMimeType)) {
                str5 = "ec+3";
            }
        }
        int parseSelectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int parseRoleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair parseTileCountFromProperties = parseTileCountFromProperties(list3);
        Format.Builder language = new Format.Builder().setId(str).setContainerMimeType(str2).setSampleMimeType(sampleMimeType).setCodecs(str5).setPeakBitrate(i5).setSelectionFlags(parseSelectionFlagsFromRoleDescriptors).setRoleFlags(parseRoleFlagsFromRoleDescriptors).setLanguage(str3);
        int i6 = -1;
        Format.Builder tileCountVertical = language.setTileCountHorizontal(parseTileCountFromProperties != null ? ((Integer) parseTileCountFromProperties.first).intValue() : -1).setTileCountVertical(parseTileCountFromProperties != null ? ((Integer) parseTileCountFromProperties.second).intValue() : -1);
        if (MimeTypes.isVideo(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2).setFrameRate(f);
        } else if (MimeTypes.isAudio(sampleMimeType)) {
            tileCountVertical.setChannelCount(i3).setSampleRate(i4);
        } else if (MimeTypes.isText(sampleMimeType)) {
            if ("application/cea-608".equals(sampleMimeType)) {
                i6 = parseCea608AccessibilityChannel(list2);
            } else if ("application/cea-708".equals(sampleMimeType)) {
                i6 = parseCea708AccessibilityChannel(list2);
            }
            tileCountVertical.setAccessibilityChannel(i6);
        } else if (MimeTypes.isImage(sampleMimeType)) {
            tileCountVertical.setWidth(i).setHeight(i2);
        }
        return tileCountVertical.build();
    }

    protected Representation buildRepresentation(RepresentationInfo representationInfo, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        Format.Builder buildUpon = representationInfo.format.buildUpon();
        if (str != null) {
            buildUpon.setLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            buildUpon.setDrmInitData(new DrmInitData(str2, arrayList3));
        }
        ArrayList arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, buildUpon.build(), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    protected SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, SegmentBase.SingleSegmentBase singleSegmentBase) {
        long parseLong = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j2 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j = Long.parseLong(split[0]);
            j2 = (Long.parseLong(split[1]) - j) + 1;
        }
        long j3 = j2;
        RangedUri rangedUri = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
            RangedUri rangedUri2 = rangedUri;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase")) {
                return buildSingleSegmentBase(rangedUri2, parseLong, parseLong2, j, j3);
            }
            rangedUri = rangedUri2;
        }
    }

    protected SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
    }

    protected SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, SegmentBase.SegmentList segmentList, long j, long j2, long j3, long j4, long j5) {
        long j6;
        long parseLong = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", segmentList != null ? segmentList.duration : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        List list = null;
        RangedUri rangedUri = null;
        List list2 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri = parseInitialization(xmlPullParser);
                j6 = parseLong;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                j6 = parseLong;
                list2 = parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                j6 = parseLong;
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                    if (list == null) {
                        list = new ArrayList();
                    }
                    list.add(parseSegmentUrl(xmlPullParser));
                } else {
                    maybeSkipTag(xmlPullParser);
                }
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList")) {
                break;
            }
            parseLong = j6;
        }
        if (segmentList != null) {
            if (rangedUri == null) {
                rangedUri = segmentList.initialization;
            }
            if (list2 == null) {
                list2 = segmentList.segmentTimeline;
            }
            if (list == null) {
                list = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(rangedUri, j6, parseLong2, parseLong4, parseLong3, list2, finalAvailabilityTimeOffset, list, j5, j);
    }

    protected SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        return new SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, j5, list2, Util.msToUs(j6), Util.msToUs(j7));
    }

    protected SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, SegmentBase.SegmentTemplate segmentTemplate, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        DashManifestParser dashManifestParser;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        UrlTemplate urlTemplate;
        RangedUri rangedUri;
        List list2;
        long j12;
        long j13;
        DashManifestParser dashManifestParser2 = this;
        long parseLong = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long parseLong3 = parseLong(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.duration : -9223372036854775807L);
        long parseLong4 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j3, j4);
        UrlTemplate parseUrlTemplate = dashManifestParser2.parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate parseUrlTemplate2 = dashManifestParser2.parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri rangedUri2 = null;
        List list3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                rangedUri2 = parseInitialization(xmlPullParser);
                j6 = parseLong;
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                j6 = parseLong;
                list3 = dashManifestParser2.parseSegmentTimeline(xmlPullParser, j6, j2);
            } else {
                j6 = parseLong;
                maybeSkipTag(xmlPullParser);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            dashManifestParser2 = this;
            finalAvailabilityTimeOffset = finalAvailabilityTimeOffset;
            parseLastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty;
            parseLong4 = parseLong4;
            parseLong2 = parseLong2;
            parseLong = j6;
        }
        if (segmentTemplate != null) {
            if (rangedUri2 == null) {
                rangedUri2 = segmentTemplate.initialization;
            }
            if (list3 == null) {
                dashManifestParser = this;
                j12 = j;
                j7 = j6;
                j8 = parseLong2;
                j9 = parseLong4;
                j10 = parseLastSegmentNumberSupplementalProperty;
                j11 = finalAvailabilityTimeOffset;
                urlTemplate = parseUrlTemplate2;
                rangedUri = rangedUri2;
                j13 = j5;
                list2 = segmentTemplate.segmentTimeline;
                return dashManifestParser.buildSegmentTemplate(rangedUri, j7, j8, j9, j10, parseLong3, list2, j11, urlTemplate, parseUrlTemplate, j13, j12);
            }
        }
        dashManifestParser = this;
        j7 = j6;
        j8 = parseLong2;
        j9 = parseLong4;
        j10 = parseLastSegmentNumberSupplementalProperty;
        j11 = finalAvailabilityTimeOffset;
        urlTemplate = parseUrlTemplate2;
        rangedUri = rangedUri2;
        list2 = list3;
        j12 = j;
        j13 = j5;
        return dashManifestParser.buildSegmentTemplate(rangedUri, j7, j8, j9, j10, parseLong3, list2, j11, urlTemplate, parseUrlTemplate, j13, j12);
    }

    protected SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, long j5, List list, long j6, UrlTemplate urlTemplate, UrlTemplate urlTemplate2, long j7, long j8) {
        return new SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, j5, list, j6, urlTemplate, urlTemplate2, Util.msToUs(j7), Util.msToUs(j8));
    }

    protected EventStream parseEventStream(XmlPullParser xmlPullParser) {
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", "");
        long parseLong = parseLong(xmlPullParser, "timescale", 1L);
        long parseLong2 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                j = parseLong;
                str = parseString2;
                str2 = parseString;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(parseEvent(xmlPullParser2, str2, str, j, parseLong2, byteArrayOutputStream));
            } else {
                j = parseLong;
                str = parseString2;
                str2 = parseString;
                xmlPullParser2 = xmlPullParser;
                maybeSkipTag(xmlPullParser2);
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            parseString = str2;
            parseString2 = str;
            parseLong = j;
        }
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return buildEventStream(str2, str, j, jArr, eventMessageArr);
    }

    protected EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j, jArr, eventMessageArr);
    }

    protected Pair parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) {
        long parseLong = parseLong(xmlPullParser, "id", 0L);
        long parseLong2 = parseLong(xmlPullParser, "duration", -9223372036854775807L);
        long parseLong3 = parseLong(xmlPullParser, "presentationTime", 0L);
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(parseLong2, 1000L, j);
        long scaleLargeTimestamp2 = Util.scaleLargeTimestamp(parseLong3 - j2, 1000000L, j);
        String parseString = parseString(xmlPullParser, "messageData", null);
        byte[] parseEventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(scaleLargeTimestamp2);
        if (parseString != null) {
            parseEventObject = Util.getUtf8Bytes(parseString);
        }
        return Pair.create(valueOf, buildEvent(str, str2, parseLong, scaleLargeTimestamp, parseEventObject));
    }

    protected byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, Charsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    protected EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    protected List parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "S")) {
                long parseLong = parseLong(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    ArrayList arrayList2 = arrayList;
                    j3 = addSegmentTimelineElementsToList(arrayList2, j3, j4, i, parseLong);
                    arrayList = arrayList2;
                }
                if (parseLong != -9223372036854775807L) {
                    j3 = parseLong;
                }
                j4 = parseLong(xmlPullParser, "d", -9223372036854775807L);
                i = parseInt(xmlPullParser, "r", 0);
                z = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z) {
            addSegmentTimelineElementsToList(arrayList, j3, j4, i, Util.scaleLargeTimestamp(j2, j, 1000L));
        }
        return arrayList;
    }

    private long addSegmentTimelineElementsToList(List list, long j, long j2, int i, long j3) {
        int ceilDivide = i >= 0 ? i + 1 : (int) Util.ceilDivide(j3 - j, j2);
        for (int i2 = 0; i2 < ceilDivide; i2++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    protected SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        return new SegmentBase.SegmentTimelineElement(j, j2);
    }

    protected UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    protected RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }

    protected RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    protected RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return buildRangedUri(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return buildRangedUri(attributeValue, j, j2);
    }

    protected RangedUri buildRangedUri(String str, long j, long j2) {
        return new RangedUri(str, j, j2);
    }

    protected ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) {
        String str = null;
        String parseString = parseString(xmlPullParser, "moreInformationURL", null);
        String parseString2 = parseString(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str4 = str2;
            String str5 = str;
            String str6 = str3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(str5, str4, str6, parseString, parseString2);
            }
            str = str5;
            str2 = str4;
            str3 = str6;
        }
    }

    protected String parseLabel(XmlPullParser xmlPullParser) {
        return parseText(xmlPullParser, "Label");
    }

    protected List parseBaseUrl(XmlPullParser xmlPullParser, List list, boolean z) {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = z ? 1 : TLObject.FLAG_31;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String parseText = parseText(xmlPullParser, "BaseURL");
        if (UriUtil.isAbsolute(parseText)) {
            if (attributeValue3 == null) {
                attributeValue3 = parseText;
            }
            return Lists.newArrayList(new BaseUrl(parseText, attributeValue3, i, parseInt));
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            BaseUrl baseUrl = (BaseUrl) list.get(i2);
            String resolve = UriUtil.resolve(baseUrl.url, parseText);
            String str = attributeValue3 == null ? resolve : attributeValue3;
            if (z) {
                i = baseUrl.priority;
                parseInt = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(resolve, str, i, parseInt));
        }
        return arrayList;
    }

    protected long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) {
        char c;
        String parseString = parseString(xmlPullParser, "schemeIdUri", null);
        parseString.getClass();
        int i = -1;
        switch (parseString.hashCode()) {
            case -2128649360:
                if (parseString.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1352850286:
                if (parseString.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1138141449:
                if (parseString.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -986633423:
                if (parseString.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -79006963:
                if (parseString.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 312179081:
                if (parseString.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2036691300:
                if (parseString.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c = 6;
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
            case 4:
                i = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case 1:
                i = parseInt(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case 3:
                i = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case 5:
                i = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    protected int parseSelectionFlagsFromRoleDescriptors(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = (Descriptor) list.get(i2);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                i |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return i;
    }

    protected int parseSelectionFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    protected int parseRoleFlagsFromRoleDescriptors(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = (Descriptor) list.get(i2);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                i |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return i;
    }

    protected int parseRoleFlagsFromAccessibilityDescriptors(List list) {
        int parseTvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = (Descriptor) list.get(i2);
            if (Ascii.equalsIgnoreCase("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                parseTvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else if (Ascii.equalsIgnoreCase("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                parseTvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
            }
            i |= parseTvaAudioPurposeCsValue;
        }
        return i;
    }

    protected int parseRoleFlagsFromProperties(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/trickmode", ((Descriptor) list.get(i2)).schemeIdUri)) {
                i = 16384;
            }
        }
        return i;
    }

    protected int parseRoleFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected int parseTvaAudioPurposeCsValue(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    protected String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    protected Pair parseTileCountFromProperties(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = (Descriptor) list.get(i);
            if ((Ascii.equalsIgnoreCase("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || Ascii.equalsIgnoreCase("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                String[] split = Util.split(str, "x");
                if (split.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) {
        if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i++;
                } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(size);
            if (!schemeData.hasData()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((DrmInitData.SchemeData) arrayList.get(i)).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    private static void fillInClearKeyInformation(ArrayList arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i);
            if (C.CLEARKEY_UUID.equals(schemeData.uuid) && (str = schemeData.licenseServerUrl) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(i2);
            if (C.COMMON_PSSH_UUID.equals(schemeData2.uuid) && schemeData2.licenseServerUrl == null) {
                arrayList.set(i2, new DrmInitData.SchemeData(C.CLEARKEY_UUID, str, schemeData2.mimeType, schemeData2.data));
            }
        }
    }

    private static String getSampleMimeType(String str, String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (MimeTypes.isText(str) || MimeTypes.isImage(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String mediaMimeType = MimeTypes.getMediaMimeType(str2);
        return "text/vtt".equals(mediaMimeType) ? "application/x-mp4-vtt" : mediaMimeType;
    }

    private static String checkLanguageConsistency(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        Assertions.checkState(i == i2);
        return i;
    }

    protected static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) {
        String parseString = parseString(xmlPullParser, "schemeIdUri", "");
        String parseString2 = parseString(xmlPullParser, "value", null);
        String parseString3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(parseString, parseString2, parseString3);
    }

    protected static int parseCea608AccessibilityChannel(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = (Descriptor) list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w("MpdParser", "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    protected static int parseCea708AccessibilityChannel(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = (Descriptor) list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.w("MpdParser", "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    protected static String parseEac3SupplementalProperties(List list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = (Descriptor) list.get(i);
            String str = descriptor.schemeIdUri;
            if (!"tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) || !"JOC".equals(descriptor.value)) {
                if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(descriptor.value)) {
                    return "audio/eac3-joc";
                }
            } else {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    protected static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
            if (matcher.matches()) {
                int parseInt = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
            }
        }
        return f;
    }

    protected static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDuration(attributeValue);
    }

    protected static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDateTime(attributeValue);
    }

    protected static String parseText(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return str2;
    }

    protected static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    protected static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    protected static float parseFloat(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    protected static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    protected static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt >= 0) {
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (parseInt < iArr.length) {
                return iArr[parseInt];
            }
        }
        return -1;
    }

    protected static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int parseInt = parseInt(xmlPullParser, "value", -1);
        if (parseInt <= 0 || parseInt >= 33) {
            return -1;
        }
        return parseInt;
    }

    protected static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        char c;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String lowerCase = Ascii.toLowerCase(attributeValue);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 1596796:
                if (lowerCase.equals("4000")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2937391:
                if (lowerCase.equals("a000")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3094035:
                if (lowerCase.equals("f801")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3133436:
                if (lowerCase.equals("fa01")) {
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
        }
        return -1;
    }

    protected static long parseLastSegmentNumberSupplementalProperty(List list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = (Descriptor) list.get(i);
            if (Ascii.equalsIgnoreCase("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    protected static final class RepresentationInfo {
        public final ImmutableList baseUrls;
        public final ArrayList drmSchemeDatas;
        public final String drmSchemeType;
        public final List essentialProperties;
        public final Format format;
        public final ArrayList inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List supplementalProperties;

        public RepresentationInfo(Format format, List list, SegmentBase segmentBase, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j) {
            this.format = format;
            this.baseUrls = ImmutableList.copyOf((Collection) list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j;
        }
    }
}
