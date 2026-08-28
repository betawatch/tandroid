package androidx.car.app.media;

import android.util.Log;
import androidx.car.app.h;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ProjectedCarAudioRecord extends b {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(h hVar) {
    }

    @Override // androidx.car.app.media.b
    public int readInternal(byte[] bArr, int i9, int i10) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i9, i10);
        } catch (IOException unused) {
            stopRecording();
            return -1;
        }
    }

    public void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse) {
        this.mInputStream = openMicrophoneResponse.getCarMicrophoneInputStream();
    }

    @Override // androidx.car.app.media.b
    public void stopRecordingInternal() {
        try {
            InputStream inputStream = this.mInputStream;
            if (inputStream != null) {
                inputStream.close();
                this.mInputStream = null;
            }
        } catch (IOException e10) {
            Log.e("CarApp", "Exception closing microphone pipe", e10);
        }
    }
}
