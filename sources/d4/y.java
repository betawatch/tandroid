package d4;

import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import h5.d0;
import j3.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k7.a7;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class y {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (d0.a < 26 && d0.b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new t(new s(2), 0));
        }
        int i10 = d0.a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new t(new s(3), 0));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }

    public static String b(n0 n0Var) {
        Pair d;
        if ("audio/eac3-joc".equals(n0Var.C)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(n0Var.C) || (d = d(n0Var)) == null) {
            return null;
        }
        int intValue = ((Integer) d.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return MediaController.VIDEO_MIME_TYPE;
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair d(n0 n0Var) {
        char c3;
        int i10;
        int i11;
        int parseInt;
        int parseInt2;
        int i12;
        int i13;
        int i14;
        char c10;
        int i15;
        char c11;
        Integer num;
        char c12;
        Integer num2 = 1024;
        String str = n0Var.r;
        String str2 = n0Var.r;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(n0Var.C);
        Pattern pattern = a;
        if (!equals) {
            String str3 = split[0];
            str3.getClass();
            switch (str3.hashCode()) {
                case 3004662:
                    if (str3.equals("av01")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            int i16 = 20;
            switch (c3) {
                case 0:
                    i5.b bVar = n0Var.O;
                    if (split.length < 4) {
                        android.support.v4.media.a.w("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                        break;
                    } else {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 == 0) {
                                int i17 = 8;
                                if (parseInt5 != 8 && parseInt5 != 10) {
                                    e2.c.q(parseInt5, "Unknown AV1 bit depth: ", "MediaCodecUtil");
                                    break;
                                } else {
                                    int i18 = parseInt5 == 8 ? 1 : (bVar == null || !(bVar.d != null || (i10 = bVar.c) == 7 || i10 == 6)) ? 2 : 4096;
                                    switch (parseInt4) {
                                        case 0:
                                            i17 = 1;
                                            break;
                                        case 1:
                                            i17 = 2;
                                            break;
                                        case 2:
                                            i17 = 4;
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i17 = 16;
                                            break;
                                        case 5:
                                            i17 = 32;
                                            break;
                                        case 6:
                                            i17 = 64;
                                            break;
                                        case 7:
                                            i17 = 128;
                                            break;
                                        case 8:
                                            i17 = 256;
                                            break;
                                        case 9:
                                            i17 = 512;
                                            break;
                                        case 10:
                                            i17 = 1024;
                                            break;
                                        case 11:
                                            i17 = 2048;
                                            break;
                                        case 12:
                                            i17 = 4096;
                                            break;
                                        case 13:
                                            i17 = 8192;
                                            break;
                                        case 14:
                                            i17 = 16384;
                                            break;
                                        case 15:
                                            i17 = 32768;
                                            break;
                                        case 16:
                                            i17 = 65536;
                                            break;
                                        case 17:
                                            i17 = 131072;
                                            break;
                                        case 18:
                                            i17 = 262144;
                                            break;
                                        case 19:
                                            i17 = TLObject.FLAG_19;
                                            break;
                                        case 20:
                                            i17 = 1048576;
                                            break;
                                        case 21:
                                            i17 = TLObject.FLAG_21;
                                            break;
                                        case 22:
                                            i17 = TLObject.FLAG_22;
                                            break;
                                        case 23:
                                            i17 = TLObject.FLAG_23;
                                            break;
                                        default:
                                            i17 = -1;
                                            break;
                                    }
                                    if (i17 != -1) {
                                        break;
                                    } else {
                                        e2.c.q(parseInt4, "Unknown AV1 level: ", "MediaCodecUtil");
                                        break;
                                    }
                                }
                            } else {
                                e2.c.q(parseInt3, "Unknown AV1 profile: ", "MediaCodecUtil");
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            android.support.v4.media.a.w("Ignoring malformed AV1 codec string: ", str2, "MediaCodecUtil");
                            return null;
                        }
                    }
                    break;
                case 1:
                case 2:
                    if (split.length < 2) {
                        android.support.v4.media.a.w("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                i11 = 16;
                                if (split.length < 3) {
                                    h5.a.K("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str2);
                                    break;
                                } else {
                                    parseInt = Integer.parseInt(split[1]);
                                    parseInt2 = Integer.parseInt(split[2]);
                                }
                            } else {
                                i11 = 16;
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            }
                            if (parseInt == 66) {
                                i12 = -1;
                                i13 = 1;
                            } else if (parseInt == 77) {
                                i12 = -1;
                                i13 = 2;
                            } else if (parseInt == 88) {
                                i12 = -1;
                                i13 = 4;
                            } else if (parseInt == 100) {
                                i12 = -1;
                                i13 = 8;
                            } else if (parseInt == 110) {
                                i12 = -1;
                                i13 = 16;
                            } else if (parseInt == 122) {
                                i12 = -1;
                                i13 = 32;
                            } else if (parseInt != 244) {
                                i12 = -1;
                                i13 = -1;
                            } else {
                                i12 = -1;
                                i13 = 64;
                            }
                            if (i13 != i12) {
                                switch (parseInt2) {
                                    case 10:
                                        i11 = 1;
                                        break;
                                    case 11:
                                        i11 = 4;
                                        break;
                                    case 12:
                                        i11 = 8;
                                        break;
                                    case 13:
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 20:
                                                i11 = 32;
                                                break;
                                            case 21:
                                                i11 = 64;
                                                break;
                                            case 22:
                                                i11 = 128;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                                        i11 = 256;
                                                        break;
                                                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                                        i11 = 512;
                                                        break;
                                                    case 32:
                                                        i11 = 1024;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                                                i11 = 2048;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                                                i11 = 4096;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                                i11 = 8192;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                        i11 = 16384;
                                                                        break;
                                                                    case 51:
                                                                        i11 = 32768;
                                                                        break;
                                                                    case 52:
                                                                        i11 = 65536;
                                                                        break;
                                                                    default:
                                                                        i11 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i11 != -1) {
                                    break;
                                } else {
                                    e2.c.q(parseInt2, "Unknown AVC level: ", "MediaCodecUtil");
                                    break;
                                }
                            } else {
                                e2.c.q(parseInt, "Unknown AVC profile: ", "MediaCodecUtil");
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            android.support.v4.media.a.w("Ignoring malformed AVC codec string: ", str2, "MediaCodecUtil");
                            return null;
                        }
                    }
                case 3:
                case 4:
                    i5.b bVar2 = n0Var.O;
                    if (split.length < 4) {
                        android.support.v4.media.a.w("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                        break;
                    } else {
                        Matcher matcher = pattern.matcher(split[1]);
                        if (!matcher.matches()) {
                            android.support.v4.media.a.w("Ignoring malformed HEVC codec string: ", str2, "MediaCodecUtil");
                            break;
                        } else {
                            String group = matcher.group(1);
                            if (!"1".equals(group)) {
                                if (!"2".equals(group)) {
                                    android.support.v4.media.a.w("Unknown HEVC profile string: ", group, "MediaCodecUtil");
                                    break;
                                } else {
                                    i14 = (bVar2 == null || bVar2.c != 6) ? 2 : 4096;
                                }
                            } else {
                                i14 = 1;
                            }
                            String str4 = split[3];
                            if (str4 != null) {
                                switch (str4.hashCode()) {
                                    case 70821:
                                        if (str4.equals("H30")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 70914:
                                        if (str4.equals("H60")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 70917:
                                        if (str4.equals("H63")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 71007:
                                        if (str4.equals("H90")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 71010:
                                        if (str4.equals("H93")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 74665:
                                        if (str4.equals("L30")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 74758:
                                        if (str4.equals("L60")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 74761:
                                        if (str4.equals("L63")) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 74851:
                                        if (str4.equals("L90")) {
                                            c10 = '\b';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 74854:
                                        if (str4.equals("L93")) {
                                            c10 = '\t';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2193639:
                                        if (str4.equals("H120")) {
                                            c10 = '\n';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2193642:
                                        if (str4.equals("H123")) {
                                            c10 = 11;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2193732:
                                        if (str4.equals("H150")) {
                                            c10 = '\f';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2193735:
                                        if (str4.equals("H153")) {
                                            c10 = '\r';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2193738:
                                        if (str4.equals("H156")) {
                                            c10 = 14;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2193825:
                                        if (str4.equals("H180")) {
                                            c10 = 15;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2193828:
                                        if (str4.equals("H183")) {
                                            c10 = 16;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2193831:
                                        if (str4.equals("H186")) {
                                            c10 = 17;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2312803:
                                        if (str4.equals("L120")) {
                                            c10 = 18;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2312806:
                                        if (str4.equals("L123")) {
                                            c10 = 19;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2312896:
                                        if (str4.equals("L150")) {
                                            c10 = 20;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2312899:
                                        if (str4.equals("L153")) {
                                            c10 = 21;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2312902:
                                        if (str4.equals("L156")) {
                                            c10 = 22;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2312989:
                                        if (str4.equals("L180")) {
                                            c10 = 23;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2312992:
                                        if (str4.equals("L183")) {
                                            c10 = 24;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2312995:
                                        if (str4.equals("L186")) {
                                            c10 = 25;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                switch (c10) {
                                    case 0:
                                        num2 = 2;
                                        break;
                                    case 1:
                                        num2 = 8;
                                        break;
                                    case 2:
                                        num2 = 32;
                                        break;
                                    case 3:
                                        num2 = 128;
                                        break;
                                    case 4:
                                        num2 = 512;
                                        break;
                                    case 5:
                                        num2 = 1;
                                        break;
                                    case 6:
                                        num2 = 4;
                                        break;
                                    case 7:
                                        num2 = 16;
                                        break;
                                    case '\b':
                                        num2 = 64;
                                        break;
                                    case '\t':
                                        num2 = 256;
                                        break;
                                    case '\n':
                                        num2 = 2048;
                                        break;
                                    case 11:
                                        num2 = 8192;
                                        break;
                                    case '\f':
                                        num2 = 32768;
                                        break;
                                    case '\r':
                                        num2 = 131072;
                                        break;
                                    case 14:
                                        num2 = Integer.valueOf(TLObject.FLAG_19);
                                        break;
                                    case 15:
                                        num2 = Integer.valueOf(TLObject.FLAG_21);
                                        break;
                                    case 16:
                                        num2 = Integer.valueOf(TLObject.FLAG_23);
                                        break;
                                    case 17:
                                        num2 = 33554432;
                                        break;
                                    case 19:
                                        num2 = 4096;
                                        break;
                                    case 20:
                                        num2 = 16384;
                                        break;
                                    case 21:
                                        num2 = 65536;
                                        break;
                                    case 22:
                                        num2 = 262144;
                                        break;
                                    case 23:
                                        num2 = 1048576;
                                        break;
                                    case 24:
                                        num2 = Integer.valueOf(TLObject.FLAG_22);
                                        break;
                                    case 25:
                                        num2 = 16777216;
                                        break;
                                }
                                if (num2 == null) {
                                    break;
                                } else {
                                    android.support.v4.media.a.w("Unknown HEVC level string: ", str4, "MediaCodecUtil");
                                    break;
                                }
                            }
                            num2 = null;
                            if (num2 == null) {
                            }
                        }
                    }
                    break;
                case 5:
                    if (split.length == 3) {
                        try {
                            if (MediaController.AUDIO_MIME_TYPE.equals(h5.o.d(Integer.parseInt(split[1], 16)))) {
                                int parseInt6 = Integer.parseInt(split[2]);
                                if (parseInt6 == 17) {
                                    i16 = 17;
                                } else if (parseInt6 != 20) {
                                    if (parseInt6 == 23) {
                                        i16 = 23;
                                    } else if (parseInt6 == 29) {
                                        i16 = 29;
                                    } else if (parseInt6 == 39) {
                                        i16 = 39;
                                    } else if (parseInt6 != 42) {
                                        switch (parseInt6) {
                                            case 1:
                                                i16 = 1;
                                                break;
                                            case 2:
                                                i16 = 2;
                                                break;
                                            case 3:
                                                i16 = 3;
                                                break;
                                            case 4:
                                                i16 = 4;
                                                break;
                                            case 5:
                                                i16 = 5;
                                                break;
                                            case 6:
                                                i16 = 6;
                                                break;
                                            default:
                                                i16 = -1;
                                                break;
                                        }
                                    } else {
                                        i16 = 42;
                                    }
                                }
                                if (i16 != -1) {
                                    break;
                                }
                            }
                        } catch (NumberFormatException unused3) {
                            android.support.v4.media.a.w("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                            break;
                        }
                    } else {
                        android.support.v4.media.a.w("Ignoring malformed MP4A codec string: ", str2, "MediaCodecUtil");
                        break;
                    }
                    break;
                case 6:
                    if (split.length < 3) {
                        android.support.v4.media.a.w("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                        break;
                    } else {
                        try {
                            int parseInt7 = Integer.parseInt(split[1]);
                            int parseInt8 = Integer.parseInt(split[2]);
                            int i19 = parseInt7 != 0 ? parseInt7 != 1 ? parseInt7 != 2 ? parseInt7 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i19 != -1) {
                                if (parseInt8 == 10) {
                                    i15 = 1;
                                } else if (parseInt8 == 11) {
                                    i15 = 2;
                                } else if (parseInt8 == 20) {
                                    i15 = 4;
                                } else if (parseInt8 == 21) {
                                    i15 = 8;
                                } else if (parseInt8 == 30) {
                                    i15 = 16;
                                } else if (parseInt8 == 31) {
                                    i15 = 32;
                                } else if (parseInt8 == 40) {
                                    i15 = 64;
                                } else if (parseInt8 == 41) {
                                    i15 = 128;
                                } else if (parseInt8 == 50) {
                                    i15 = 256;
                                } else if (parseInt8 != 51) {
                                    switch (parseInt8) {
                                        case 60:
                                            i15 = 2048;
                                            break;
                                        case 61:
                                            i15 = 4096;
                                            break;
                                        case 62:
                                            i15 = 8192;
                                            break;
                                        default:
                                            i15 = -1;
                                            break;
                                    }
                                } else {
                                    i15 = 512;
                                }
                                if (i15 != -1) {
                                    break;
                                } else {
                                    e2.c.q(parseInt8, "Unknown VP9 level: ", "MediaCodecUtil");
                                    break;
                                }
                            } else {
                                e2.c.q(parseInt7, "Unknown VP9 profile: ", "MediaCodecUtil");
                                break;
                            }
                        } catch (NumberFormatException unused4) {
                            android.support.v4.media.a.w("Ignoring malformed VP9 codec string: ", str2, "MediaCodecUtil");
                            return null;
                        }
                    }
            }
            return null;
        }
        if (split.length < 3) {
            android.support.v4.media.a.w("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
            return null;
        }
        Matcher matcher2 = pattern.matcher(split[1]);
        if (!matcher2.matches()) {
            android.support.v4.media.a.w("Ignoring malformed Dolby Vision codec string: ", str2, "MediaCodecUtil");
            return null;
        }
        String group2 = matcher2.group(1);
        if (group2 != null) {
            switch (group2.hashCode()) {
                case 1536:
                    if (group2.equals("00")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1537:
                    if (group2.equals("01")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1538:
                    if (group2.equals("02")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1539:
                    if (group2.equals("03")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1540:
                    if (group2.equals("04")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1541:
                    if (group2.equals("05")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1542:
                    if (group2.equals("06")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1543:
                    if (group2.equals("07")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1544:
                    if (group2.equals("08")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1545:
                    if (group2.equals("09")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 2;
                    break;
                case 2:
                    num = 4;
                    break;
                case 3:
                    num = 8;
                    break;
                case 4:
                    num = 16;
                    break;
                case 5:
                    num = 32;
                    break;
                case 6:
                    num = 64;
                    break;
                case 7:
                    num = 128;
                    break;
                case '\b':
                    num = 256;
                    break;
                case '\t':
                    num = 512;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num == null) {
            android.support.v4.media.a.w("Unknown Dolby Vision profile string: ", group2, "MediaCodecUtil");
            return null;
        }
        String str5 = split[2];
        if (str5 != null) {
            switch (str5.hashCode()) {
                case 1537:
                    if (str5.equals("01")) {
                        c12 = 0;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1538:
                    if (str5.equals("02")) {
                        c12 = 1;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1539:
                    if (str5.equals("03")) {
                        c12 = 2;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1540:
                    if (str5.equals("04")) {
                        c12 = 3;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1541:
                    if (str5.equals("05")) {
                        c12 = 4;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1542:
                    if (str5.equals("06")) {
                        c12 = 5;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1543:
                    if (str5.equals("07")) {
                        c12 = 6;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1544:
                    if (str5.equals("08")) {
                        c12 = 7;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1545:
                    if (str5.equals("09")) {
                        c12 = '\b';
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1567:
                    if (str5.equals("10")) {
                        c12 = '\t';
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1568:
                    if (str5.equals("11")) {
                        c12 = '\n';
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1569:
                    if (str5.equals("12")) {
                        c12 = 11;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1570:
                    if (str5.equals("13")) {
                        c12 = '\f';
                        break;
                    }
                    c12 = 65535;
                    break;
                default:
                    c12 = 65535;
                    break;
            }
            switch (c12) {
                case 0:
                    num2 = 1;
                    break;
                case 1:
                    num2 = 2;
                    break;
                case 2:
                    num2 = 4;
                    break;
                case 3:
                    num2 = 8;
                    break;
                case 4:
                    num2 = 16;
                    break;
                case 5:
                    num2 = 32;
                    break;
                case 6:
                    num2 = 64;
                    break;
                case 7:
                    num2 = 128;
                    break;
                case '\b':
                    num2 = 256;
                    break;
                case '\t':
                    num2 = 512;
                    break;
                case 11:
                    num2 = 2048;
                    break;
                case '\f':
                    num2 = 4096;
                    break;
            }
            if (num2 == null) {
                return new Pair(num, num2);
            }
            android.support.v4.media.a.w("Unknown Dolby Vision level string: ", str5, "MediaCodecUtil");
            return null;
        }
        num2 = null;
        if (num2 == null) {
        }
        return null;
    }

    public static synchronized List e(String str, boolean z4, boolean z10) {
        synchronized (y.class) {
            try {
                u uVar = new u(str, z4, z10);
                HashMap hashMap = b;
                List list = (List) hashMap.get(uVar);
                if (list != null) {
                    return list;
                }
                int i10 = d0.a;
                ArrayList f10 = f(uVar, i10 >= 21 ? new p2.w(z4, z10) : new h7.u(4));
                if (z4 && f10.isEmpty() && 21 <= i10 && i10 <= 23) {
                    f10 = f(uVar, new h7.u(4));
                    if (!f10.isEmpty()) {
                        h5.a.K("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) f10.get(0)).a);
                    }
                }
                a(str, f10);
                s8.v t6 = s8.v.t(f10);
                hashMap.put(uVar, t6);
                return t6;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f6 A[Catch: Exception -> 0x013e, TRY_ENTER, TryCatch #1 {Exception -> 0x013e, blocks: (B:3:0x000c, B:5:0x001f, B:7:0x0029, B:11:0x0115, B:12:0x0031, B:16:0x003d, B:53:0x00ee, B:56:0x00f6, B:58:0x00fc, B:61:0x011b, B:62:0x013c), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011b A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList f(u uVar, w wVar) {
        String c3;
        String str;
        String str2;
        String str3;
        u uVar2 = uVar;
        boolean z4 = uVar2.b;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = uVar2.a;
            int x10 = wVar.x();
            boolean B = wVar.B();
            int i10 = 0;
            while (i10 < x10) {
                MediaCodecInfo a2 = wVar.a(i10);
                int i11 = d0.a;
                if (i11 < 29 || !a2.isAlias()) {
                    String name = a2.getName();
                    if (g(a2, name, B, str4) && (c3 = c(a2, name, str4)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(c3);
                            boolean c10 = wVar.c("tunneled-playback", c3, capabilitiesForType);
                            boolean d = wVar.d("tunneled-playback", capabilitiesForType);
                            boolean z10 = uVar2.c;
                            if ((z10 || !d) && (!z10 || c10)) {
                                boolean c11 = wVar.c("secure-playback", c3, capabilitiesForType);
                                boolean d10 = wVar.d("secure-playback", capabilitiesForType);
                                if ((z4 || !d10) && (!z4 || c11)) {
                                    try {
                                        boolean h = h(a2, str4);
                                        i(a2, str4);
                                        if (i11 >= 29) {
                                            a2.isVendor();
                                        } else {
                                            String b10 = a7.b(a2.getName());
                                            if (!b10.startsWith("omx.google.") && !b10.startsWith("c2.android.")) {
                                                b10.startsWith("c2.google.");
                                            }
                                        }
                                        if (!(B && z4 == c11) && (B || z4)) {
                                            str3 = name;
                                            if (!B && c11) {
                                                str2 = str3;
                                                str = c3;
                                                try {
                                                    arrayList.add(n.h(str3 + ".secure", str4, str, capabilitiesForType, h, true));
                                                    break;
                                                } catch (Exception e) {
                                                    e = e;
                                                    if (d0.a > 23) {
                                                    }
                                                    h5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } else {
                                            str3 = name;
                                            str = c3;
                                            try {
                                            } catch (Exception e6) {
                                                e = e6;
                                                str2 = str3;
                                                if (d0.a > 23 || arrayList.isEmpty()) {
                                                    h5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                h5.a.o("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i10++;
                                                uVar2 = uVar;
                                            }
                                            try {
                                                arrayList.add(n.h(str3, str4, str, capabilitiesForType, h, false));
                                            } catch (Exception e10) {
                                                e = e10;
                                                str2 = str3;
                                                str = c3;
                                                if (d0.a > 23) {
                                                }
                                                h5.a.o("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        str2 = name;
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str = c3;
                            str2 = name;
                        }
                    }
                }
                i10++;
                uVar2 = uVar;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new v("Failed to query underlying media codecs", e13);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z4, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z4 && str.endsWith(".secure")) {
            return false;
        }
        int i10 = d0.a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = d0.b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(d0.c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = d0.b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = d0.b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(d0.c))) {
            String str6 = d0.b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(d0.c)) {
            String str7 = d0.b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && d0.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        return d0.a >= 29 ? mediaCodecInfo.isHardwareAccelerated() : !i(mediaCodecInfo, str);
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str) {
        if (d0.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (h5.o.h(str)) {
            return true;
        }
        String b10 = a7.b(mediaCodecInfo.getName());
        if (b10.startsWith("arc.")) {
            return false;
        }
        if (b10.startsWith("omx.google.") || b10.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((b10.startsWith("omx.sec.") && b10.contains(".sw.")) || b10.equals("omx.qcom.video.decoder.hevcswvdec") || b10.startsWith("c2.android.") || b10.startsWith("c2.google.")) {
            return true;
        }
        return (b10.startsWith("omx.") || b10.startsWith("c2.")) ? false : true;
    }

    public static int j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (c == -1) {
            int i11 = 0;
            List e = e(MediaController.VIDEO_MIME_TYPE, false, false);
            n nVar = e.isEmpty() ? null : (n) e.get(0);
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = codecProfileLevelArr[i11].level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = TLObject.FLAG_21;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case TLObject.FLAG_19 /* 524288 */:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    i12 = Math.max(i10, i12);
                    i11++;
                }
                i11 = Math.max(i12, d0.a >= 21 ? 345600 : 172800);
            }
            c = i11;
        }
        return c;
    }
}
