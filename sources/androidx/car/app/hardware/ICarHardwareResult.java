package androidx.car.app.hardware;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import w.b;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public interface ICarHardwareResult extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$hardware$ICarHardwareResult".replace('$', '.');

    void onCarHardwareResult(int i7, boolean z9, b bVar, IBinder iBinder);

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static abstract class Stub extends Binder implements ICarHardwareResult {
        static final int TRANSACTION_onCarHardwareResult = 2;

        /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
        public static class Proxy implements ICarHardwareResult {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return ICarHardwareResult.DESCRIPTOR;
            }

            @Override // androidx.car.app.hardware.ICarHardwareResult
            public void onCarHardwareResult(int i7, boolean z9, b bVar, IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarHardwareResult.DESCRIPTOR);
                    obtain.writeInt(i7);
                    obtain.writeInt(z9 ? 1 : 0);
                    if (bVar != null) {
                        obtain.writeInt(1);
                        bVar.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICarHardwareResult.DESCRIPTOR);
        }

        public static ICarHardwareResult asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarHardwareResult.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICarHardwareResult)) ? new Proxy(iBinder) : (ICarHardwareResult) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
            String str = ICarHardwareResult.DESCRIPTOR;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i7 != 2) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            onCarHardwareResult(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null, parcel.readStrongBinder());
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
    public static class Default implements ICarHardwareResult {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.hardware.ICarHardwareResult
        public void onCarHardwareResult(int i7, boolean z9, b bVar, IBinder iBinder) {
        }
    }
}
