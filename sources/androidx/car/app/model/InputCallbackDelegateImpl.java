package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements ao5 {
    private final IInputCallback mCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    static class OnInputCallbackStub extends IInputCallback.Stub {
        private final zn5 mCallback;

        public OnInputCallbackStub(zn5 zn5Var) {
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

    private InputCallbackDelegateImpl(zn5 zn5Var) {
        this.mCallback = new OnInputCallbackStub(zn5Var);
    }

    public static ao5 create(zn5 zn5Var) {
        Objects.requireNonNull(zn5Var);
        throw new ClassCastException();
    }

    public void sendInputSubmitted(String str, cp7 cp7Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    public void sendInputTextChanged(String str, cp7 cp7Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
