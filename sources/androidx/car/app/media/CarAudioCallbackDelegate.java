package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(a aVar) {
        this.mCallback = new CarAudioCallbackStub(aVar);
    }

    public static CarAudioCallbackDelegate create(a aVar) {
        return new CarAudioCallbackDelegate(aVar);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    /* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
    public static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final a mCarAudioCallback;

        public CarAudioCallbackStub(a aVar) {
            this.mCarAudioCallback = aVar;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            Objects.requireNonNull(this.mCarAudioCallback);
        }

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
