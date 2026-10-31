package b2;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.zs;
import org.webrtc.MediaStreamTrack;
import v7.r6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class v0 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        ac.g f7;
        int a2;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (f7 = f(str2)) != null && (a2 = f7.a()) != 0 && a2 != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] d02 = e2.l0.d0(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : d02) {
                if (str2.equals(d(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        ac.g f7;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (f7 = f(str2)) == null) {
                    return 0;
                }
                return f7.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        ac.g f7;
        String str2 = null;
        if (str != null) {
            String c10 = r6.c(str.trim());
            if (c10.startsWith("avc1") || c10.startsWith("avc3")) {
                return "video/avc";
            }
            if (c10.startsWith("hev1") || c10.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (c10.startsWith("vvc1") || c10.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (c10.startsWith("dvav") || c10.startsWith("dva1") || c10.startsWith("dvhe") || c10.startsWith("dvh1") || c10.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (c10.startsWith("av01")) {
                return "video/av01";
            }
            if (c10.startsWith("vp9") || c10.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (c10.startsWith("vp8") || c10.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (c10.startsWith("mp4a")) {
                if (c10.startsWith("mp4a.") && (f7 = f(c10)) != null) {
                    str2 = e(f7.a);
                }
                return str2 == null ? "audio/mp4a-latm" : str2;
            }
            if (c10.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (c10.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (c10.startsWith("ac-3") || c10.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (c10.startsWith("ec-3") || c10.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (c10.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (c10.startsWith("ac-4") || c10.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (c10.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (c10.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (c10.startsWith("dtsh") || c10.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (c10.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (c10.startsWith("opus")) {
                return "audio/opus";
            }
            if (c10.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (c10.startsWith("flac")) {
                return "audio/flac";
            }
            if (c10.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (c10.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (c10.contains("cea708")) {
                return "application/cea-708";
            }
            if (c10.contains("eia608") || c10.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static String e(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 221) {
            return "audio/vorbis";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case zs.i1 /* 97 */:
            case zs.j1 /* 98 */:
            case zs.k1 /* 99 */:
            case zs.l1 /* 100 */:
            case 101:
                return "video/mpeg2";
            case zs.n1 /* 102 */:
            case zs.o1 /* 103 */:
            case zs.p1 /* 104 */:
                return "audio/mp4a-latm";
            case zs.q1 /* 105 */:
            case zs.s1 /* 107 */:
                return "audio/mpeg";
            case zs.r1 /* 106 */:
                return "video/mpeg";
            case zs.t1 /* 108 */:
                return "image/jpeg";
            default:
                switch (i10) {
                    case zs.z2 /* 169 */:
                    case zs.C2 /* 172 */:
                        return "audio/vnd.dts";
                    case zs.A2 /* 170 */:
                    case zs.B2 /* 171 */:
                        return "audio/vnd.dts.hd";
                    case zs.D2 /* 173 */:
                        return "audio/opus";
                    case zs.E2 /* 174 */:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static ac.g f(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new ac.g(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static boolean i(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(g(str));
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean k(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(g(str));
    }

    public static String n(String str) {
        String c10;
        if (str == null) {
            return null;
        }
        c10 = r6.c(str);
        c10.getClass();
        switch (c10) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return c10;
        }
    }
}
