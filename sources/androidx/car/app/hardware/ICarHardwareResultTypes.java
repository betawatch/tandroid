package androidx.car.app.hardware;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface ICarHardwareResultTypes extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$hardware$ICarHardwareResultTypes".replace('$', '.');
    public static final int TYPE_INFO_ENERGY_LEVEL = 4;
    public static final int TYPE_INFO_ENERGY_PROFILE = 2;
    public static final int TYPE_INFO_EV_STATUS = 7;
    public static final int TYPE_INFO_MILEAGE = 6;
    public static final int TYPE_INFO_MODEL = 1;
    public static final int TYPE_INFO_SPEED = 5;
    public static final int TYPE_INFO_TOLL = 3;
    public static final int TYPE_SENSOR_ACCELEROMETER = 20;
    public static final int TYPE_SENSOR_CAR_LOCATION = 23;
    public static final int TYPE_SENSOR_COMPASS = 21;
    public static final int TYPE_SENSOR_GYROSCOPE = 22;
    public static final int TYPE_UNKNOWN = 0;

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Default implements ICarHardwareResultTypes {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class Stub extends Binder implements ICarHardwareResultTypes {

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public static class Proxy implements ICarHardwareResultTypes {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICarHardwareResultTypes.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, ICarHardwareResultTypes.DESCRIPTOR);
        }

        public static ICarHardwareResultTypes asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarHardwareResultTypes.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICarHardwareResultTypes)) ? new Proxy(iBinder) : (ICarHardwareResultTypes) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            String str = ICarHardwareResultTypes.DESCRIPTOR;
            if (i9 != 1598968902) {
                return super.onTransact(i9, parcel, parcel2, i10);
            }
            parcel2.writeString(str);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
