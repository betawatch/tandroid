package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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

    /* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
