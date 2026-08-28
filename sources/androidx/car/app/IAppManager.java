package androidx.car.app;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.IOnDoneCallback;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public interface IAppManager extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$IAppManager".replace('$', '.');

    void getTemplate(IOnDoneCallback iOnDoneCallback);

    void onBackPressed(IOnDoneCallback iOnDoneCallback);

    void startLocationUpdates(IOnDoneCallback iOnDoneCallback);

    void stopLocationUpdates(IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static abstract class Stub extends Binder implements IAppManager {
        static final int TRANSACTION_getTemplate = 2;
        static final int TRANSACTION_onBackPressed = 3;
        static final int TRANSACTION_startLocationUpdates = 4;
        static final int TRANSACTION_stopLocationUpdates = 5;

        /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
        public static class Proxy implements IAppManager {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAppManager.DESCRIPTOR;
            }

            @Override // androidx.car.app.IAppManager
            public void getTemplate(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppManager
            public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppManager
            public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppManager
            public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppManager.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, IAppManager.DESCRIPTOR);
        }

        public static IAppManager asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppManager.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAppManager)) ? new Proxy(iBinder) : (IAppManager) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
            String str = IAppManager.DESCRIPTOR;
            if (i9 >= 1 && i9 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i9 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i9 == 2) {
                getTemplate(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i9 == 3) {
                onBackPressed(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i9 == 4) {
                startLocationUpdates(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                if (i9 != 5) {
                    return super.onTransact(i9, parcel, parcel2, i10);
                }
                stopLocationUpdates(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }

    /* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
    public static class Default implements IAppManager {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IAppManager
        public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.IAppManager
        public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.IAppManager
        public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.IAppManager
        public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        }
    }
}
