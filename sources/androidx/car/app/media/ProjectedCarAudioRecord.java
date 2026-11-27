package androidx.car.app.media;

import android.util.Log;
import androidx.car.app.g;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class ProjectedCarAudioRecord extends oc1 {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(g gVar) {
    }

    @Override // oc1
    public int readInternal(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException unused) {
            this.stopRecording();
            return -1;
        }
    }

    public void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse) {
        this.mInputStream = openMicrophoneResponse.getCarMicrophoneInputStream();
    }

    @Override // oc1
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
