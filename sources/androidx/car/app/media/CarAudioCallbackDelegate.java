package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* loaded from: classes.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    static CarAudioCallbackDelegate create(CarAudioCallback carAudioCallback) {
        return new CarAudioCallbackDelegate(carAudioCallback);
    }

    private CarAudioCallbackDelegate(CarAudioCallback carAudioCallback) {
        this.mCallback = new CarAudioCallbackStub(carAudioCallback);
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }

    private static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final CarAudioCallback mCarAudioCallback;

        CarAudioCallbackStub(CarAudioCallback carAudioCallback) {
            this.mCarAudioCallback = carAudioCallback;
        }

        CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            CarAudioCallback carAudioCallback = this.mCarAudioCallback;
            Objects.requireNonNull(carAudioCallback);
            carAudioCallback.onStopRecording();
        }
    }
}
