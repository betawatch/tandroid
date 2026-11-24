package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(fc1 fc1Var) {
        this.mCallback = new CarAudioCallbackStub(fc1Var);
    }

    public static CarAudioCallbackDelegate create(fc1 fc1Var) {
        return new CarAudioCallbackDelegate(fc1Var);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    private static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final fc1 mCarAudioCallback;

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            Objects.requireNonNull(this.mCarAudioCallback);
        }

        public CarAudioCallbackStub(fc1 fc1Var) {
            this.mCarAudioCallback = fc1Var;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
