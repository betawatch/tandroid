package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.model.IOnCheckedChangeListener;
import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import androidx.car.app.model.Toggle;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class OnCheckedChangeDelegateImpl implements OnCheckedChangeDelegate {
    private final IOnCheckedChangeListener mStub;

    public void sendCheckedChange(boolean z, OnDoneCallback onDoneCallback) {
        try {
            IOnCheckedChangeListener iOnCheckedChangeListener = this.mStub;
            Objects.requireNonNull(iOnCheckedChangeListener);
            iOnCheckedChangeListener.onCheckedChange(z, RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl(Toggle.OnCheckedChangeListener onCheckedChangeListener) {
        this.mStub = new OnCheckedChangeListenerStub(onCheckedChangeListener);
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }

    static OnCheckedChangeDelegate create(Toggle.OnCheckedChangeListener onCheckedChangeListener) {
        return new OnCheckedChangeDelegateImpl(onCheckedChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class OnCheckedChangeListenerStub extends IOnCheckedChangeListener.Stub {
        private final Toggle.OnCheckedChangeListener mListener;

        OnCheckedChangeListenerStub(Toggle.OnCheckedChangeListener onCheckedChangeListener) {
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onCheckedChange", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    Object lambda$onCheckedChange$0;
                    lambda$onCheckedChange$0 = OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub.this.lambda$onCheckedChange$0(z);
                    return lambda$onCheckedChange$0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object lambda$onCheckedChange$0(boolean z) {
            throw null;
        }
    }
}
