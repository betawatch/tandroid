package androidx.car.app.media;

import android.os.RemoteException;
import androidx.car.app.media.ICarAudioCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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

    /* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
