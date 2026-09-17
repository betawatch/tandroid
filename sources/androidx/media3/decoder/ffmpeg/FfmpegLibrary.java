package androidx.media3.decoder.ffmpeg;

import b2.l0;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class FfmpegLibrary {
    public static String a;
    public static int b;

    static {
        l0.a("media3.decoder.ffmpeg");
        b = -1;
    }

    public static String a(String str) {
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return "eac3";
            case "video/hevc":
                return "hevc";
            case "audio/amr-wb":
                return "amrwb";
            case "audio/vnd.dts":
            case "audio/vnd.dts.hd":
                return "dca";
            case "audio/vorbis":
                return "vorbis";
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/mpeg":
                return "mp3";
            case "audio/mp4a-latm":
                return "aac";
            case "audio/ac3":
                return "ac3";
            case "video/avc":
                return "h264";
            case "audio/3gpp":
                return "amrnb";
            case "audio/alac":
                return "alac";
            case "audio/flac":
                return "flac";
            case "audio/opus":
                return "opus";
            case "audio/true-hd":
                return "truehd";
            case "audio/g711-alaw":
                return "pcm_alaw";
            case "audio/g711-mlaw":
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    public static int b() {
        if (b == -1) {
            b = ffmpegGetInputBufferPaddingSize();
        }
        return b;
    }

    public static String c() {
        if (a == null) {
            a = ffmpegGetVersion();
        }
        return a;
    }

    public static boolean d(String str) {
        String a2 = a(str);
        if (a2 == null) {
            return false;
        }
        if (ffmpegHasDecoder(a2)) {
            return true;
        }
        e2.a.n("FfmpegLibrary", "No " + a2 + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);
}
