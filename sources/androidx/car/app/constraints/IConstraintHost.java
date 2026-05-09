package androidx.car.app.constraints;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface IConstraintHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$constraints$IConstraintHost".replace('$', '.');

    public static class Default implements IConstraintHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.constraints.IConstraintHost
        public int getContentLimit(int i) {
            return 0;
        }

        @Override // androidx.car.app.constraints.IConstraintHost
        public boolean isAppDrivenRefreshEnabled() {
            return false;
        }
    }

    int getContentLimit(int i);

    boolean isAppDrivenRefreshEnabled();

    public static abstract class Stub extends Binder implements IConstraintHost {
        static final int TRANSACTION_getContentLimit = 2;
        static final int TRANSACTION_isAppDrivenRefreshEnabled = 3;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IConstraintHost.DESCRIPTOR);
        }

        public static IConstraintHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IConstraintHost.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IConstraintHost)) {
                return (IConstraintHost) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IConstraintHost.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                int contentLimit = getContentLimit(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(contentLimit);
            } else if (i == 3) {
                boolean isAppDrivenRefreshEnabled = isAppDrivenRefreshEnabled();
                parcel2.writeNoException();
                parcel2.writeInt(isAppDrivenRefreshEnabled ? 1 : 0);
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        private static class Proxy implements IConstraintHost {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IConstraintHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.constraints.IConstraintHost
            public int getContentLimit(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IConstraintHost.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.constraints.IConstraintHost
            public boolean isAppDrivenRefreshEnabled() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IConstraintHost.DESCRIPTOR);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
