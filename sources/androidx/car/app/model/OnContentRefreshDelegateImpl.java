package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.model.IOnContentRefreshListener;
import androidx.car.app.model.OnContentRefreshDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class OnContentRefreshDelegateImpl implements OnContentRefreshDelegate {
    private final IOnContentRefreshListener mListener;

    public void sendContentRefreshRequested(OnDoneCallback onDoneCallback) {
        try {
            IOnContentRefreshListener iOnContentRefreshListener = this.mListener;
            Objects.requireNonNull(iOnContentRefreshListener);
            iOnContentRefreshListener.onContentRefreshRequested(RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public static OnContentRefreshDelegate create(OnContentRefreshListener onContentRefreshListener) {
        return new OnContentRefreshDelegateImpl(onContentRefreshListener);
    }

    private OnContentRefreshDelegateImpl(OnContentRefreshListener onContentRefreshListener) {
        this.mListener = new OnContentRefreshListenerStub(onContentRefreshListener);
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class OnContentRefreshListenerStub extends IOnContentRefreshListener.Stub {
        private final OnContentRefreshListener mOnContentRefreshListener;

        OnContentRefreshListenerStub(OnContentRefreshListener onContentRefreshListener) {
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onClick", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnContentRefreshDelegateImpl$OnContentRefreshListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onContentRefreshRequested$0;
                    lambda$onContentRefreshRequested$0 = OnContentRefreshDelegateImpl.OnContentRefreshListenerStub.this.lambda$onContentRefreshRequested$0();
                    return lambda$onContentRefreshRequested$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onContentRefreshRequested$0() {
            throw null;
        }
    }
}
