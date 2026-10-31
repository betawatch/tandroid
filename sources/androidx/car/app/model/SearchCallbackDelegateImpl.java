package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class SearchCallbackDelegateImpl implements o0 {
    private final ISearchCallback mStubCallback;

    /* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
    public static class SearchCallbackStub extends ISearchCallback.Stub {
        private final r0 mCallback;

        public SearchCallbackStub(r0 r0Var) {
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
            androidx.car.app.utils.h.b(iOnDoneCallback, "onSearchSubmitted", new p0(this, str, 0));
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.h.b(iOnDoneCallback, "onSearchTextChanged", new p0(this, str, 1));
        }
    }

    private SearchCallbackDelegateImpl(r0 r0Var) {
        this.mStubCallback = new SearchCallbackStub(r0Var);
    }

    public static o0 create(r0 r0Var) {
        return new SearchCallbackDelegateImpl(r0Var);
    }

    public void sendSearchSubmitted(String str, androidx.car.app.j jVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchSubmitted(str, androidx.car.app.utils.h.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendSearchTextChanged(String str, androidx.car.app.j jVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchTextChanged(str, androidx.car.app.utils.h.a());
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
