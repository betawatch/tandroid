package d5;

import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class q {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str != null && str2 != null) {
            String[] Q = f0.Q(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : Q) {
                if (str2.equals(c(str3))) {
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

    public static int b(String str, String str2) {
        p e10;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (e10 = e(str2)) == null) {
                    return 0;
                }
                return e10.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
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

    public static String c(String str) {
        p e10;
        String str2 = null;
        if (str != null) {
            String b10 = g7.b0.b(str.trim());
            if (b10.startsWith("avc1") || b10.startsWith("avc3")) {
                return MediaController.VIDEO_MIME_TYPE;
            }
            if (b10.startsWith("hev1") || b10.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (b10.startsWith("dvav") || b10.startsWith("dva1") || b10.startsWith("dvhe") || b10.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (b10.startsWith("av01")) {
                return "video/av01";
            }
            if (b10.startsWith("vp9") || b10.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (b10.startsWith("vp8") || b10.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (b10.startsWith("mp4a")) {
                if (b10.startsWith("mp4a.") && (e10 = e(b10)) != null) {
                    str2 = d(e10.a);
                }
                return str2 == null ? MediaController.AUDIO_MIME_TYPE : str2;
            }
            if (b10.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (b10.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (b10.startsWith("ac-3") || b10.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (b10.startsWith("ec-3") || b10.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (b10.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (b10.startsWith("ac-4") || b10.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (b10.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (b10.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (b10.startsWith("dtsh") || b10.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (b10.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (b10.startsWith("opus")) {
                return "audio/opus";
            }
            if (b10.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (b10.startsWith("flac")) {
                return "audio/flac";
            }
            if (b10.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (b10.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (b10.contains("cea708")) {
                return "application/cea-708";
            }
            if (b10.contains("eia608") || b10.contains("cea608")) {
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

    public static String d(int i9) {
        if (i9 == 32) {
            return "video/mp4v-es";
        }
        if (i9 == 33) {
            return MediaController.VIDEO_MIME_TYPE;
        }
        if (i9 == 35) {
            return "video/hevc";
        }
        if (i9 == 64) {
            return MediaController.AUDIO_MIME_TYPE;
        }
        if (i9 == 163) {
            return "video/wvc1";
        }
        if (i9 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i9 == 165) {
            return "audio/ac3";
        }
        if (i9 == 166) {
            return "audio/eac3";
        }
        switch (i9) {
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return MediaController.AUDIO_MIME_TYPE;
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i9) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static p e(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new p(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("image".equals(f(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
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

    public static boolean h(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(f(str));
    }

    public static boolean i(String str) {
        return "text".equals(f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean j(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(f(str));
    }
}
