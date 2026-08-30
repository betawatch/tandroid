package org.telegram.messenger.voip;

import android.media.AudioTrack;
import java.nio.ByteBuffer;
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    private int getBufferSize(int i10, int i11) {
        return Math.max(AudioTrack.getMinBufferSize(i11, 4, 2), i10);
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
                } catch (Exception e) {
                    VLog.e(e);
                }
                if (!this.running) {
                    this.audioTrack.stop();
                    break;
                }
                continue;
            }
            VLog.i("audiotrack thread exits");
        } catch (Exception e6) {
            VLog.e("error starting AudioTrack", e6);
        }
    }

    private native void nativeCallback(byte[] bArr);

    private void startThread() {
        if (this.thread != null) {
            throw new IllegalStateException("thread already started");
        }
        this.running = true;
        Thread thread = new Thread(new s0(this, 2));
        this.thread = thread;
        thread.start();
    }

    public void init(int i10, int i11, int i12, int i13) {
        if (this.audioTrack != null) {
            throw new IllegalStateException("already inited");
        }
        AudioTrack audioTrack = new AudioTrack(0, 48000, i12 == 1 ? 4 : 12, 2, getBufferSize(i13, 48000), 1);
        this.audioTrack = audioTrack;
        if (audioTrack.getState() != 1) {
            VLog.w("Error initializing AudioTrack with 48k, trying 44.1k with resampling");
            try {
                this.audioTrack.release();
            } catch (Throwable unused) {
            }
            int bufferSize = getBufferSize(i13 * 6, 44100);
            VLog.d(a2.j(bufferSize, "buffer size: "));
            this.audioTrack = new AudioTrack(0, 44100, i12 == 1 ? 4 : 12, 2, bufferSize, 1);
            this.needResampling = true;
        }
    }

    public void release() {
        this.running = false;
        Thread thread = this.thread;
        if (thread != null) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                VLog.e(e);
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
