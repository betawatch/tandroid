package androidx.car.app.model;

import android.os.RemoteException;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.OnDoneCallback;
import androidx.car.app.model.IOnClickListener;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class OnClickDelegateImpl implements OnClickDelegate {
    private final boolean mIsParkedOnly;
    private final IOnClickListener mListener;

    @Override // androidx.car.app.model.OnClickDelegate
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(OnDoneCallback onDoneCallback) {
        try {
            IOnClickListener iOnClickListener = this.mListener;
            Objects.requireNonNull(iOnClickListener);
            iOnClickListener.onClick(RemoteUtils.createOnDoneCallbackStub(onDoneCallback));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    static OnClickDelegate create(OnClickListener onClickListener) {
        return new OnClickDelegateImpl(onClickListener, onClickListener instanceof ParkedOnlyOnClickListener);
    }

    private OnClickDelegateImpl(OnClickListener onClickListener, boolean z) {
        this.mListener = new OnClickListenerStub(onClickListener);
        this.mIsParkedOnly = z;
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class OnClickListenerStub extends IOnClickListener.Stub {
        private final OnClickListener mOnClickListener;

        OnClickListenerStub(OnClickListener onClickListener) {
            this.mOnClickListener = onClickListener;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(IOnDoneCallback iOnDoneCallback) {
            RemoteUtils.dispatchCallFromHost(iOnDoneCallback, "onClick", new RemoteUtils.HostCall() { // from class: androidx.car.app.model.OnClickDelegateImpl$OnClickListenerStub$$ExternalSyntheticLambda0
                @Override // androidx.car.app.utils.RemoteUtils.HostCall
                public final Object dispatch() {
                    return OnClickDelegateImpl.OnClickListenerStub.$r8$lambda$XNCP4ktZ0-uqZhJZBLJ1aOuuP5k(OnClickDelegateImpl.OnClickListenerStub.this);
                }
            });
        }

        public static /* synthetic */ Object $r8$lambda$XNCP4ktZ0-uqZhJZBLJ1aOuuP5k(OnClickListenerStub onClickListenerStub) {
            onClickListenerStub.mOnClickListener.onClick();
            return null;
        }
    }
}
