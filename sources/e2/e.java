package e2;

import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import b2.r0;
import com.google.android.gms.internal.vision.e2;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class e {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        Object[] objArr = {b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        String str = d0.a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(b2.s sVar) {
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        int parseInt;
        int parseInt2;
        int i14;
        int i15;
        int i16;
        char c11;
        int i17;
        Integer num;
        char c12;
        Integer num2;
        char c13;
        Integer num3 = 1;
        String str = sVar.k;
        String str2 = sVar.k;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (!"video/dolby-vision".equals(sVar.r)) {
            String str3 = split[0];
            str3.getClass();
            switch (str3.hashCode()) {
                case 2986313:
                    if (str3.equals("ac-4")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3004662:
                    if (str3.equals("av01")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3224753:
                    if (str3.equals("iamf")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3475740:
                    if (str3.equals("s263")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            int i18 = 8192;
            switch (c10) {
                case 0:
                    if (split.length != 4) {
                        e2.s("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 == 0) {
                                if (parseInt4 == 0) {
                                    i10 = 257;
                                }
                                i10 = -1;
                            } else if (parseInt3 != 1) {
                                if (parseInt3 == 2) {
                                    if (parseInt4 == 1) {
                                        i10 = 1026;
                                    } else if (parseInt4 == 2) {
                                        i10 = 1028;
                                    }
                                }
                                i10 = -1;
                            } else if (parseInt4 == 0) {
                                i10 = 513;
                            } else {
                                if (parseInt4 == 1) {
                                    i10 = 514;
                                }
                                i10 = -1;
                            }
                            if (i10 != -1) {
                                int i19 = parseInt5 != 0 ? parseInt5 != 1 ? parseInt5 != 2 ? parseInt5 != 3 ? parseInt5 != 4 ? -1 : 16 : 8 : 4 : 2 : 1;
                                if (i19 != -1) {
                                    break;
                                } else {
                                    e2.n(parseInt5, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                a.n("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt3 + "." + parseInt4);
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            e2.s("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 1:
                    b2.j jVar = sVar.H;
                    if (split.length < 4) {
                        e2.s("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt6 = Integer.parseInt(split[1]);
                            int parseInt7 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt8 = Integer.parseInt(split[3]);
                            if (parseInt6 == 0) {
                                if (parseInt8 != 8 && parseInt8 != 10) {
                                    e2.n(parseInt8, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    int i20 = parseInt8 == 8 ? 1 : (jVar == null || !(jVar.d != null || (i11 = jVar.c) == 7 || i11 == 6)) ? 2 : 4096;
                                    switch (parseInt7) {
                                        case 0:
                                            i12 = -1;
                                            i13 = 1;
                                            break;
                                        case 1:
                                            i12 = -1;
                                            i13 = 2;
                                            break;
                                        case 2:
                                            i12 = -1;
                                            i13 = 4;
                                            break;
                                        case 3:
                                            i12 = -1;
                                            i13 = 8;
                                            break;
                                        case 4:
                                            i12 = -1;
                                            i13 = 16;
                                            break;
                                        case 5:
                                            i12 = -1;
                                            i13 = 32;
                                            break;
                                        case 6:
                                            i12 = -1;
                                            i13 = 64;
                                            break;
                                        case 7:
                                            i12 = -1;
                                            i13 = 128;
                                            break;
                                        case 8:
                                            i12 = -1;
                                            i13 = 256;
                                            break;
                                        case 9:
                                            i12 = -1;
                                            i13 = 512;
                                            break;
                                        case 10:
                                            i12 = -1;
                                            i13 = 1024;
                                            break;
                                        case 11:
                                            i12 = -1;
                                            i13 = 2048;
                                            break;
                                        case 12:
                                            i12 = -1;
                                            i13 = 4096;
                                            break;
                                        case 13:
                                            i12 = -1;
                                            i13 = 8192;
                                            break;
                                        case 14:
                                            i13 = 16384;
                                            i12 = -1;
                                            break;
                                        case 15:
                                            i13 = 32768;
                                            i12 = -1;
                                            break;
                                        case 16:
                                            i13 = 65536;
                                            i12 = -1;
                                            break;
                                        case 17:
                                            i13 = 131072;
                                            i12 = -1;
                                            break;
                                        case 18:
                                            i13 = 262144;
                                            i12 = -1;
                                            break;
                                        case 19:
                                            i13 = TLObject.FLAG_19;
                                            i12 = -1;
                                            break;
                                        case 20:
                                            i13 = 1048576;
                                            i12 = -1;
                                            break;
                                        case 21:
                                            i13 = TLObject.FLAG_21;
                                            i12 = -1;
                                            break;
                                        case 22:
                                            i13 = TLObject.FLAG_22;
                                            i12 = -1;
                                            break;
                                        case 23:
                                            i13 = TLObject.FLAG_23;
                                            i12 = -1;
                                            break;
                                        default:
                                            i12 = -1;
                                            i13 = -1;
                                            break;
                                    }
                                    if (i13 != i12) {
                                        break;
                                    } else {
                                        e2.n(parseInt7, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                }
                            } else {
                                e2.n(parseInt6, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            e2.s("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                    break;
                case 2:
                case 3:
                    if (split.length < 2) {
                        e2.s("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                if (split.length < 3) {
                                    a.n("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                    break;
                                } else {
                                    parseInt = Integer.parseInt(split[1]);
                                    parseInt2 = Integer.parseInt(split[2]);
                                }
                            } else {
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            }
                            if (parseInt == 66) {
                                i14 = -1;
                                i15 = 1;
                            } else if (parseInt == 77) {
                                i14 = -1;
                                i15 = 2;
                            } else if (parseInt == 88) {
                                i14 = -1;
                                i15 = 4;
                            } else if (parseInt == 100) {
                                i14 = -1;
                                i15 = 8;
                            } else if (parseInt == 110) {
                                i14 = -1;
                                i15 = 16;
                            } else if (parseInt == 122) {
                                i14 = -1;
                                i15 = 32;
                            } else if (parseInt != 244) {
                                i14 = -1;
                                i15 = -1;
                            } else {
                                i14 = -1;
                                i15 = 64;
                            }
                            if (i15 != i14) {
                                switch (parseInt2) {
                                    case 10:
                                        i16 = 1;
                                        break;
                                    case 11:
                                        i16 = 4;
                                        break;
                                    case 12:
                                        i16 = 8;
                                        break;
                                    case 13:
                                        i16 = 16;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 20:
                                                i16 = 32;
                                                break;
                                            case 21:
                                                i16 = 64;
                                                break;
                                            case 22:
                                                i16 = 128;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                                        i16 = 256;
                                                        break;
                                                    case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                                        i16 = 512;
                                                        break;
                                                    case 32:
                                                        i16 = 1024;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                                                i16 = 2048;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                                                i16 = 4096;
                                                                break;
                                                            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                                i16 = 8192;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                        i16 = 16384;
                                                                        break;
                                                                    case 51:
                                                                        i16 = 32768;
                                                                        break;
                                                                    case 52:
                                                                        i16 = 65536;
                                                                        break;
                                                                    default:
                                                                        i16 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i16 != -1) {
                                    break;
                                } else {
                                    e2.n(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                e2.n(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused3) {
                            e2.s("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 6:
                    if (split.length < 4) {
                        e2.s("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt9 = 1 << (Integer.parseInt(split[1]) + 16);
                            String str4 = split[3];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 2464863:
                                    if (str4.equals("Opus")) {
                                        c11 = 0;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 3114792:
                                    if (str4.equals("fLaC")) {
                                        c11 = 1;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 3238865:
                                    if (str4.equals("ipcm")) {
                                        c11 = 2;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 3356560:
                                    if (str4.equals("mp4a")) {
                                        c11 = 3;
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
                                    i17 = 1;
                                    break;
                                case 1:
                                    i17 = 4;
                                    break;
                                case 2:
                                    i17 = 8;
                                    break;
                                case 3:
                                    i17 = 2;
                                    break;
                                default:
                                    a.n("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + split[3]);
                                    break;
                            }
                            break;
                        } catch (NumberFormatException e7) {
                            a.o("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + split[1], e7);
                            return null;
                        }
                    }
                case 7:
                    if (split.length == 3) {
                        try {
                            if (MediaController.AUDIO_MIME_TYPE.equals(r0.e(Integer.parseInt(split[1], 16)))) {
                                int parseInt10 = Integer.parseInt(split[2]);
                                int i21 = 17;
                                if (parseInt10 != 17) {
                                    i21 = 20;
                                    if (parseInt10 != 20) {
                                        i21 = 23;
                                        if (parseInt10 != 23) {
                                            i21 = 29;
                                            if (parseInt10 != 29) {
                                                i21 = 39;
                                                if (parseInt10 != 39) {
                                                    i21 = 42;
                                                    if (parseInt10 != 42) {
                                                        switch (parseInt10) {
                                                            case 1:
                                                                i21 = 1;
                                                                break;
                                                            case 2:
                                                                i21 = 2;
                                                                break;
                                                            case 3:
                                                                i21 = 3;
                                                                break;
                                                            case 4:
                                                                i21 = 4;
                                                                break;
                                                            case 5:
                                                                i21 = 5;
                                                                break;
                                                            case 6:
                                                                i21 = 6;
                                                                break;
                                                            default:
                                                                i21 = -1;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i21 != -1) {
                                    break;
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            e2.s("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        e2.s("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case '\b':
                    Pair pair = new Pair(num3, num3);
                    if (split.length < 3) {
                        e2.s("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            break;
                        } catch (NumberFormatException unused5) {
                            e2.s("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                            return pair;
                        }
                    }
                case '\t':
                    if (split.length < 3) {
                        e2.s("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt11 = Integer.parseInt(split[1]);
                            int parseInt12 = Integer.parseInt(split[2]);
                            int i22 = parseInt11 != 0 ? parseInt11 != 1 ? parseInt11 != 2 ? parseInt11 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i22 != -1) {
                                if (parseInt12 == 10) {
                                    i18 = 1;
                                } else if (parseInt12 == 11) {
                                    i18 = 2;
                                } else if (parseInt12 == 20) {
                                    i18 = 4;
                                } else if (parseInt12 == 21) {
                                    i18 = 8;
                                } else if (parseInt12 == 30) {
                                    i18 = 16;
                                } else if (parseInt12 == 31) {
                                    i18 = 32;
                                } else if (parseInt12 == 40) {
                                    i18 = 64;
                                } else if (parseInt12 == 41) {
                                    i18 = 128;
                                } else if (parseInt12 == 50) {
                                    i18 = 256;
                                } else if (parseInt12 != 51) {
                                    switch (parseInt12) {
                                        case 60:
                                            i18 = 2048;
                                            break;
                                        case 61:
                                            i18 = 4096;
                                            break;
                                        case 62:
                                            break;
                                        default:
                                            i18 = -1;
                                            break;
                                    }
                                } else {
                                    i18 = 512;
                                }
                                if (i18 != -1) {
                                    break;
                                } else {
                                    e2.n(parseInt12, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                e2.n(parseInt11, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused6) {
                            e2.s("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
            }
            return null;
        }
        if (split.length < 3) {
            e2.s("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(split[1]);
        if (!matcher.matches()) {
            e2.s("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        if (group == null) {
            num = 16;
        } else {
            switch (group.hashCode()) {
                case 1536:
                    num = 16;
                    if (group.equals("00")) {
                        c12 = 0;
                        break;
                    }
                    c12 = 65535;
                    break;
                case 1537:
                    if (group.equals("01")) {
                        num = 16;
                        c12 = 1;
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1538:
                    if (group.equals("02")) {
                        num = 16;
                        c12 = 2;
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1539:
                    if (group.equals("03")) {
                        num = 16;
                        c12 = 3;
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1540:
                    if (group.equals("04")) {
                        num = 16;
                        c12 = 4;
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1541:
                    if (group.equals("05")) {
                        num = 16;
                        c12 = 5;
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1542:
                    if (group.equals("06")) {
                        num = 16;
                        c12 = 6;
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1543:
                    if (group.equals("07")) {
                        num = 16;
                        c12 = 7;
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1544:
                    if (group.equals("08")) {
                        num = 16;
                        c12 = '\b';
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1545:
                    if (group.equals("09")) {
                        num = 16;
                        c12 = '\t';
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                case 1567:
                    if (group.equals("10")) {
                        num = 16;
                        c12 = '\n';
                        break;
                    }
                    num = 16;
                    c12 = 65535;
                    break;
                default:
                    num = 16;
                    c12 = 65535;
                    break;
            }
            switch (c12) {
                case 0:
                    num2 = num3;
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
                    num2 = num;
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
                case '\n':
                    num2 = 1024;
                    break;
            }
            if (num2 != null) {
                e2.s("Unknown Dolby Vision profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            String str5 = split[2];
            if (str5 != null) {
                switch (str5.hashCode()) {
                    case 1537:
                        if (str5.equals("01")) {
                            c13 = 0;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1538:
                        if (str5.equals("02")) {
                            c13 = 1;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1539:
                        if (str5.equals("03")) {
                            c13 = 2;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1540:
                        if (str5.equals("04")) {
                            c13 = 3;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1541:
                        if (str5.equals("05")) {
                            c13 = 4;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1542:
                        if (str5.equals("06")) {
                            c13 = 5;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1543:
                        if (str5.equals("07")) {
                            c13 = 6;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1544:
                        if (str5.equals("08")) {
                            c13 = 7;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1545:
                        if (str5.equals("09")) {
                            c13 = '\b';
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1567:
                        if (str5.equals("10")) {
                            c13 = '\t';
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1568:
                        if (str5.equals("11")) {
                            c13 = '\n';
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1569:
                        if (str5.equals("12")) {
                            c13 = 11;
                            break;
                        }
                        c13 = 65535;
                        break;
                    case 1570:
                        if (str5.equals("13")) {
                            c13 = '\f';
                            break;
                        }
                        c13 = 65535;
                        break;
                    default:
                        c13 = 65535;
                        break;
                }
                switch (c13) {
                    case 1:
                        num3 = 2;
                        break;
                    case 2:
                        num3 = 4;
                        break;
                    case 3:
                        num3 = 8;
                        break;
                    case 4:
                        num3 = num;
                        break;
                    case 5:
                        num3 = 32;
                        break;
                    case 6:
                        num3 = 64;
                        break;
                    case 7:
                        num3 = 128;
                        break;
                    case '\b':
                        num3 = 256;
                        break;
                    case '\t':
                        num3 = 512;
                        break;
                    case '\n':
                        num3 = 1024;
                        break;
                    case 11:
                        num3 = 2048;
                        break;
                    case '\f':
                        num3 = 4096;
                        break;
                }
                if (num3 == null) {
                    return new Pair(num2, num3);
                }
                e2.s("Unknown Dolby Vision level string: ", str5, "CodecSpecificDataUtil");
                return null;
            }
            num3 = null;
            if (num3 == null) {
            }
        }
        num2 = null;
        if (num2 != null) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0169, code lost:
    
        if (r12.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0275  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair c(String str, String[] strArr, b2.j jVar) {
        int i10;
        Integer num;
        if (strArr.length < 4) {
            e2.s("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            e2.s("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        char c10 = 6;
        if ("1".equals(group)) {
            i10 = 1;
        } else if ("2".equals(group)) {
            i10 = (jVar == null || jVar.c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                e2.s("Unknown HEVC profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            i10 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 74758:
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c10 = '\r';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c10 = 14;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c10 = 15;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c10 = 16;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c10 = 17;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c10 = 18;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        c10 = 19;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c10 = 20;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c10 = 21;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c10 = 22;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c10 = 23;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c10 = 24;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
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
                    num = 2;
                    break;
                case 1:
                    num = 8;
                    break;
                case 2:
                    num = 32;
                    break;
                case 3:
                    num = 128;
                    break;
                case 4:
                    num = 512;
                    break;
                case 5:
                    num = 1;
                    break;
                case 6:
                    num = 4;
                    break;
                case 7:
                    num = 16;
                    break;
                case '\b':
                    num = 64;
                    break;
                case '\t':
                    num = 256;
                    break;
                case '\n':
                    num = 2048;
                    break;
                case 11:
                    num = 8192;
                    break;
                case '\f':
                    num = 32768;
                    break;
                case '\r':
                    num = 131072;
                    break;
                case 14:
                    num = Integer.valueOf(TLObject.FLAG_19);
                    break;
                case 15:
                    num = Integer.valueOf(TLObject.FLAG_21);
                    break;
                case 16:
                    num = Integer.valueOf(TLObject.FLAG_23);
                    break;
                case 17:
                    num = 33554432;
                    break;
                case 18:
                    num = 1024;
                    break;
                case 19:
                    num = 4096;
                    break;
                case 20:
                    num = 16384;
                    break;
                case 21:
                    num = 65536;
                    break;
                case 22:
                    num = 262144;
                    break;
                case 23:
                    num = 1048576;
                    break;
                case 24:
                    num = Integer.valueOf(TLObject.FLAG_22);
                    break;
                case 25:
                    num = 16777216;
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i10), num);
            }
            e2.s("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        num = null;
        if (num == null) {
        }
    }
}
