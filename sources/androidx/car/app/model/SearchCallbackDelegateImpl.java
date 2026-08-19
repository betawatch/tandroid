package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.model.ISearchCallback;
import androidx.car.app.model.SearchCallbackDelegateImpl;
import androidx.car.app.model.SearchTemplate;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class SearchCallbackDelegateImpl implements SearchCallbackDelegate {
    private final ISearchCallback mStubCallback;

    public void sendSearchTextChanged(String str, OnDoneCallback onDoneCallback) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchTextChanged(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendSearchSubmitted(String str, OnDoneCallback onDoneCallback) {
        try {
            ISearchCallback iSearchCallback = this.mStubCallback;
            Objects.requireNonNull(iSearchCallback);
            iSearchCallback.onSearchSubmitted(str, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private SearchCallbackDelegateImpl(SearchTemplate.SearchCallback searchCallback) {
        this.mStubCallback = new SearchCallbackStub(searchCallback);
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }

    static SearchCallbackDelegate create(SearchTemplate.SearchCallback searchCallback) {
        return new SearchCallbackDelegateImpl(searchCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class SearchCallbackStub extends ISearchCallback.Stub {
        private final SearchTemplate.SearchCallback mCallback;

        SearchCallbackStub(SearchTemplate.SearchCallback searchCallback) {
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onSearchTextChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.SearchCallbackDelegateImpl$SearchCallbackStub$$ExternalSyntheticLambda1
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return SearchCallbackDelegateImpl.SearchCallbackStub.$r8$lambda$RqmlWNPg55YHdmSVQQAEDPV549Q(SearchCallbackDelegateImpl.SearchCallbackStub.this, str);
                }
            });
        }

        public static /* synthetic */ Object $r8$lambda$RqmlWNPg55YHdmSVQQAEDPV549Q(SearchCallbackStub searchCallbackStub, String str) {
            searchCallbackStub.getClass();
            throw null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(final String str, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onSearchSubmitted", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.SearchCallbackDelegateImpl$SearchCallbackStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return SearchCallbackDelegateImpl.SearchCallbackStub.$r8$lambda$dx39ga_t255O8OhkV41BCLGktgU(SearchCallbackDelegateImpl.SearchCallbackStub.this, str);
                }
            });
        }

        public static /* synthetic */ Object $r8$lambda$dx39ga_t255O8OhkV41BCLGktgU(SearchCallbackStub searchCallbackStub, String str) {
            searchCallbackStub.getClass();
            throw null;
        }
    }
}
