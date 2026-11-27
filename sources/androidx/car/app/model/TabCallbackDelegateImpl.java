package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class TabCallbackDelegateImpl implements vhb {
    private final ITabCallback mStubCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
    static class TabCallbackStub extends ITabCallback.Stub {
        private final yhb mCallback;

        public TabCallbackStub(yhb yhbVar) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTabSelected$0(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onTabSelected", new c(this, str, (byte) 2));
        }
    }

    private TabCallbackDelegateImpl(yhb yhbVar) {
        this.mStubCallback = new TabCallbackStub(yhbVar);
    }

    public static vhb create(yhb yhbVar) {
        return new TabCallbackDelegateImpl(yhbVar);
    }

    public void sendTabSelected(String str, cs7 cs7Var) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            grb.m(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
