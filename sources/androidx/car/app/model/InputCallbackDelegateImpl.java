package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements o {
    private final IInputCallback mCallback;

    /* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
    public static class OnInputCallbackStub extends IInputCallback.Stub {
        private final n mCallback;

        public OnInputCallbackStub(n nVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputSubmitted$0(String str) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputTextChanged$1(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.j.b(iOnDoneCallback, "onInputSubmitted", new p(this, str, 1));
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.j.b(iOnDoneCallback, "onInputTextChanged", new p(this, str, 0));
        }
    }

    private InputCallbackDelegateImpl(n nVar) {
        this.mCallback = new OnInputCallbackStub(nVar);
    }

    public static o create(n nVar) {
        Objects.requireNonNull(nVar);
        throw new ClassCastException();
    }

    public void sendInputSubmitted(String str, androidx.car.app.j jVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, androidx.car.app.utils.j.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendInputTextChanged(String str, androidx.car.app.j jVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, androidx.car.app.utils.j.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
