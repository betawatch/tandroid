package androidx.car.app.media;

import android.util.Log;
import androidx.car.app.CarContext;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class ProjectedCarAudioRecord extends CarAudioRecord {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(CarContext carContext) {
        super(carContext);
    }

    protected void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse) {
        this.mInputStream = openMicrophoneResponse.getCarMicrophoneInputStream();
    }

    @Override // androidx.car.app.media.CarAudioRecord
    protected void stopRecordingInternal() {
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

    @Override // androidx.car.app.media.CarAudioRecord
    protected int readInternal(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException unused) {
            stopRecording();
            return -1;
        }
    }
}
