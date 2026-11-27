package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.text.TextUtils;
import org.webrtc.ContextUtils;
import org.webrtc.JniCommon;
import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.voiceengine.WebRtcAudioRecord;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class CallAudioDevice {
    public static final String DEBUG_OVERRIDE_KEY = "dbg_call_audio_device";
    public static final int MODE_JAVA = 1;
    public static final int MODE_LEGACY = 0;
    public static final int MODE_OPENSLES = 2;
    public static final String NAME_AUTO = "auto";
    public static final String NAME_JAVA = "java";
    public static final String NAME_LEGACY = "legacy";
    public static final String NAME_OPENSLES = "opensles";
    private static volatile JavaAudioDeviceModule javaModule = null;
    private static volatile int playoutUsage = 2;
    private static volatile SamplesCallback samplesCallback;
    private static volatile boolean speakerMuted;

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    public interface SamplesCallback {
        void onSamples(byte[] bArr, int i, int i2);
    }

    private CallAudioDevice() {
    }

    public static long createJavaModule(long j) {
        if (j == 0) {
            return 0L;
        }
        try {
            boolean z = xea.U;
            boolean z2 = false;
            JavaAudioDeviceModule.Builder useHardwareAcousticEchoCanceler = JavaAudioDeviceModule.builder(org.telegram.messenger.a.b).setUseHardwareAcousticEchoCanceler(!z && JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported());
            if (!z && JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()) {
                z2 = true;
            }
            JavaAudioDeviceModule createAudioDeviceModule = useHardwareAcousticEchoCanceler.setUseHardwareNoiseSuppressor(z2).setAudioAttributes(new AudioAttributes.Builder().setUsage(playoutUsage).setContentType(1).build()).setSamplesReadyCallback(new rm0((byte) 16)).setAudioRecordErrorCallback(new JavaAudioDeviceModule.AudioRecordErrorCallback() { // from class: org.telegram.messenger.voip.CallAudioDevice.2
                @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
                public void onWebRtcAudioRecordError(String str) {
                    cc4.d("CallAudioDevice record: " + str);
                }

                @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
                public void onWebRtcAudioRecordInitError(String str) {
                    cc4.d("CallAudioDevice record init: " + str);
                }

                @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
                public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
                    cc4.d("CallAudioDevice record start: " + audioRecordStartErrorCode + " " + str);
                }
            }).setAudioTrackErrorCallback(new JavaAudioDeviceModule.AudioTrackErrorCallback() { // from class: org.telegram.messenger.voip.CallAudioDevice.1
                @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
                public void onWebRtcAudioTrackError(String str) {
                    cc4.d("CallAudioDevice track: " + str);
                }

                @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
                public void onWebRtcAudioTrackInitError(String str) {
                    cc4.d("CallAudioDevice track init: " + str);
                }

                @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
                public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
                    cc4.d("CallAudioDevice track start: " + audioTrackStartErrorCode + " " + str);
                }
            }).createAudioDeviceModule();
            createAudioDeviceModule.setSpeakerMute(speakerMuted);
            long j2 = createAudioDeviceModule.getNative(j);
            if (j2 == 0) {
                createAudioDeviceModule.release();
                return 0L;
            }
            JniCommon.nativeAddRef(j2);
            createAudioDeviceModule.release();
            javaModule = createAudioDeviceModule;
            return j2;
        } catch (Throwable th) {
            cc4.g(th, true);
            return 0L;
        }
    }

    public static String getDebugOverride() {
        return uc7.e1().getString(DEBUG_OVERRIDE_KEY, "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (hasLowLatencyAudio() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getMode(int i) {
        String modeName = getModeName(i);
        int i2 = 1;
        if (!NAME_JAVA.equals(modeName)) {
            if (!NAME_OPENSLES.equals(modeName)) {
                if (!NAME_AUTO.equals(modeName)) {
                    i2 = 0;
                }
            }
            i2 = 2;
        }
        if (i2 != 0) {
            ContextUtils.initialize(org.telegram.messenger.a.b);
        }
        if (f11.a) {
            StringBuilder p = ik8.p("CallAudioDevice: ", modeName, " -> ");
            p.append(modeToString(i2));
            cc4.b(p.toString());
        }
        return i2;
    }

    public static String getModeName(int i) {
        String debugOverride = getDebugOverride();
        if (!TextUtils.isEmpty(debugOverride)) {
            return debugOverride;
        }
        String str = uc7.s1(i).k4.H.f;
        return TextUtils.isEmpty(str) ? NAME_JAVA : str;
    }

    private static boolean hasLowLatencyAudio() {
        return org.telegram.messenger.a.b.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    public static boolean isSpeakerMuted() {
        return speakerMuted;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createJavaModule$1(JavaAudioDeviceModule.AudioSamples audioSamples) {
        SamplesCallback samplesCallback2 = samplesCallback;
        if (samplesCallback2 != null) {
            samplesCallback2.onSamples(audioSamples.getData(), audioSamples.getSampleRate(), audioSamples.getChannelCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setOnRecordedSamples$0(SamplesCallback samplesCallback2, WebRtcAudioRecord.AudioSamples audioSamples) {
        samplesCallback2.onSamples(audioSamples.getData(), audioSamples.getSampleRate(), audioSamples.getChannelCount());
    }

    public static String modeToString(int i) {
        return i != 1 ? i != 2 ? NAME_LEGACY : NAME_OPENSLES : NAME_JAVA;
    }

    public static void setDebugOverride(String str) {
        SharedPreferences.Editor edit = uc7.e1().edit();
        if (TextUtils.isEmpty(str)) {
            edit.remove(DEBUG_OVERRIDE_KEY);
        } else {
            edit.putString(DEBUG_OVERRIDE_KEY, str);
        }
        edit.apply();
    }

    public static void setOnRecordedSamples(SamplesCallback samplesCallback2) {
        samplesCallback = samplesCallback2;
        WebRtcAudioRecord.setOnAudioSamplesReady(samplesCallback2 == null ? null : new tg0(samplesCallback2, (byte) 25));
    }

    public static void setPlayoutStreamType(int i) {
        WebRtcAudioTrack.setAudioStreamType(i);
    }

    public static void setPlayoutUsage(int i) {
        playoutUsage = i;
        WebRtcAudioTrack.setAudioTrackUsageAttribute(i);
    }

    public static void setSpeakerMute(boolean z) {
        speakerMuted = z;
        WebRtcAudioTrack.setSpeakerMute(z);
        JavaAudioDeviceModule javaAudioDeviceModule = javaModule;
        if (javaAudioDeviceModule != null) {
            javaAudioDeviceModule.setSpeakerMute(z);
        }
    }
}
