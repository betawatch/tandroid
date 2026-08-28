package org.telegram.messenger.voip;

import android.media.AudioTrack;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class AudioTrackJNI {
    private AudioTrack audioTrack;
    private byte[] buffer = new byte[1920];
    private long nativeInst;
    private boolean needResampling;
    private boolean running;
    private Thread thread;

    public AudioTrackJNI(long j10) {
        this.nativeInst = j10;
    }

    private int getBufferSize(int i9, int i10) {
        return Math.max(AudioTrack.getMinBufferSize(i10, 4, 2), i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startThread$0() {
        try {
            this.audioTrack.play();
            ByteBuffer allocateDirect = this.needResampling ? ByteBuffer.allocateDirect(1920) : null;
            ByteBuffer allocateDirect2 = this.needResampling ? ByteBuffer.allocateDirect(1764) : null;
            while (this.running) {
                try {
                    if (this.needResampling) {
                        nativeCallback(this.buffer);
                        allocateDirect.rewind();
                        allocateDirect.put(this.buffer);
                        Resampler.convert48to44(allocateDirect, allocateDirect2);
                        allocateDirect2.rewind();
                        allocateDirect2.get(this.buffer, 0, 1764);
                        this.audioTrack.write(this.buffer, 0, 1764);
                    } else {
                        nativeCallback(this.buffer);
                        this.audioTrack.write(this.buffer, 0, 1920);
                    }
                } catch (Exception e10) {
                    VLog.e(e10);
                }
                if (!this.running) {
                    this.audioTrack.stop();
                    break;
                }
                continue;
            }
            VLog.i("audiotrack thread exits");
        } catch (Exception e11) {
            VLog.e("error starting AudioTrack", e11);
        }
    }

    private native void nativeCallback(byte[] bArr);

    private void startThread() {
        if (this.thread != null) {
            throw new IllegalStateException("thread already started");
        }
        this.running = true;
        Thread thread = new Thread(new r0(this, 2));
        this.thread = thread;
        thread.start();
    }

    public void init(int i9, int i10, int i11, int i12) {
        if (this.audioTrack != null) {
            throw new IllegalStateException("already inited");
        }
        AudioTrack audioTrack = new AudioTrack(0, 48000, i11 == 1 ? 4 : 12, 2, getBufferSize(i12, 48000), 1);
        this.audioTrack = audioTrack;
        if (audioTrack.getState() != 1) {
            VLog.w("Error initializing AudioTrack with 48k, trying 44.1k with resampling");
            try {
                this.audioTrack.release();
            } catch (Throwable unused) {
            }
            int bufferSize = getBufferSize(i12 * 6, 44100);
            VLog.d(j3.r0.l(bufferSize, "buffer size: "));
            this.audioTrack = new AudioTrack(0, 44100, i11 == 1 ? 4 : 12, 2, bufferSize, 1);
            this.needResampling = true;
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
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    public void start() {
        if (this.thread == null) {
            startThread();
        } else {
            this.audioTrack.play();
        }
    }

    public void stop() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            try {
                audioTrack.stop();
            } catch (Exception unused) {
            }
        }
    }
}
