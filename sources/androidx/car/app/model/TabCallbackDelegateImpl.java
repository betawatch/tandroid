package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class TabCallbackDelegateImpl implements aeb {
    private final ITabCallback mStubCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    static class TabCallbackStub extends ITabCallback.Stub {
        private final deb mCallback;

        public TabCallbackStub(deb debVar) {
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

    private TabCallbackDelegateImpl(deb debVar) {
        this.mStubCallback = new TabCallbackStub(debVar);
    }

    public static aeb create(deb debVar) {
        return new TabCallbackDelegateImpl(debVar);
    }

    public void sendTabSelected(String str, cp7 cp7Var) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
