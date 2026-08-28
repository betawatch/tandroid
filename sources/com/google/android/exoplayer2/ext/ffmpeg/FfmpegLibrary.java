package com.google.android.exoplayer2.ext.ffmpeg;

import h3.r0;
import org.telegram.messenger.NativeLoader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class FfmpegLibrary {
    private static final String TAG = "FfmpegLibrary";
    private static int inputBufferPaddingSize;
    private static String version;

    static {
        r0.a("goog.exo.ffmpeg");
        inputBufferPaddingSize = -1;
    }

    private FfmpegLibrary() {
    }

    private static native int ffmpegGetInputBufferPaddingSize();

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);

    public static String getCodecName(String str) {
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

    public static int getInputBufferPaddingSize() {
        if (!isAvailable()) {
            return -1;
        }
        if (inputBufferPaddingSize == -1) {
            inputBufferPaddingSize = ffmpegGetInputBufferPaddingSize();
        }
        return inputBufferPaddingSize;
    }

    public static String getVersion() {
        if (!isAvailable()) {
            return null;
        }
        if (version == null) {
            version = ffmpegGetVersion();
        }
        return version;
    }

    public static boolean isAvailable() {
        return NativeLoader.loaded();
    }

    public static boolean supportsFormat(String str) {
        String codecName;
        if (!isAvailable() || (codecName = getCodecName(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(codecName)) {
            return true;
        }
        d5.a.K(TAG, "No " + codecName + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }

    public static void setLibraries(String... strArr) {
    }
}
