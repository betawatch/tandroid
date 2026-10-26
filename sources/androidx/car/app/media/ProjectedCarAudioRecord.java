package androidx.car.app.media;

import android.util.Log;
import androidx.car.app.h;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class ProjectedCarAudioRecord extends b {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(h hVar) {
    }

    @Override // androidx.car.app.media.b
    public int readInternal(byte[] bArr, int i10, int i11) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i10, i11);
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
        } catch (IOException e) {
            Log.e("CarApp", "Exception closing microphone pipe", e);
        }
    }
}
