package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
