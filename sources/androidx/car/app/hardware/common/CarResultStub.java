package androidx.car.app.hardware.common;

import android.os.IBinder;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class CarResultStub<T> extends ICarHardwareResult.Stub {
    private final Bundleable mBundle;
    private final CarHardwareHostDispatcher mHostDispatcher;
    private final boolean mIsSingleShot;
    private final Map<OnCarDataAvailableListener, Executor> mListeners = new HashMap();
    private final int mResultType;
    private final T mUnsupportedValue;

    public CarResultStub(int i, Bundleable bundleable, boolean z, T t, CarHardwareHostDispatcher carHardwareHostDispatcher) {
        Objects.requireNonNull(carHardwareHostDispatcher);
        this.mHostDispatcher = carHardwareHostDispatcher;
        this.mResultType = i;
        this.mBundle = bundleable;
        this.mIsSingleShot = z;
        Objects.requireNonNull(t);
        this.mUnsupportedValue = t;
    }

    public void addListener(Executor executor, OnCarDataAvailableListener onCarDataAvailableListener) {
        boolean isEmpty = this.mListeners.isEmpty();
        Map<OnCarDataAvailableListener, Executor> map = this.mListeners;
        Objects.requireNonNull(onCarDataAvailableListener);
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(onCarDataAvailableListener);
        map.put(null, executor);
        if (isEmpty) {
            if (this.mIsSingleShot) {
                this.mHostDispatcher.dispatchGetCarHardwareResult(this.mResultType, this.mBundle, this);
            } else {
                this.mHostDispatcher.dispatchSubscribeCarHardwareResult(this.mResultType, this.mBundle, this);
            }
        }
    }

    public boolean removeListener(OnCarDataAvailableListener onCarDataAvailableListener) {
        Map<OnCarDataAvailableListener, Executor> map = this.mListeners;
        Objects.requireNonNull(onCarDataAvailableListener);
        map.remove(onCarDataAvailableListener);
        if (!this.mListeners.isEmpty()) {
            return false;
        }
        if (this.mIsSingleShot) {
            return true;
        }
        this.mHostDispatcher.dispatchUnsubscribeCarHardwareResult(this.mResultType, this.mBundle);
        return true;
    }

    @Override // androidx.car.app.hardware.ICarHardwareResult
    public void onCarHardwareResult(int i, final boolean z, final Bundleable bundleable, IBinder iBinder) {
        RemoteUtils.dispatchCallFromHost(IOnDoneCallback.Stub.asInterface(iBinder), "onCarHardwareResult", new RemoteUtils.HostCall() { // from class: androidx.car.app.hardware.common.CarResultStub$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.HostCall
            public final Object dispatch() {
                Object lambda$onCarHardwareResult$0;
                lambda$onCarHardwareResult$0 = CarResultStub.this.lambda$onCarHardwareResult$0(z, bundleable);
                return lambda$onCarHardwareResult$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$onCarHardwareResult$0(boolean z, Bundleable bundleable) {
        notifyResults(z, bundleable);
        return null;
    }

    private void notifyResults(boolean z, Bundleable bundleable) {
        final T convertAndRecast = z ? convertAndRecast(bundleable) : this.mUnsupportedValue;
        for (final Map.Entry<OnCarDataAvailableListener, Executor> entry : this.mListeners.entrySet()) {
            entry.getValue().execute(new Runnable() { // from class: androidx.car.app.hardware.common.CarResultStub$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CarResultStub.lambda$notifyResults$1(entry, convertAndRecast);
                }
            });
        }
        if (this.mIsSingleShot) {
            this.mListeners.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyResults$1(Map.Entry entry, Object obj) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getKey());
        throw null;
    }

    private T convertAndRecast(Bundleable bundleable) {
        return (T) bundleable.get();
    }
}
