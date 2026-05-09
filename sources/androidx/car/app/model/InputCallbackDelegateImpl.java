package androidx.car.app.model;

import android.os.RemoteException;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.model.IInputCallback;
import androidx.car.app.model.InputCallbackDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class InputCallbackDelegateImpl implements InputCallbackDelegate {
    private final IInputCallback mCallback;

    public void sendInputSubmitted(String str, OnDoneCallback onDoneCallback) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputSubmitted(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendInputTextChanged(String str, OnDoneCallback onDoneCallback) {
        try {
            IInputCallback iInputCallback = this.mCallback;
            Objects.requireNonNull(iInputCallback);
            iInputCallback.onInputTextChanged(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static InputCallbackDelegate create(InputCallback inputCallback) {
        Objects.requireNonNull(inputCallback);
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(inputCallback);
        return new InputCallbackDelegateImpl(null);
    }

    private InputCallbackDelegateImpl(InputCallback inputCallback) {
        this.mCallback = new OnInputCallbackStub(inputCallback);
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class OnInputCallbackStub extends IInputCallback.Stub {
        private final InputCallback mCallback;

        OnInputCallbackStub(InputCallback inputCallback) {
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onInputSubmitted", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.InputCallbackDelegateImpl$OnInputCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onInputSubmitted$0;
                    lambda$onInputSubmitted$0 = InputCallbackDelegateImpl.OnInputCallbackStub.this.lambda$onInputSubmitted$0(str);
                    return lambda$onInputSubmitted$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputSubmitted$0(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onInputTextChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.InputCallbackDelegateImpl$OnInputCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onInputTextChanged$1;
                    lambda$onInputTextChanged$1 = InputCallbackDelegateImpl.OnInputCallbackStub.this.lambda$onInputTextChanged$1(str);
                    return lambda$onInputTextChanged$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onInputTextChanged$1(String str) {
            throw null;
        }
    }
}
