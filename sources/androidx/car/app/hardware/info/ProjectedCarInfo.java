package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarHardwareHostDispatcher;
import androidx.car.app.hardware.common.CarResultStub;
import androidx.car.app.hardware.info.EnergyLevel;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.hardware.info.EvStatus;
import androidx.car.app.hardware.info.Mileage;
import androidx.car.app.hardware.info.Model;
import androidx.car.app.hardware.info.Speed;
import androidx.car.app.hardware.info.TollCard;

/* loaded from: classes.dex */
public class ProjectedCarInfo implements CarInfo {
    private final CarResultStub mEnergyLevelCarResultStub;
    private final CarResultStub mEnergyProfileCarResultStub;
    private final CarResultStub mEvStatusCarResultStub;
    private final CarResultStub mMileageCarResultStub;
    private final CarResultStub mModelCarResultStub;
    private final CarResultStub mSpeedCarResultStub;
    private final CarResultStub mTollCarResultStub;

    public ProjectedCarInfo(CarHardwareHostDispatcher carHardwareHostDispatcher) {
        this.mModelCarResultStub = new CarResultStub(1, null, true, new Model.Builder().build(), carHardwareHostDispatcher);
        this.mEnergyProfileCarResultStub = new CarResultStub(2, null, true, new EnergyProfile.Builder().build(), carHardwareHostDispatcher);
        this.mTollCarResultStub = new CarResultStub(3, null, false, new TollCard.Builder().build(), carHardwareHostDispatcher);
        this.mEnergyLevelCarResultStub = new CarResultStub(4, null, false, new EnergyLevel.Builder().build(), carHardwareHostDispatcher);
        this.mSpeedCarResultStub = new CarResultStub(5, null, false, new Speed.Builder().build(), carHardwareHostDispatcher);
        this.mMileageCarResultStub = new CarResultStub(6, null, false, new Mileage.Builder().build(), carHardwareHostDispatcher);
        this.mEvStatusCarResultStub = new CarResultStub(7, null, false, new EvStatus.Builder().build(), carHardwareHostDispatcher);
    }
}
