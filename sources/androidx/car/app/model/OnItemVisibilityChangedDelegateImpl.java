package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.model.IOnItemVisibilityChangedListener;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class OnItemVisibilityChangedDelegateImpl implements OnItemVisibilityChangedDelegate {
    private final IOnItemVisibilityChangedListener mStub;

    public void sendItemVisibilityChanged(int i, int i2, OnDoneCallback onDoneCallback) {
        try {
            IOnItemVisibilityChangedListener iOnItemVisibilityChangedListener = this.mStub;
            Objects.requireNonNull(iOnItemVisibilityChangedListener);
            iOnItemVisibilityChangedListener.onItemVisibilityChanged(i, i2, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
        this.mStub = new OnItemVisibilityChangedListenerStub(onItemVisibilityChangedListener);
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }

    static OnItemVisibilityChangedDelegate create(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
        return new OnItemVisibilityChangedDelegateImpl(onItemVisibilityChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class OnItemVisibilityChangedListenerStub extends IOnItemVisibilityChangedListener.Stub {
        private final ItemList.OnItemVisibilityChangedListener mListener;

        OnItemVisibilityChangedListenerStub(ItemList.OnItemVisibilityChangedListener onItemVisibilityChangedListener) {
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onItemVisibilityChanged", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onItemVisibilityChanged$0;
                    lambda$onItemVisibilityChanged$0 = OnItemVisibilityChangedDelegateImpl.OnItemVisibilityChangedListenerStub.this.lambda$onItemVisibilityChanged$0(i, i2);
                    return lambda$onItemVisibilityChanged$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onItemVisibilityChanged$0(int i, int i2) {
            throw null;
        }
    }
}
