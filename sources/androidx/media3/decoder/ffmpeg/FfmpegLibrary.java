package androidx.media3.decoder.ffmpeg;

import b2.l0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class FfmpegLibrary {
    public static String a;
    public static int b;
    public static String c;

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
            case "video/dolby-vision":
            case "video/hevc":
                return "hevc";
            case "video/3gpp":
                return "h263";
            case "video/av01":
                if (c == null) {
                    c = ffmpegGetAv1DecoderName();
                }
                return c;
            case "video/divx":
            case "video/mp4v-es":
                return "mpeg4";
            case "video/mp42":
                return "msmpeg4v2";
            case "video/mp43":
                return "msmpeg4";
            case "video/mpeg":
                return "mpeg2video";
            case "video/wvc1":
                return "vc1";
            case "audio/amr-wb":
                return "amrwb";
            case "audio/vnd.dts.hd;profile=lbr":
            case "audio/vnd.dts":
            case "audio/vnd.dts.hd":
                return "dca";
            case "video/x-msvideo":
                return "mpeg4";
            case "audio/vorbis":
                return "vorbis";
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/mpeg":
                return "mp3";
            case "audio/mp4a-latm":
                return "aac";
            case "video/mjpeg":
                return "mjpeg";
            case "video/mpeg2":
                return "mpeg2video";
            case "video/x-flv":
                return "flv1";
            case "audio/ac3":
                return "ac3";
            case "video/prores":
                return "prores";
            case "video/avc":
                return "h264";
            case "video/ogg":
                return "theora";
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
            case "video/x-vnd.on2.vp8":
                return "vp8";
            case "video/x-vnd.on2.vp9":
                return "vp9";
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
        String a2;
        if (str == null || (a2 = a(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(a2)) {
            return true;
        }
        e2.a.n("FfmpegLibrary", "No " + a2 + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    private static native String ffmpegGetAv1DecoderName();

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);
}
