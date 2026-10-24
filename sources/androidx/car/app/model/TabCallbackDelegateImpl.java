package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class TabCallbackDelegateImpl implements t0 {
    private final ITabCallback mStubCallback;

    /* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
    public static class TabCallbackStub extends ITabCallback.Stub {
        private final w0 mCallback;

        public TabCallbackStub(w0 w0Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onTabSelected$0(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.g.b(iOnDoneCallback, "onTabSelected", new p(this, str, 2));
        }
    }

    private TabCallbackDelegateImpl(w0 w0Var) {
        this.mStubCallback = new TabCallbackStub(w0Var);
    }

    public static t0 create(w0 w0Var) {
        return new TabCallbackDelegateImpl(w0Var);
    }

    public void sendTabSelected(String str, androidx.car.app.k kVar) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, androidx.car.app.utils.g.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
