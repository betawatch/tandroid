package androidx.car.app.hardware;

import androidx.car.app.CarContext;
import androidx.car.app.HostDispatcher;
import androidx.car.app.hardware.CarHardwareManager;
import androidx.car.app.hardware.climate.CarClimate;
import androidx.car.app.hardware.common.CarHardwareHostDispatcher;
import androidx.car.app.hardware.info.CarInfo;
import androidx.car.app.hardware.info.CarSensors;
import androidx.car.app.hardware.info.ProjectedCarInfo;
import androidx.car.app.hardware.info.ProjectedCarSensors;

/* loaded from: classes.dex */
public class ProjectedCarHardwareManager implements CarHardwareManager {
    private final ProjectedCarInfo mVehicleInfo;
    private final ProjectedCarSensors mVehicleSensors;

    public /* bridge */ /* synthetic */ CarClimate getCarClimate() {
        CarHardwareManager.-CC.$default$getCarClimate(this);
        return null;
    }

    public CarInfo getCarInfo() {
        return this.mVehicleInfo;
    }

    public CarSensors getCarSensors() {
        return this.mVehicleSensors;
    }

    public ProjectedCarHardwareManager(CarContext carContext, HostDispatcher hostDispatcher) {
        CarHardwareHostDispatcher carHardwareHostDispatcher = new CarHardwareHostDispatcher(hostDispatcher);
        this.mVehicleInfo = new ProjectedCarInfo(carHardwareHostDispatcher);
        this.mVehicleSensors = new ProjectedCarSensors(carHardwareHostDispatcher);
    }
}
