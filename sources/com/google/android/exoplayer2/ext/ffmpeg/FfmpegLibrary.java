package com.google.android.exoplayer2.ext.ffmpeg;

import j3.l0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FfmpegLibrary {
    public static String a;
    public static int b;

    static {
        l0.a("goog.exo.ffmpeg");
        b = -1;
    }

    public static String a(String str) {
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
            case "audio/eac3":
                return "eac3";
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
        h5.a.K("FfmpegLibrary", "No " + a2 + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);
}
