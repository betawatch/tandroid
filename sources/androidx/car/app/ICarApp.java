package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.car.app.ICarHost;
import androidx.car.app.IOnDoneCallback;
import v7.s;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public interface ICarApp extends IInterface {
    public static final String DESCRIPTOR = "androidx$car$app$ICarApp".replace('$', '.');

    void getAppInfo(IOnDoneCallback iOnDoneCallback);

    void getManager(String str, IOnDoneCallback iOnDoneCallback);

    void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback);

    void onAppPause(IOnDoneCallback iOnDoneCallback);

    void onAppResume(IOnDoneCallback iOnDoneCallback);

    void onAppStart(IOnDoneCallback iOnDoneCallback);

    void onAppStop(IOnDoneCallback iOnDoneCallback);

    void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback);

    void onHandshakeCompleted(w.b bVar, IOnDoneCallback iOnDoneCallback);

    void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback);

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static abstract class Stub extends Binder implements ICarApp {
        static final int TRANSACTION_getAppInfo = 10;
        static final int TRANSACTION_getManager = 9;
        static final int TRANSACTION_onAppCreate = 2;
        static final int TRANSACTION_onAppPause = 5;
        static final int TRANSACTION_onAppResume = 4;
        static final int TRANSACTION_onAppStart = 3;
        static final int TRANSACTION_onAppStop = 6;
        static final int TRANSACTION_onConfigurationChanged = 8;
        static final int TRANSACTION_onHandshakeCompleted = 11;
        static final int TRANSACTION_onNewIntent = 7;

        /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
        public static class Proxy implements ICarApp {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // androidx.car.app.ICarApp
            public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return ICarApp.DESCRIPTOR;
            }

            @Override // androidx.car.app.ICarApp
            public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iCarHost);
                    s.b(obtain, intent);
                    s.b(obtain, configuration);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppPause(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppResume(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppStart(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onAppStop(IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    s.b(obtain, configuration);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onHandshakeCompleted(w.b bVar, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    s.b(obtain, bVar);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.car.app.ICarApp
            public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(ICarApp.DESCRIPTOR);
                    s.b(obtain, intent);
                    obtain.writeStrongInterface(iOnDoneCallback);
                    this.mRemote.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, ICarApp.DESCRIPTOR);
        }

        public static ICarApp asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ICarApp.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof ICarApp)) ? new Proxy(iBinder) : (ICarApp) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = ICarApp.DESCRIPTOR;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i10) {
                case 2:
                    onAppCreate(ICarHost.Stub.asInterface(parcel.readStrongBinder()), (Intent) s.a(parcel, Intent.CREATOR), (Configuration) s.a(parcel, Configuration.CREATOR), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    onAppStart(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 4:
                    onAppResume(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 5:
                    onAppPause(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 6:
                    onAppStop(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 7:
                    onNewIntent((Intent) s.a(parcel, Intent.CREATOR), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 8:
                    onConfigurationChanged((Configuration) s.a(parcel, Configuration.CREATOR), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 9:
                    getManager(parcel.readString(), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 10:
                    getAppInfo(IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
                    return true;
                case 11:
                    onHandshakeCompleted((w.b) s.a(parcel, w.b.CREATOR), IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
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

    /* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
    public static class Default implements ICarApp {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.ICarApp
        public void getAppInfo(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void getManager(String str, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void onConfigurationChanged(Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void onHandshakeCompleted(w.b bVar, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void onNewIntent(Intent intent, IOnDoneCallback iOnDoneCallback) {
        }

        @Override // androidx.car.app.ICarApp
        public void onAppCreate(ICarHost iCarHost, Intent intent, Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        }
    }
}
