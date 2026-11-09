package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements o {
    private final IInputCallback mCallback;

    /* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
            androidx.car.app.utils.g.b(iOnDoneCallback, "onInputSubmitted", new p(this, str, 1));
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.g.b(iOnDoneCallback, "onInputTextChanged", new p(this, str, 0));
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
            iInputCallback.onInputSubmitted(str, androidx.car.app.utils.g.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void sendInputTextChanged(String str, androidx.car.app.k kVar) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, androidx.car.app.utils.g.a());
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
