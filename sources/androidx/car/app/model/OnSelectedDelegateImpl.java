package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.model.IOnSelectedListener;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.OnSelectedDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class OnSelectedDelegateImpl implements OnSelectedDelegate {
    private final IOnSelectedListener mStub;

    public void sendSelected(int i, OnDoneCallback onDoneCallback) {
        try {
            IOnSelectedListener iOnSelectedListener = this.mStub;
            Objects.requireNonNull(iOnSelectedListener);
            iOnSelectedListener.onSelected(i, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl(ItemList.OnSelectedListener onSelectedListener) {
        this.mStub = new OnSelectedListenerStub(onSelectedListener);
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }

    static OnSelectedDelegate create(ItemList.OnSelectedListener onSelectedListener) {
        return new OnSelectedDelegateImpl(onSelectedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class OnSelectedListenerStub extends IOnSelectedListener.Stub {
        private final ItemList.OnSelectedListener mListener;

        OnSelectedListenerStub(ItemList.OnSelectedListener onSelectedListener) {
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(final int i, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onSelectedListener", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnSelectedDelegateImpl$OnSelectedListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onSelected$0;
                    lambda$onSelected$0 = OnSelectedDelegateImpl.OnSelectedListenerStub.this.lambda$onSelected$0(i);
                    return lambda$onSelected$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onSelected$0(int i) {
            throw null;
        }
    }
}
