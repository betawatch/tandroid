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
                return CarHardwareHostDispatcher.$r8$lambda$RWB_Hd3Wpqr7Y3FVmYXjx-Lusow(CarHardwareHostDispatcher.this, i, bundleable, iCarHardwareResult);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$RWB_Hd3Wpqr7Y3FVmYXjx-Lusow(CarHardwareHostDispatcher carHardwareHostDispatcher, int i, Bundleable bundleable, ICarHardwareResult iCarHardwareResult) {
        carHardwareHostDispatcher.getHost().getCarHardwareResult(i, bundleable, iCarHardwareResult);
        return null;
    }

    public void dispatchSubscribeCarHardwareResult(final int i, final Bundleable bundleable, final ICarHardwareResult iCarHardwareResult) {
        Objects.requireNonNull(iCarHardwareResult);
        RemoteUtils.dispatchCallToHost("subscribeCarHardwareResult", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda1
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                return CarHardwareHostDispatcher.$r8$lambda$-uJPuf2SZKQG1LuTBzNl32gl8Cs(CarHardwareHostDispatcher.this, i, bundleable, iCarHardwareResult);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$-uJPuf2SZKQG1LuTBzNl32gl8Cs(CarHardwareHostDispatcher carHardwareHostDispatcher, int i, Bundleable bundleable, ICarHardwareResult iCarHardwareResult) {
        carHardwareHostDispatcher.getHost().subscribeCarHardwareResult(i, bundleable, iCarHardwareResult);
        return null;
    }

    public void dispatchUnsubscribeCarHardwareResult(final int i, final Bundleable bundleable) {
        RemoteUtils.dispatchCallToHost("unsubscribeCarHardwareResult", new RemoteUtils.RemoteCall() { // from class: androidx.car.app.hardware.common.CarHardwareHostDispatcher$$ExternalSyntheticLambda2
            @Override // androidx.car.app.utils.RemoteUtils.RemoteCall
            public final Object call() {
                return CarHardwareHostDispatcher.$r8$lambda$QGWz3y_oA7uH7F2k5epRAGxfhNo(CarHardwareHostDispatcher.this, i, bundleable);
            }
        });
    }

    public static /* synthetic */ Object $r8$lambda$QGWz3y_oA7uH7F2k5epRAGxfhNo(CarHardwareHostDispatcher carHardwareHostDispatcher, int i, Bundleable bundleable) {
        carHardwareHostDispatcher.getHost().unsubscribeCarHardwareResult(i, bundleable);
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
