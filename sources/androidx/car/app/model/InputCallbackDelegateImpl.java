package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements o {
    private final IInputCallback mCallback;

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
            androidx.car.app.utils.i.b(iOnDoneCallback, "onInputSubmitted", new p(this, str, 1));
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.i.b(iOnDoneCallback, "onInputTextChanged", new p(this, str, 0));
        }
    }

    private InputCallbackDelegateImpl(n nVar) {
        this.mCallback = new OnInputCallbackStub(nVar);
    }

    public static o create(n nVar) {
        Objects.requireNonNull(nVar);
        throw new ClassCastException();
    }

    public void sendInputSubmitted(String str, androidx.car.app.k kVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, androidx.car.app.utils.i.a());
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public void sendInputTextChanged(String str, androidx.car.app.k kVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, androidx.car.app.utils.i.a());
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
