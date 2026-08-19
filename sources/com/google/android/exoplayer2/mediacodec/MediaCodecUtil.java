package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public abstract class MediaCodecUtil {
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap decoderInfosCache = new HashMap();
    private static int maxH264DecodableFrameSize = -1;

    private interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i);

        boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface ScoreProvider {
        int getScore(Object obj);
    }

    private static int av1LevelNumberToConst(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return TLObject.FLAG_19;
            case 20:
                return 1048576;
            case 21:
                return TLObject.FLAG_21;
            case 22:
                return TLObject.FLAG_22;
            case 23:
                return TLObject.FLAG_23;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcLevelToMaxFrameSize(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return TLObject.FLAG_21;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case TLObject.FLAG_19 /* 524288 */:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int avcProfileNumberToConst(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    private static int mp4aAudioObjectTypeToProfile(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    private static int vp9LevelNumberToConst(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public static MediaCodecInfo getDecryptOnlyDecoderInfo() {
        return getDecoderInfo("audio/raw", false, false);
    }

    public static MediaCodecInfo getDecoderInfo(String str, boolean z, boolean z2) {
        List decoderInfos = getDecoderInfos(str, z, z2);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return (MediaCodecInfo) decoderInfos.get(0);
    }

    public static synchronized List getDecoderInfos(String str, boolean z, boolean z2) {
        MediaCodecListCompat mediaCodecListCompatV16;
        synchronized (MediaCodecUtil.class) {
            try {
                CodecKey codecKey = new CodecKey(str, z, z2);
                HashMap hashMap = decoderInfosCache;
                List list = (List) hashMap.get(codecKey);
                if (list != null) {
                    return list;
                }
                int i = Util.SDK_INT;
                if (i >= 21) {
                    mediaCodecListCompatV16 = new MediaCodecListCompatV21(z, z2);
                } else {
                    mediaCodecListCompatV16 = new MediaCodecListCompatV16();
                }
                ArrayList decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV16);
                if (z && decoderInfosInternal.isEmpty() && 21 <= i && i <= 23) {
                    decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV16());
                    if (!decoderInfosInternal.isEmpty()) {
                        Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((MediaCodecInfo) decoderInfosInternal.get(0)).name);
                    }
                }
                applyWorkarounds(str, decoderInfosInternal);
                ImmutableList copyOf = ImmutableList.copyOf((Collection) decoderInfosInternal);
                hashMap.put(codecKey, copyOf);
                return copyOf;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List getDecoderInfosSortedByFormatSupport(List list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda6
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
            public final int getScore(Object obj) {
                return MediaCodecUtil.$r8$lambda$sLOK7ccsS-ur1NtiGvNU7qvptuU(Format.this, (MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int $r8$lambda$sLOK7ccsS-ur1NtiGvNU7qvptuU(Format format, MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isFormatFunctionallySupported(format) ? 1 : 0;
    }

    public static int maxH264DecodableFrameSize() {
        if (maxH264DecodableFrameSize == -1) {
            int i = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo(MediaController.VIDEO_MIME_TYPE, false, false);
            if (decoderInfo != null) {
                MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(avcLevelToMaxFrameSize(profileLevels[i].level), i2);
                    i++;
                }
                i = Math.max(i2, Util.SDK_INT >= 21 ? 345600 : 172800);
            }
            maxH264DecodableFrameSize = i;
        }
        return maxH264DecodableFrameSize;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        if (r3.equals("av01") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair getCodecProfileAndLevel(Format format) {
        char c = 0;
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if ("video/dolby-vision".equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, split);
        }
        String str2 = split[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                break;
            case 3006243:
                if (str2.equals("avc1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3356560:
                if (str2.equals("mp4a")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3624515:
                if (str2.equals("vp09")) {
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
                return getAv1ProfileAndLevel(format.codecs, split, format.colorInfo);
            case 1:
            case 2:
                return getAvcProfileAndLevel(format.codecs, split);
            case 3:
            case 4:
                return getHevcProfileAndLevel(format.codecs, split);
            case 5:
                return getAacCodecProfileAndLevel(format.codecs, split);
            case 6:
                return getVp9ProfileAndLevel(format.codecs, split);
            default:
                return null;
        }
    }

    public static String getAlternativeCodecMimeType(Format format) {
        Pair codecProfileAndLevel;
        if ("audio/eac3-joc".equals(format.sampleMimeType)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(format.sampleMimeType) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int intValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return MediaController.VIDEO_MIME_TYPE;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if (r1.secure != r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a0, code lost:
    
        r17 = r11;
        r18 = r16;
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00aa, code lost:
    
        r5.add(com.google.android.exoplayer2.mediacodec.MediaCodecInfo.newInstance(r9, r7, r8, r9, r10, r11, r18, false, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009d, code lost:
    
        if (r1.secure == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc A[Catch: Exception -> 0x0146, TRY_ENTER, TryCatch #4 {Exception -> 0x0146, blocks: (B:3:0x0008, B:5:0x001b, B:9:0x011b, B:10:0x002b, B:13:0x0036, B:50:0x00f4, B:53:0x00fc, B:55:0x0102, B:58:0x0123, B:59:0x0144), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList getDecoderInfosInternal(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat) {
        String str;
        int i;
        boolean z;
        boolean z2;
        CodecKey codecKey2 = codecKey;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = codecKey2.mimeType;
            int codecCount = mediaCodecListCompat.getCodecCount();
            boolean secureDecodersExplicit = mediaCodecListCompat.secureDecodersExplicit();
            int i2 = 0;
            while (i2 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat.getCodecInfoAt(i2);
                if (!isAlias(codecInfoAt)) {
                    String name = codecInfoAt.getName();
                    if (isCodecUsableDecoder(codecInfoAt, name, secureDecodersExplicit, str2)) {
                        int i3 = i2;
                        String codecMimeType = getCodecMimeType(codecInfoAt, name, str2);
                        if (codecMimeType == null) {
                            z = secureDecodersExplicit;
                            i = i3;
                        } else {
                            boolean z3 = secureDecodersExplicit;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(codecMimeType);
                                boolean isFeatureSupported = mediaCodecListCompat.isFeatureSupported("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean isFeatureRequired = mediaCodecListCompat.isFeatureRequired("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean z4 = codecKey2.tunneling;
                                if (!z4) {
                                    if (!isFeatureRequired) {
                                    }
                                    i = i3;
                                    z = z3;
                                }
                                if (!z4 || isFeatureSupported) {
                                    boolean isFeatureSupported2 = mediaCodecListCompat.isFeatureSupported("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean isFeatureRequired2 = mediaCodecListCompat.isFeatureRequired("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean z5 = codecKey2.secure;
                                    if ((z5 || !isFeatureRequired2) && (!z5 || isFeatureSupported2)) {
                                        try {
                                            boolean isHardwareAccelerated = isHardwareAccelerated(codecInfoAt, str2);
                                            try {
                                                boolean isSoftwareOnly = isSoftwareOnly(codecInfoAt, str2);
                                                boolean isVendor = isVendor(codecInfoAt);
                                                if (z3) {
                                                    z2 = isVendor;
                                                } else {
                                                    z2 = isVendor;
                                                }
                                                if (!z3) {
                                                    try {
                                                    } catch (Exception e) {
                                                        e = e;
                                                        i = i3;
                                                        z = z3;
                                                        str = name;
                                                        if (Util.SDK_INT <= 23 && !arrayList.isEmpty()) {
                                                            Log.e("MediaCodecUtil", "Skipping codec " + str + " (failed to query capabilities)");
                                                            i2 = i + 1;
                                                            codecKey2 = codecKey;
                                                            secureDecodersExplicit = z;
                                                        } else {
                                                            Log.e("MediaCodecUtil", "Failed to query codec " + str + " (" + codecMimeType + ")");
                                                            throw e;
                                                        }
                                                    }
                                                }
                                                z = z3;
                                                boolean z6 = z2;
                                                i = i3;
                                                if (!z && isFeatureSupported2) {
                                                    str = name;
                                                    try {
                                                        arrayList.add(MediaCodecInfo.newInstance(name + ".secure", str2, codecMimeType, capabilitiesForType, isHardwareAccelerated, isSoftwareOnly, z6, false, true));
                                                        break;
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        if (Util.SDK_INT <= 23) {
                                                        }
                                                        Log.e("MediaCodecUtil", "Failed to query codec " + str + " (" + codecMimeType + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                str = name;
                                                i = i3;
                                                z = z3;
                                            }
                                        } catch (Exception e4) {
                                            e = e4;
                                            str = name;
                                            z = z3;
                                            i = i3;
                                        }
                                    }
                                }
                                i = i3;
                                z = z3;
                            } catch (Exception e5) {
                                e = e5;
                                str = name;
                                i = i3;
                                z = z3;
                            }
                        }
                        i2 = i + 1;
                        codecKey2 = codecKey;
                        secureDecodersExplicit = z;
                    }
                }
                z = secureDecodersExplicit;
                i = i2;
                i2 = i + 1;
                codecKey2 = codecKey;
                secureDecodersExplicit = z;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new DecoderQueryException(e6);
        }
    }

    private static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = Util.SDK_INT;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util.DEVICE;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util.MANUFACTURER) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util.DEVICE;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util.DEVICE;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util.MANUFACTURER))) {
            String str6 = Util.DEVICE;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Util.MANUFACTURER)) {
            String str7 = Util.DEVICE;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void applyWorkarounds(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (Util.SDK_INT < 26 && Util.DEVICE.equals("R9") && list.size() == 1 && ((MediaCodecInfo) list.get(0)).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.newInstance("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            sortByScore(list, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda4
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
                public final int getScore(Object obj) {
                    return MediaCodecUtil.$r8$lambda$TDrPHodxpUr7HHupKf6OWrVR16U((MediaCodecInfo) obj);
                }
            });
        }
        int i = Util.SDK_INT;
        if (i < 21 && list.size() > 1) {
            String str2 = ((MediaCodecInfo) list.get(0)).name;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                sortByScore(list, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda5
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
                    public final int getScore(Object obj) {
                        return MediaCodecUtil.$r8$lambda$gFxzaZ51c5G_GcWNtAzN1F-2QZg((MediaCodecInfo) obj);
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((MediaCodecInfo) list.get(0)).name)) {
            return;
        }
        list.add((MediaCodecInfo) list.remove(0));
    }

    public static /* synthetic */ int $r8$lambda$TDrPHodxpUr7HHupKf6OWrVR16U(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public static /* synthetic */ int $r8$lambda$gFxzaZ51c5G_GcWNtAzN1F-2QZg(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.name.startsWith("OMX.google") ? 1 : 0;
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean isAlias;
        isAlias = mediaCodecInfo.isAlias();
        return isAlias;
    }

    public static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.SDK_INT >= 29) {
            return isHardwareAcceleratedV29(mediaCodecInfo);
        }
        return !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (MimeTypes.isAudio(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        boolean isVendor;
        isVendor = mediaCodecInfo.isVendor();
        return isVendor;
    }

    private static Pair getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer dolbyVisionStringToProfile = dolbyVisionStringToProfile(group);
        if (dolbyVisionStringToProfile == null) {
            Log.w("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer dolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (dolbyVisionStringToLevel == null) {
            Log.w("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
            return null;
        }
        return new Pair(dolbyVisionStringToProfile, dolbyVisionStringToLevel);
    }

    private static Pair getHevcProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 4) {
            Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if (!"2".equals(group)) {
                Log.w("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
            i = 2;
        }
        String str2 = strArr[3];
        Integer hevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (hevcCodecStringToProfileLevel == null) {
            Log.w("MediaCodecUtil", "Unknown HEVC level string: " + str2);
            return null;
        }
        return new Pair(Integer.valueOf(i), hevcCodecStringToProfileLevel);
    }

    private static Pair getAvcProfileAndLevel(String str, String[] strArr) {
        int parseInt;
        int i;
        if (strArr.length < 2) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i = parseInt2;
            } else {
                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int avcProfileNumberToConst = avcProfileNumberToConst(i);
            if (avcProfileNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown AVC profile: " + i);
                return null;
            }
            int avcLevelNumberToConst = avcLevelNumberToConst(parseInt);
            if (avcLevelNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown AVC level: " + parseInt);
                return null;
            }
            return new Pair(Integer.valueOf(avcProfileNumberToConst), Integer.valueOf(avcLevelNumberToConst));
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static Pair getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int vp9ProfileNumberToConst = vp9ProfileNumberToConst(parseInt);
            if (vp9ProfileNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int vp9LevelNumberToConst = vp9LevelNumberToConst(parseInt2);
            if (vp9LevelNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
                return null;
            }
            return new Pair(Integer.valueOf(vp9ProfileNumberToConst), Integer.valueOf(vp9LevelNumberToConst));
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static Pair getAv1ProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        int i;
        if (strArr.length < 4) {
            Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i2 = 1;
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                Log.w("MediaCodecUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                Log.w("MediaCodecUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
            if (parseInt3 != 8) {
                i2 = (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i = colorInfo.colorTransfer) == 7 || i == 6)) ? 2 : 4096;
            }
            int av1LevelNumberToConst = av1LevelNumberToConst(parseInt2);
            if (av1LevelNumberToConst == -1) {
                Log.w("MediaCodecUtil", "Unknown AV1 level: " + parseInt2);
                return null;
            }
            return new Pair(Integer.valueOf(i2), Integer.valueOf(av1LevelNumberToConst));
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    private static Pair getAacCodecProfileAndLevel(String str, String[] strArr) {
        int mp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if (MediaController.AUDIO_MIME_TYPE.equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (mp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(mp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            Log.w("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static /* synthetic */ int $r8$lambda$JHg_2kH2ELo9xN22L7n_E3HxVdU(ScoreProvider scoreProvider, Object obj, Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    private static void sortByScore(List list, final ScoreProvider scoreProvider) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.$r8$lambda$JHg_2kH2ELo9xN22L7n_E3HxVdU(MediaCodecUtil.ScoreProvider.this, obj, obj2);
            }
        });
    }

    private static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }

        public MediaCodecListCompatV21(boolean z, boolean z2) {
            this.codecKind = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }
    }

    private static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }

        private MediaCodecListCompatV16() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MediaController.VIDEO_MIME_TYPE.equals(str2);
        }
    }

    private static final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(String str, boolean z, boolean z2) {
            this.mimeType = str;
            this.secure = z;
            this.tunneling = z2;
        }

        public int hashCode() {
            return ((((this.mimeType.hashCode() + 31) * 31) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling) {
                    return true;
                }
            }
            return false;
        }
    }

    private static Integer hevcCodecStringToProfileLevel(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Integer dolbyVisionStringToProfile(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static Integer dolbyVisionStringToLevel(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }
}
