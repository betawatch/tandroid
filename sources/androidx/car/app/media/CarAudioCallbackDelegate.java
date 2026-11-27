package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(nc1 nc1Var) {
        this.mCallback = new CarAudioCallbackStub(nc1Var);
    }

    public static CarAudioCallbackDelegate create(nc1 nc1Var) {
        return new CarAudioCallbackDelegate(nc1Var);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
    private static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final nc1 mCarAudioCallback;

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            Objects.requireNonNull(this.mCarAudioCallback);
        }

        public CarAudioCallbackStub(nc1 nc1Var) {
            this.mCarAudioCallback = nc1Var;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
