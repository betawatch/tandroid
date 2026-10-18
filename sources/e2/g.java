package e2;

import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import b2.v0;
import com.google.android.gms.internal.play_billing.k3;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class g {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {"", "A", "B", "C"};
    public static final Pattern c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i10, int i11, int i12, int i13, boolean z10, int[] iArr) {
        Object[] objArr = {b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        String str = m0.a;
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
    /* JADX WARN: Removed duplicated region for block: B:153:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x060b A[Catch: NumberFormatException -> 0x0615, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0615, blocks: (B:343:0x05be, B:345:0x05d2, B:356:0x05f0, B:359:0x060b), top: B:342:0x05be }] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x093e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(b2.w wVar) {
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int parseInt;
        int parseInt2;
        int i15;
        int i16;
        int i17;
        char c11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        char c12;
        char c13;
        Integer num;
        char c14;
        Integer num2 = 1024;
        String str = wVar.k;
        b2.n nVar = wVar.I;
        String str2 = wVar.k;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (!"video/dolby-vision".equals(wVar.s)) {
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
                case 3001066:
                    if (str3.equals("apv1")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3004662:
                    if (str3.equals("av01")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3224753:
                    if (str3.equals("iamf")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3475740:
                    if (str3.equals("s263")) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3631854:
                    if (str3.equals("vvc1")) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3632040:
                    if (str3.equals("vvi1")) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            int i23 = 8192;
            switch (c10) {
                case 0:
                    if (split.length != 4) {
                        k3.r("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
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
                            if (i10 == -1) {
                                a.l("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt3 + "." + parseInt4);
                                break;
                            } else {
                                if (parseInt5 == 0) {
                                    i11 = 1;
                                } else if (parseInt5 == 1) {
                                    i11 = 2;
                                } else if (parseInt5 == 2) {
                                    i11 = 4;
                                } else if (parseInt5 == 3) {
                                    i11 = 8;
                                } else if (parseInt5 != 4) {
                                    i12 = -1;
                                    i11 = -1;
                                    if (i11 == i12) {
                                        break;
                                    } else {
                                        a1.g.x(parseInt5, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    i11 = 16;
                                }
                                i12 = -1;
                                if (i11 == i12) {
                                }
                            }
                        } catch (NumberFormatException unused) {
                            k3.r("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 1:
                    if (split.length < 4) {
                        k3.r("Ignoring malformed APV codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt6 = Integer.parseInt(split[1].substring(4));
                            int parseInt7 = Integer.parseInt(split[2].substring(4));
                            int parseInt8 = Integer.parseInt(split[3].substring(4));
                            if (parseInt6 != 33) {
                                if (parseInt6 != 44) {
                                    a1.g.x(parseInt6, "Ignoring invalid APV profile: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                i23 = 1;
                            }
                            int i24 = (parseInt7 / 30) * 2;
                            if (parseInt7 % 30 == 0) {
                                i24--;
                            }
                            break;
                        } catch (NumberFormatException e) {
                            a.m("CodecSpecificDataUtil", "Ignoring malformed APV codec string: " + str2, e);
                            return null;
                        }
                    }
                case 2:
                    if (split.length < 4) {
                        k3.r("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt9 = Integer.parseInt(split[1]);
                            int parseInt10 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt11 = Integer.parseInt(split[3]);
                            if (parseInt9 == 0) {
                                int i25 = 8;
                                if (parseInt11 != 8 && parseInt11 != 10) {
                                    a1.g.x(parseInt11, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    int i26 = parseInt11 == 8 ? 1 : (nVar == null || !(nVar.d != null || (i13 = nVar.c) == 7 || i13 == 6)) ? 2 : 4096;
                                    switch (parseInt10) {
                                        case 0:
                                            i25 = 1;
                                            break;
                                        case 1:
                                            i25 = 2;
                                            break;
                                        case 2:
                                            i25 = 4;
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i25 = 16;
                                            break;
                                        case 5:
                                            i25 = 32;
                                            break;
                                        case 6:
                                            i25 = 64;
                                            break;
                                        case 7:
                                            i25 = 128;
                                            break;
                                        case 8:
                                            i25 = 256;
                                            break;
                                        case 9:
                                            i25 = 512;
                                            break;
                                        case 10:
                                            i25 = 1024;
                                            break;
                                        case 11:
                                            i25 = 2048;
                                            break;
                                        case 12:
                                            i25 = 4096;
                                            break;
                                        case 13:
                                            i25 = 8192;
                                            break;
                                        case 14:
                                            i25 = 16384;
                                            break;
                                        case 15:
                                            i25 = 32768;
                                            break;
                                        case 16:
                                            i25 = 65536;
                                            break;
                                        case 17:
                                            i25 = 131072;
                                            break;
                                        case 18:
                                            i25 = 262144;
                                            break;
                                        case 19:
                                            i25 = TLObject.FLAG_19;
                                            break;
                                        case 20:
                                            i25 = 1048576;
                                            break;
                                        case 21:
                                            i25 = TLObject.FLAG_21;
                                            break;
                                        case 22:
                                            i25 = TLObject.FLAG_22;
                                            break;
                                        case 23:
                                            i25 = TLObject.FLAG_23;
                                            break;
                                        default:
                                            i25 = -1;
                                            break;
                                    }
                                    if (i25 != -1) {
                                        break;
                                    } else {
                                        a1.g.x(parseInt10, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                }
                            } else {
                                a1.g.x(parseInt9, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            k3.r("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                    break;
                case 3:
                case 4:
                    if (split.length < 2) {
                        k3.r("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                i14 = 16;
                                if (split.length < 3) {
                                    a.l("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                    break;
                                } else {
                                    parseInt = Integer.parseInt(split[1]);
                                    parseInt2 = Integer.parseInt(split[2]);
                                }
                            } else {
                                i14 = 16;
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            }
                            if (parseInt != 66) {
                                if (parseInt == 77) {
                                    i16 = -1;
                                    i15 = 2;
                                } else if (parseInt == 88) {
                                    i16 = -1;
                                    i15 = 4;
                                } else if (parseInt == 100) {
                                    i16 = -1;
                                    i15 = 8;
                                } else if (parseInt == 110) {
                                    i15 = i14;
                                } else if (parseInt == 122) {
                                    i16 = -1;
                                    i15 = 32;
                                } else if (parseInt != 244) {
                                    i16 = -1;
                                    i15 = -1;
                                } else {
                                    i16 = -1;
                                    i15 = 64;
                                }
                                if (i15 == i16) {
                                    switch (parseInt2) {
                                        case 10:
                                            i14 = 1;
                                            i17 = -1;
                                            break;
                                        case 11:
                                            i17 = -1;
                                            i14 = 4;
                                            break;
                                        case 12:
                                            i17 = -1;
                                            i14 = 8;
                                            break;
                                        case 13:
                                            i17 = -1;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 20:
                                                    i17 = -1;
                                                    i14 = 32;
                                                    break;
                                                case 21:
                                                    i17 = -1;
                                                    i14 = 64;
                                                    break;
                                                case 22:
                                                    i17 = -1;
                                                    i14 = 128;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case MessageObject.TYPE_GIFT_STARS /* 30 */:
                                                            i14 = 256;
                                                            i17 = -1;
                                                            break;
                                                        case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                                                            i17 = -1;
                                                            i14 = 512;
                                                            break;
                                                        case 32:
                                                            i17 = -1;
                                                            i14 = 1024;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                                                    i17 = -1;
                                                                    i14 = 2048;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                                                    i17 = -1;
                                                                    i14 = 4096;
                                                                    break;
                                                                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                                                    i14 = 8192;
                                                                    i17 = -1;
                                                                    break;
                                                                default:
                                                                    switch (parseInt2) {
                                                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                                            i14 = 16384;
                                                                            i17 = -1;
                                                                            break;
                                                                        case 51:
                                                                            i14 = 32768;
                                                                            i17 = -1;
                                                                            break;
                                                                        case 52:
                                                                            i14 = 65536;
                                                                            i17 = -1;
                                                                            break;
                                                                        default:
                                                                            i17 = -1;
                                                                            i14 = -1;
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                    if (i14 != i17) {
                                        break;
                                    } else {
                                        a1.g.x(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    a1.g.x(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                i15 = 1;
                            }
                            i16 = -1;
                            if (i15 == i16) {
                            }
                        } catch (NumberFormatException unused3) {
                            k3.r("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 7:
                    if (split.length < 4) {
                        k3.r("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt12 = 1 << (Integer.parseInt(split[1]) + 16);
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
                                    i18 = 1;
                                    break;
                                case 1:
                                    i18 = 4;
                                    break;
                                case 2:
                                    i18 = 8;
                                    break;
                                case 3:
                                    i18 = 2;
                                    break;
                                default:
                                    a.l("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + split[3]);
                                    break;
                            }
                            break;
                        } catch (NumberFormatException e7) {
                            a.m("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + split[1], e7);
                            return null;
                        }
                    }
                case '\b':
                    if (split.length == 3) {
                        try {
                            if (MediaController.AUDIO_MIME_TYPE.equals(v0.e(Integer.parseInt(split[1], 16)))) {
                                int parseInt13 = Integer.parseInt(split[2]);
                                int i27 = 17;
                                if (parseInt13 != 17) {
                                    if (parseInt13 != 20) {
                                        i27 = 23;
                                        if (parseInt13 != 23) {
                                            i27 = 29;
                                            if (parseInt13 != 29) {
                                                i27 = 39;
                                                if (parseInt13 != 39) {
                                                    i27 = 42;
                                                    if (parseInt13 != 42) {
                                                        switch (parseInt13) {
                                                            case 1:
                                                                i27 = 1;
                                                                break;
                                                            case 2:
                                                                i19 = -1;
                                                                i27 = 2;
                                                                break;
                                                            case 3:
                                                                i27 = 3;
                                                                break;
                                                            case 4:
                                                                i19 = -1;
                                                                i27 = 4;
                                                                break;
                                                            case 5:
                                                                i27 = 5;
                                                                break;
                                                            case 6:
                                                                i19 = -1;
                                                                i27 = 6;
                                                                break;
                                                            default:
                                                                i19 = -1;
                                                                i27 = -1;
                                                                break;
                                                        }
                                                        if (i27 != i19) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        i27 = 20;
                                    }
                                }
                                i19 = -1;
                                if (i27 != i19) {
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            k3.r("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        k3.r("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case '\t':
                    Pair pair = new Pair(1, 1);
                    if (split.length < 3) {
                        k3.r("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            break;
                        } catch (NumberFormatException unused5) {
                            k3.r("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                            return pair;
                        }
                    }
                case '\n':
                    if (split.length < 3) {
                        k3.r("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt14 = Integer.parseInt(split[1]);
                            int parseInt15 = Integer.parseInt(split[2]);
                            int i28 = parseInt14 != 0 ? parseInt14 != 1 ? parseInt14 != 2 ? parseInt14 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i28 == -1) {
                                a1.g.x(parseInt14, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                break;
                            } else {
                                if (parseInt15 != 10) {
                                    if (parseInt15 == 11) {
                                        i21 = -1;
                                        i20 = 2;
                                    } else if (parseInt15 == 20) {
                                        i21 = -1;
                                        i20 = 4;
                                    } else if (parseInt15 == 21) {
                                        i21 = -1;
                                        i20 = 8;
                                    } else if (parseInt15 == 30) {
                                        i21 = -1;
                                        i20 = 16;
                                    } else if (parseInt15 == 31) {
                                        i21 = -1;
                                        i20 = 32;
                                    } else if (parseInt15 == 40) {
                                        i21 = -1;
                                        i20 = 64;
                                    } else if (parseInt15 == 41) {
                                        i21 = -1;
                                        i20 = 128;
                                    } else if (parseInt15 == 50) {
                                        i20 = 256;
                                    } else if (parseInt15 != 51) {
                                        switch (parseInt15) {
                                            case 60:
                                                i21 = -1;
                                                i20 = 2048;
                                                break;
                                            case 61:
                                                i21 = -1;
                                                i20 = 4096;
                                                break;
                                            case 62:
                                                i20 = 8192;
                                                break;
                                            default:
                                                i21 = -1;
                                                i20 = -1;
                                                break;
                                        }
                                    } else {
                                        i21 = -1;
                                        i20 = 512;
                                    }
                                    if (i20 == i21) {
                                        break;
                                    } else {
                                        a1.g.x(parseInt15, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                } else {
                                    i20 = 1;
                                }
                                i21 = -1;
                                if (i20 == i21) {
                                }
                            }
                        } catch (NumberFormatException unused6) {
                            k3.r("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 11:
                case '\f':
                    if (split.length < 3) {
                        k3.r("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt16 = Integer.parseInt(split[1]);
                            if (parseInt16 != 1) {
                                if (parseInt16 != 65) {
                                    a.l("CodecSpecificDataUtil", "Unknown VVC profile IDC: " + split[1]);
                                    break;
                                } else {
                                    i22 = 4;
                                }
                            } else {
                                i22 = (nVar == null || nVar.c != 6) ? (nVar == null || nVar.e != 8) ? 2 : 1 : 4096;
                            }
                            String str5 = split[2];
                            if (str5 != null) {
                                switch (str5.hashCode()) {
                                    case 70918:
                                        if (str5.equals("H64")) {
                                            c12 = 0;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 70921:
                                        if (str5.equals("H67")) {
                                            c12 = 1;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 70976:
                                        if (str5.equals("H80")) {
                                            c12 = 2;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 70979:
                                        if (str5.equals("H83")) {
                                            c12 = 3;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 70982:
                                        if (str5.equals("H86")) {
                                            c12 = 4;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 71013:
                                        if (str5.equals("H96")) {
                                            c12 = 5;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74609:
                                        if (str5.equals("L16")) {
                                            c12 = 6;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74667:
                                        if (str5.equals("L32")) {
                                            c12 = 7;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74670:
                                        if (str5.equals("L35")) {
                                            c12 = '\b';
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74704:
                                        if (str5.equals("L48")) {
                                            c12 = '\t';
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74728:
                                        if (str5.equals("L51")) {
                                            c12 = '\n';
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74762:
                                        if (str5.equals("L64")) {
                                            c12 = 11;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74765:
                                        if (str5.equals("L67")) {
                                            c12 = '\f';
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74820:
                                        if (str5.equals("L80")) {
                                            c12 = '\r';
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74823:
                                        if (str5.equals("L83")) {
                                            c12 = 14;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74826:
                                        if (str5.equals("L86")) {
                                            c12 = 15;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 74857:
                                        if (str5.equals("L96")) {
                                            c12 = 16;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 2193610:
                                        if (str5.equals("H112")) {
                                            c12 = 17;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 2193647:
                                        if (str5.equals("H128")) {
                                            c12 = 18;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 2193705:
                                        if (str5.equals("H144")) {
                                            c12 = 19;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 2312774:
                                        if (str5.equals("L112")) {
                                            c12 = 20;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 2312811:
                                        if (str5.equals("L128")) {
                                            c12 = 21;
                                            break;
                                        }
                                        c12 = 65535;
                                        break;
                                    case 2312869:
                                        if (str5.equals("L144")) {
                                            c12 = 22;
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
                                        num2 = 64;
                                        break;
                                    case 1:
                                        num2 = 256;
                                        break;
                                    case 3:
                                        num2 = 4096;
                                        break;
                                    case 4:
                                        num2 = 16384;
                                        break;
                                    case 5:
                                        num2 = 65536;
                                        break;
                                    case 6:
                                        num2 = 1;
                                        break;
                                    case 7:
                                        num2 = 2;
                                        break;
                                    case '\b':
                                        num2 = 4;
                                        break;
                                    case '\t':
                                        num2 = 8;
                                        break;
                                    case '\n':
                                        num2 = 16;
                                        break;
                                    case 11:
                                        num2 = 32;
                                        break;
                                    case '\f':
                                        num2 = 128;
                                        break;
                                    case '\r':
                                        num2 = 512;
                                        break;
                                    case 14:
                                        num2 = 2048;
                                        break;
                                    case 15:
                                        num2 = 8192;
                                        break;
                                    case 16:
                                        num2 = 32768;
                                        break;
                                    case 17:
                                        num2 = 262144;
                                        break;
                                    case 18:
                                        num2 = 1048576;
                                        break;
                                    case 19:
                                        num2 = Integer.valueOf(TLObject.FLAG_22);
                                        break;
                                    case 20:
                                        num2 = 131072;
                                        break;
                                    case 21:
                                        num2 = Integer.valueOf(TLObject.FLAG_19);
                                        break;
                                    case 22:
                                        num2 = Integer.valueOf(TLObject.FLAG_21);
                                        break;
                                }
                                if (num2 == null) {
                                    break;
                                } else {
                                    k3.r("Unknown VVC level string: ", str5, "CodecSpecificDataUtil");
                                    break;
                                }
                            }
                            num2 = null;
                            if (num2 == null) {
                            }
                        } catch (NumberFormatException unused7) {
                            k3.r("Ignoring malformed VVC codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                    break;
            }
            return null;
        }
        if (split.length < 3) {
            k3.r("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(split[1]);
        if (!matcher.matches()) {
            k3.r("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        if (group != null) {
            switch (group.hashCode()) {
                case 1536:
                    if (group.equals("00")) {
                        c13 = 0;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1537:
                    if (group.equals("01")) {
                        c13 = 1;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1538:
                    if (group.equals("02")) {
                        c13 = 2;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1539:
                    if (group.equals("03")) {
                        c13 = 3;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1540:
                    if (group.equals("04")) {
                        c13 = 4;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1541:
                    if (group.equals("05")) {
                        c13 = 5;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1542:
                    if (group.equals("06")) {
                        c13 = 6;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1543:
                    if (group.equals("07")) {
                        c13 = 7;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1544:
                    if (group.equals("08")) {
                        c13 = '\b';
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1545:
                    if (group.equals("09")) {
                        c13 = '\t';
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1567:
                    if (group.equals("10")) {
                        c13 = '\n';
                        break;
                    }
                    c13 = 65535;
                    break;
                default:
                    c13 = 65535;
                    break;
            }
            switch (c13) {
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
                case '\n':
                    num = num2;
                    break;
            }
            if (num != null) {
                k3.r("Unknown Dolby Vision profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            String str6 = split[2];
            if (str6 != null) {
                switch (str6.hashCode()) {
                    case 1537:
                        if (str6.equals("01")) {
                            c14 = 0;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1538:
                        if (str6.equals("02")) {
                            c14 = 1;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1539:
                        if (str6.equals("03")) {
                            c14 = 2;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1540:
                        if (str6.equals("04")) {
                            c14 = 3;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1541:
                        if (str6.equals("05")) {
                            c14 = 4;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1542:
                        if (str6.equals("06")) {
                            c14 = 5;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1543:
                        if (str6.equals("07")) {
                            c14 = 6;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1544:
                        if (str6.equals("08")) {
                            c14 = 7;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1545:
                        if (str6.equals("09")) {
                            c14 = '\b';
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1567:
                        if (str6.equals("10")) {
                            c14 = '\t';
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1568:
                        if (str6.equals("11")) {
                            c14 = '\n';
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1569:
                        if (str6.equals("12")) {
                            c14 = 11;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1570:
                        if (str6.equals("13")) {
                            c14 = '\f';
                            break;
                        }
                        c14 = 65535;
                        break;
                    default:
                        c14 = 65535;
                        break;
                }
                switch (c14) {
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
                k3.r("Unknown Dolby Vision level string: ", str6, "CodecSpecificDataUtil");
                return null;
            }
            num2 = null;
            if (num2 == null) {
            }
        }
        num = null;
        if (num != null) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0167, code lost:
    
        if (r12.equals("L60") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair c(String str, String[] strArr, b2.n nVar) {
        int i10;
        Integer num;
        if (strArr.length < 4) {
            k3.r("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = c.matcher(strArr[1]);
        if (!matcher.matches()) {
            k3.r("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        char c10 = 6;
        if ("1".equals(group)) {
            i10 = 1;
        } else if ("2".equals(group)) {
            i10 = (nVar == null || nVar.c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                k3.r("Unknown HEVC profile string: ", group, "CodecSpecificDataUtil");
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
            k3.r("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        num = null;
        if (num == null) {
        }
    }
}
