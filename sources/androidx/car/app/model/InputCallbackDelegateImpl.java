package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements dq5 {
    private final IInputCallback mCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    static class OnInputCallbackStub extends IInputCallback.Stub {
        private final cq5 mCallback;

        public OnInputCallbackStub(cq5 cq5Var) {
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
            androidx.car.app.utils.e.c(iOnDoneCallback, "onInputSubmitted", new c(this, str, (byte) 1));
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onInputTextChanged", new c(this, str, (byte) 0));
        }
    }

    private InputCallbackDelegateImpl(cq5 cq5Var) {
        this.mCallback = new OnInputCallbackStub(cq5Var);
    }

    public static dq5 create(cq5 cq5Var) {
        Objects.requireNonNull(cq5Var);
        throw new ClassCastException();
    }

    public void sendInputSubmitted(String str, cs7 cs7Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    public void sendInputTextChanged(String str, cs7 cs7Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
