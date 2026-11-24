package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(nd1 nd1Var) {
        this.mCallback = new CarAudioCallbackStub(nd1Var);
    }

    public static CarAudioCallbackDelegate create(nd1 nd1Var) {
        return new CarAudioCallbackDelegate(nd1Var);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    private static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final nd1 mCarAudioCallback;

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            Objects.requireNonNull(this.mCarAudioCallback);
        }

        public CarAudioCallbackStub(nd1 nd1Var) {
            this.mCarAudioCallback = nd1Var;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
