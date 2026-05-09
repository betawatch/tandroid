package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarHardwareHostDispatcher;
import androidx.car.app.hardware.common.CarResultStubMap;
import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* loaded from: classes.dex */
public class ProjectedCarSensors implements CarSensors {
    private static final CarValue UNIMPLEMENTED_FLOAT_LIST = new CarValue(null, 0, 2);
    private final CarResultStubMap mAccelerometerCarResultStubMap;
    final CarHardwareHostDispatcher mCarHardwareHostDispatcher;
    private final CarResultStubMap mCarHardwareLocationCarResultStubMap;
    private final CarResultStubMap mCompassCarResultStubMap;
    private final CarResultStubMap mGyroscopeCarResultStubMap;

    public ProjectedCarSensors(CarHardwareHostDispatcher carHardwareHostDispatcher) {
        Objects.requireNonNull(carHardwareHostDispatcher);
        this.mCarHardwareHostDispatcher = carHardwareHostDispatcher;
        CarValue carValue = UNIMPLEMENTED_FLOAT_LIST;
        this.mAccelerometerCarResultStubMap = new CarResultStubMap(20, new Accelerometer(carValue), carHardwareHostDispatcher);
        this.mGyroscopeCarResultStubMap = new CarResultStubMap(22, new Gyroscope(carValue), carHardwareHostDispatcher);
        this.mCompassCarResultStubMap = new CarResultStubMap(21, new Compass(carValue), carHardwareHostDispatcher);
        this.mCarHardwareLocationCarResultStubMap = new CarResultStubMap(23, new CarHardwareLocation(new CarValue(null, 0L, 2)), carHardwareHostDispatcher);
    }
}
