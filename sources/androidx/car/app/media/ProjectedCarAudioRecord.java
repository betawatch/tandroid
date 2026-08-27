package androidx.car.app.media;

import android.util.Log;
import androidx.car.app.h;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        } catch (IOException e9) {
            Log.e("CarApp", "Exception closing microphone pipe", e9);
        }
    }
}
