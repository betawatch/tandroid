package androidx.car.app.hardware.common;

import j$.util.Objects;
import java.util.HashMap;

/* loaded from: classes.dex */
public class CarResultStubMap {
    private final CarHardwareHostDispatcher mHostDispatcher;
    private final int mResultType;
    private final HashMap mStubMap = new HashMap();
    private final Object mUnsupportedValue;

    public CarResultStubMap(int i, Object obj, CarHardwareHostDispatcher carHardwareHostDispatcher) {
        this.mResultType = i;
        Objects.requireNonNull(obj);
        this.mUnsupportedValue = obj;
        Objects.requireNonNull(carHardwareHostDispatcher);
        this.mHostDispatcher = carHardwareHostDispatcher;
    }
}
