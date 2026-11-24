package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.IInputCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements aq5 {
    private final IInputCallback mCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class OnInputCallbackStub extends IInputCallback.Stub {
        private final zp5 mCallback;

        public OnInputCallbackStub(zp5 zp5Var) {
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

    private InputCallbackDelegateImpl(zp5 zp5Var) {
        this.mCallback = new OnInputCallbackStub(zp5Var);
    }

    public static aq5 create(zp5 zp5Var) {
        Objects.requireNonNull(zp5Var);
        throw new ClassCastException();
    }

    public void sendInputSubmitted(String str, fr7 fr7Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    public void sendInputTextChanged(String str, fr7 fr7Var) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
