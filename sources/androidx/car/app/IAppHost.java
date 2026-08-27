package androidx.car.app;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.car.app.ISurfaceCallback;
import g7.p;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public interface IAppHost extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$IAppHost".replace('$', '.');

    void dismissAlert(int i10);

    void invalidate();

    w.b openMicrophone(w.b bVar);

    void sendLocation(Location location);

    void setSurfaceCallback(ISurfaceCallback iSurfaceCallback);

    void showAlert(w.b bVar);

    void showToast(CharSequence charSequence, int i10);

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static class Default implements IAppHost {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.IAppHost
        public w.b openMicrophone(w.b bVar) {
            return null;
        }

        @Override // androidx.car.app.IAppHost
        public void invalidate() {
        }

        @Override // androidx.car.app.IAppHost
        public void dismissAlert(int i10) {
        }

        @Override // androidx.car.app.IAppHost
        public void sendLocation(Location location) {
        }

        @Override // androidx.car.app.IAppHost
        public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
        }

        @Override // androidx.car.app.IAppHost
        public void showAlert(w.b bVar) {
        }

        @Override // androidx.car.app.IAppHost
        public void showToast(CharSequence charSequence, int i10) {
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static abstract class Stub extends Binder implements IAppHost {
        static final int TRANSACTION_dismissAlert = 7;
        static final int TRANSACTION_invalidate = 2;
        static final int TRANSACTION_openMicrophone = 8;
        static final int TRANSACTION_sendLocation = 5;
        static final int TRANSACTION_setSurfaceCallback = 4;
        static final int TRANSACTION_showAlert = 6;
        static final int TRANSACTION_showToast = 3;

        /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
        public static class Proxy implements IAppHost {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.IAppHost
            public void dismissAlert(int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    obtain.writeInt(i10);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return IAppHost.DESCRIPTOR;
            }

            @Override // androidx.car.app.IAppHost
            public void invalidate() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public w.b openMicrophone(w.b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    p.b(obtain, bVar, 0);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return (w.b) p.a(obtain2, w.b.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public void sendLocation(Location location) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    p.b(obtain, location, 0);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public void setSurfaceCallback(ISurfaceCallback iSurfaceCallback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    obtain.writeStrongInterface(iSurfaceCallback);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public void showAlert(w.b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    p.b(obtain, bVar, 0);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.IAppHost
            public void showToast(CharSequence charSequence, int i10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAppHost.DESCRIPTOR);
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i10);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, IAppHost.DESCRIPTOR);
        }

        public static IAppHost asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAppHost.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAppHost)) ? new Proxy(iBinder) : (IAppHost) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = IAppHost.DESCRIPTOR;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    invalidate();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    showToast((CharSequence) p.a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    setSurfaceCallback(ISurfaceCallback.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    sendLocation((Location) p.a(parcel, Location.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    showAlert((w.b) p.a(parcel, w.b.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    dismissAlert(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    w.b openMicrophone = openMicrophone((w.b) p.a(parcel, w.b.CREATOR));
                    parcel2.writeNoException();
                    p.b(parcel2, openMicrophone, 1);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
