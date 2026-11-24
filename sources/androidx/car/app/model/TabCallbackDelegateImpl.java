package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ITabCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class TabCallbackDelegateImpl implements agb {
    private final ITabCallback mStubCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
    static class TabCallbackStub extends ITabCallback.Stub {
        private final dgb mCallback;

        public TabCallbackStub(dgb dgbVar) {
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

    private TabCallbackDelegateImpl(dgb dgbVar) {
        this.mStubCallback = new TabCallbackStub(dgbVar);
    }

    public static agb create(dgb dgbVar) {
        return new TabCallbackDelegateImpl(dgbVar);
    }

    public void sendTabSelected(String str, fr7 fr7Var) {
        try {
            ITabCallback iTabCallback = this.mStubCallback;
            Objects.requireNonNull(iTabCallback);
            iTabCallback.onTabSelected(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            rjb.m(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
