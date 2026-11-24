package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class SearchCallbackDelegateImpl implements as9 {
    private final ISearchCallback mStubCallback;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
    static class SearchCallbackStub extends ISearchCallback.Stub {
        private final xs9 mCallback;

        public SearchCallbackStub(xs9 xs9Var) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSearchSubmitted$1(String str) {
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSearchTextChanged$0(String str) {
            throw null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onSearchSubmitted", new f(this, str, (byte) 0));
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.e.c(iOnDoneCallback, "onSearchTextChanged", new f(this, str, (byte) 1));
        }
    }

    private SearchCallbackDelegateImpl(xs9 xs9Var) {
        this.mStubCallback = new SearchCallbackStub(xs9Var);
    }

    public static as9 create(xs9 xs9Var) {
        return new SearchCallbackDelegateImpl(xs9Var);
    }

    public void sendSearchSubmitted(String str, cp7 cp7Var) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchSubmitted(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    public void sendSearchTextChanged(String str, cp7 cp7Var) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchTextChanged(str, androidx.car.app.utils.e.a());
        } catch (RemoteException e) {
            sdb.b(e);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
