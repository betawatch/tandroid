package androidx.car.app.hardware.common;

import androidx.car.app.HostDispatcher;
import androidx.car.app.hardware.ICarHardwareHost;
import androidx.car.app.hardware.ICarHardwareResult;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.utils.RemoteUtils;
import j$.util.Objects;

/* loaded from: classes.dex */
public class CarHardwareHostDispatcher {
    private ICarHardwareHost mICarHardwareHost;

    public CarHardwareHostDispatcher(HostDispatcher hostDispatcher) {
        throw null;
    }

    public void dispatchGetCarHardwareResult(final int i, final Bundleable bundleable, final ICarHardwareResult iCarHardwareResult) {
        Objects.requireNonNull(iCarHardwareResult);
        RemoteUtils.dispatchCallToHost("getCarHardwareResult", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda0
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                Object lambda$dispatchGetCarHardwareResult$0;
                lambda$dispatchGetCarHardwareResult$0 = CarHardwareHostDispatcher.this.lambda$dispatchGetCarHardwareResult$0(i, bundleable, iCarHardwareResult);
                return lambda$dispatchGetCarHardwareResult$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$dispatchGetCarHardwareResult$0(int i, Bundleable bundleable, ICarHardwareResult iCarHardwareResult) {
        getHost().getCarHardwareResult(i, bundleable, iCarHardwareResult);
        return null;
    }

    public void dispatchSubscribeCarHardwareResult(final int i, final Bundleable bundleable, final ICarHardwareResult iCarHardwareResult) {
        Objects.requireNonNull(iCarHardwareResult);
        RemoteUtils.dispatchCallToHost("subscribeCarHardwareResult", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                Object lambda$dispatchSubscribeCarHardwareResult$1;
                lambda$dispatchSubscribeCarHardwareResult$1 = CarHardwareHostDispatcher.this.lambda$dispatchSubscribeCarHardwareResult$1(i, bundleable, iCarHardwareResult);
                return lambda$dispatchSubscribeCarHardwareResult$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$dispatchSubscribeCarHardwareResult$1(int i, Bundleable bundleable, ICarHardwareResult iCarHardwareResult) {
        getHost().subscribeCarHardwareResult(i, bundleable, iCarHardwareResult);
        return null;
    }

    public void dispatchUnsubscribeCarHardwareResult(final int i, final Bundleable bundleable) {
        RemoteUtils.dispatchCallToHost("unsubscribeCarHardwareResult", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda2
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                Object lambda$dispatchUnsubscribeCarHardwareResult$2;
                lambda$dispatchUnsubscribeCarHardwareResult$2 = CarHardwareHostDispatcher.this.lambda$dispatchUnsubscribeCarHardwareResult$2(i, bundleable);
                return lambda$dispatchUnsubscribeCarHardwareResult$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$dispatchUnsubscribeCarHardwareResult$2(int i, Bundleable bundleable) {
        getHost().unsubscribeCarHardwareResult(i, bundleable);
        return null;
    }

    private ICarHardwareHost getHost() {
        ICarHardwareHost iCarHardwareHost = this.mICarHardwareHost;
        if (iCarHardwareHost != null) {
            return iCarHardwareHost;
        }
        new Object() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda3
        };
        throw null;
    }
}
