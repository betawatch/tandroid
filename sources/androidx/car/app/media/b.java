package androidx.car.app.media;

import androidx.car.app.h;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b {
    public static final int AUDIO_CONTENT_BUFFER_SIZE = 512;
    public static final String AUDIO_CONTENT_MIME = "audio/l16";
    public static final int AUDIO_CONTENT_SAMPLING_RATE = 16000;
    private static final int RECORDSTATE_RECORDING = 1;
    private static final int RECORDSTATE_REMOTE_CLOSED = 2;
    private static final int RECORDSTATE_STOPPED = 0;
    private final h mCarContext;
    private OpenMicrophoneResponse mOpenMicrophoneResponse;
    private int mRecordingState = 0;
    private final Object mRecordingStateLock = new Object();

    public static b create(h hVar) {
        throw null;
    }

    public int read(byte[] bArr, int i9, int i10) {
        synchronized (this.mRecordingStateLock) {
            int i11 = this.mRecordingState;
            if (i11 == 0) {
                throw new IllegalStateException("Called read before calling startRecording or after calling stopRecording");
            }
            if (i11 != 2) {
                return readInternal(bArr, i9, i10);
            }
            return -1;
        }
    }

    public abstract int readInternal(byte[] bArr, int i9, int i10);

    public void startRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                if (this.mRecordingState == 0) {
                    throw null;
                }
                throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void stopRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                OpenMicrophoneResponse openMicrophoneResponse = this.mOpenMicrophoneResponse;
                if (openMicrophoneResponse != null) {
                    if (this.mRecordingState != 2) {
                        openMicrophoneResponse.getCarAudioCallback().onStopRecording();
                    }
                    this.mOpenMicrophoneResponse = null;
                }
                stopRecordingInternal();
                this.mRecordingState = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void stopRecordingInternal();
}
