package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import j$.util.Objects;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class SearchCallbackDelegateImpl implements o0 {
    private final ISearchCallback mStubCallback;

    /* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            androidx.car.app.utils.j.b(iOnDoneCallback, "onSearchSubmitted", new p0(this, str, 0));
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(String str, IOnDoneCallback iOnDoneCallback) {
            androidx.car.app.utils.j.b(iOnDoneCallback, "onSearchTextChanged", new p0(this, str, 1));
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
            iSearchCallback.onSearchSubmitted(str, androidx.car.app.utils.j.a());
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }

    public void sendSearchTextChanged(String str, androidx.car.app.j jVar) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchTextChanged(str, androidx.car.app.utils.j.a());
        } catch (RemoteException e6) {
            throw new RuntimeException(e6);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
