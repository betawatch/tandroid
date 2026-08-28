package org.telegram.messenger.voip;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.regex.Pattern;
import kh.o8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AudioRecordJNI {
    private AcousticEchoCanceler aec;
    private AutomaticGainControl agc;
    private AudioRecord audioRecord;
    private ByteBuffer buffer;
    private int bufferSize;
    private long nativeInst;
    private boolean needResampling = false;
    private NoiseSuppressor ns;
    private boolean running;
    private Thread thread;

    public AudioRecordJNI(long j10) {
        this.nativeInst = j10;
    }

    private int getBufferSize(int i9, int i10) {
        return Math.max(AudioRecord.getMinBufferSize(i10, 16, 2), i9);
    }

    private static boolean isGoodAudioEffect(AudioEffect audioEffect) {
        Pattern makeNonEmptyRegex = makeNonEmptyRegex("adsp_good_impls");
        Pattern makeNonEmptyRegex2 = makeNonEmptyRegex("adsp_good_names");
        AudioEffect.Descriptor descriptor = audioEffect.getDescriptor();
        VLog.d(audioEffect.getClass().getSimpleName() + ": implementor=" + descriptor.implementor + ", name=" + descriptor.name);
        if (makeNonEmptyRegex != null && makeNonEmptyRegex.matcher(descriptor.implementor).find()) {
            return true;
        }
        if (makeNonEmptyRegex2 != null && makeNonEmptyRegex2.matcher(descriptor.name).find()) {
            return true;
        }
        if (audioEffect instanceof AcousticEchoCanceler) {
            Pattern makeNonEmptyRegex3 = makeNonEmptyRegex("aaec_good_impls");
            Pattern makeNonEmptyRegex4 = makeNonEmptyRegex("aaec_good_names");
            if (makeNonEmptyRegex3 != null && makeNonEmptyRegex3.matcher(descriptor.implementor).find()) {
                return true;
            }
            if (makeNonEmptyRegex4 != null && makeNonEmptyRegex4.matcher(descriptor.name).find()) {
                return true;
            }
        }
        if (!(audioEffect instanceof NoiseSuppressor)) {
            return false;
        }
        Pattern makeNonEmptyRegex5 = makeNonEmptyRegex("ans_good_impls");
        Pattern makeNonEmptyRegex6 = makeNonEmptyRegex("ans_good_names");
        if (makeNonEmptyRegex5 == null || !makeNonEmptyRegex5.matcher(descriptor.implementor).find()) {
            return makeNonEmptyRegex6 != null && makeNonEmptyRegex6.matcher(descriptor.name).find();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startThread$0(ByteBuffer byteBuffer) {
        while (this.running) {
            try {
                if (this.needResampling) {
                    this.audioRecord.read(byteBuffer, 1764);
                    Resampler.convert44to48(byteBuffer, this.buffer);
                } else {
                    this.audioRecord.read(this.buffer, 1920);
                }
            } catch (Exception e10) {
                VLog.e(e10);
            }
            if (!this.running) {
                this.audioRecord.stop();
                break;
            }
            nativeCallback(this.buffer);
        }
        VLog.i("audiorecord thread exits");
    }

    private static Pattern makeNonEmptyRegex(String str) {
        String string = Instance.getGlobalServerConfig().getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Pattern.compile(string);
        } catch (Exception e10) {
            VLog.e(e10);
            return null;
        }
    }

    private native void nativeCallback(ByteBuffer byteBuffer);

    private void startThread() {
        if (this.thread != null) {
            throw new IllegalStateException("thread already started");
        }
        this.running = true;
        Thread thread = new Thread(new o8(23, this, this.needResampling ? ByteBuffer.allocateDirect(1764) : null));
        this.thread = thread;
        thread.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean tryInit(int i9, int i10) {
        int i11;
        AudioRecord audioRecord;
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 != null) {
            try {
                audioRecord2.release();
            } catch (Exception unused) {
            }
        }
        VLog.i(aa.d.k(i9, i10, "Trying to initialize AudioRecord with source=", " and sample rate="));
        try {
            i11 = i10;
        } catch (Exception e10) {
            e = e10;
            i11 = i10;
        }
        try {
            this.audioRecord = new AudioRecord(i9, i11, 16, 2, getBufferSize(this.bufferSize, 48000));
        } catch (Exception e11) {
            e = e11;
            VLog.e("AudioRecord init failed!", e);
            this.needResampling = i11 == 48000;
            audioRecord = this.audioRecord;
            return audioRecord == null ? false : false;
        }
        this.needResampling = i11 == 48000;
        audioRecord = this.audioRecord;
        if (audioRecord == null && audioRecord.getState() == 1) {
            return true;
        }
    }

    public int getEnabledEffectsMask() {
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        int i9 = (acousticEchoCanceler == null || !acousticEchoCanceler.getEnabled()) ? 0 : 1;
        NoiseSuppressor noiseSuppressor = this.ns;
        return (noiseSuppressor == null || !noiseSuppressor.getEnabled()) ? i9 : i9 | 2;
    }

    public void init(int i9, int i10, int i11, int i12) {
        if (this.audioRecord != null) {
            throw new IllegalStateException("already inited");
        }
        this.bufferSize = i12;
        boolean tryInit = tryInit(7, 48000);
        boolean z10 = true;
        if (!tryInit) {
            tryInit = tryInit(1, 48000);
        }
        if (!tryInit) {
            tryInit = tryInit(7, 44100);
        }
        if (!tryInit) {
            tryInit = tryInit(1, 44100);
        }
        if (tryInit) {
            try {
                if (AutomaticGainControl.isAvailable()) {
                    AutomaticGainControl create = AutomaticGainControl.create(this.audioRecord.getAudioSessionId());
                    this.agc = create;
                    if (create != null) {
                        create.setEnabled(false);
                    }
                } else {
                    VLog.w("AutomaticGainControl is not available on this device :(");
                }
            } catch (Throwable th) {
                VLog.e("error creating AutomaticGainControl", th);
            }
            try {
                if (NoiseSuppressor.isAvailable()) {
                    NoiseSuppressor create2 = NoiseSuppressor.create(this.audioRecord.getAudioSessionId());
                    this.ns = create2;
                    if (create2 != null) {
                        create2.setEnabled(Instance.getGlobalServerConfig().useSystemNs && isGoodAudioEffect(this.ns));
                    }
                } else {
                    VLog.w("NoiseSuppressor is not available on this device :(");
                }
            } catch (Throwable th2) {
                VLog.e("error creating NoiseSuppressor", th2);
            }
            try {
                if (AcousticEchoCanceler.isAvailable()) {
                    AcousticEchoCanceler create3 = AcousticEchoCanceler.create(this.audioRecord.getAudioSessionId());
                    this.aec = create3;
                    if (create3 != null) {
                        if (!Instance.getGlobalServerConfig().useSystemAec || !isGoodAudioEffect(this.aec)) {
                            z10 = false;
                        }
                        create3.setEnabled(z10);
                    }
                } else {
                    VLog.w("AcousticEchoCanceler is not available on this device");
                }
            } catch (Throwable th3) {
                VLog.e("error creating AcousticEchoCanceler", th3);
            }
            this.buffer = ByteBuffer.allocateDirect(i12);
        }
    }

    public void release() {
        this.running = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e10) {
                VLog.e(e10);
            }
            this.thread = null;
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        AutomaticGainControl automaticGainControl = this.agc;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.agc = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
    }

    public boolean start() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null && audioRecord.getState() == 1) {
            try {
                if (this.thread == null) {
                    AudioRecord audioRecord2 = this.audioRecord;
                    if (audioRecord2 == null) {
                        return false;
                    }
                    audioRecord2.startRecording();
                    startThread();
                } else {
                    this.audioRecord.startRecording();
                }
                return true;
            } catch (Exception e10) {
                VLog.e("Error initializing AudioRecord", e10);
            }
        }
        return false;
    }

    public void stop() {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord != null) {
                audioRecord.stop();
            }
        } catch (Exception unused) {
        }
    }
}
