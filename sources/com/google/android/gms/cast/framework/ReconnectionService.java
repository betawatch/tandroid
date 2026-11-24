package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class ReconnectionService extends Service {
    public static final dc6 b = new dc6("ReconnectionService", null);
    public n9d a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        n9d n9dVar = this.a;
        if (n9dVar != null) {
            try {
                c9d c9dVar = (c9d) n9dVar;
                Parcel R = c9dVar.R();
                jgd.c(R, intent);
                Parcel T = c9dVar.T(R, 3);
                IBinder readStrongBinder = T.readStrongBinder();
                T.recycle();
                return readStrongBinder;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onBind", n9d.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        yi5 yi5Var;
        yi5 yi5Var2;
        ad1 c = ad1.c(this);
        j6a b2 = c.b();
        b2.getClass();
        n9d n9dVar = null;
        try {
            nad nadVar = b2.a;
            Parcel T = nadVar.T(nadVar.R(), 7);
            yi5Var = bo7.T(T.readStrongBinder());
            T.recycle();
        } catch (RemoteException e) {
            j6a.c.a(e, "Unable to call %s on %s.", "getWrappedThis", nad.class.getSimpleName());
            yi5Var = null;
        }
        fre.e("Must be called from the main thread.");
        w5d w5dVar = c.d;
        w5dVar.getClass();
        try {
            q8d q8dVar = w5dVar.a;
            Parcel T2 = q8dVar.T(q8dVar.R(), 5);
            yi5Var2 = bo7.T(T2.readStrongBinder());
            T2.recycle();
        } catch (RemoteException e2) {
            w5d.b.a(e2, "Unable to call %s on %s.", "getWrappedThis", q8d.class.getSimpleName());
            yi5Var2 = null;
        }
        dc6 dc6Var = t6d.a;
        if (yi5Var != null && yi5Var2 != null) {
            try {
                n9dVar = t6d.b(getApplicationContext()).a0(new bo7(this), yi5Var, yi5Var2);
            } catch (RemoteException | qe7 e3) {
                t6d.a.a(e3, "Unable to call %s on %s.", "newReconnectionServiceImpl", o7d.class.getSimpleName());
            }
        }
        this.a = n9dVar;
        if (n9dVar != null) {
            try {
                c9d c9dVar = (c9d) n9dVar;
                c9dVar.V(c9dVar.R(), 1);
            } catch (RemoteException e4) {
                b.a(e4, "Unable to call %s on %s.", "onCreate", n9d.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        n9d n9dVar = this.a;
        if (n9dVar != null) {
            try {
                c9d c9dVar = (c9d) n9dVar;
                c9dVar.V(c9dVar.R(), 4);
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onDestroy", n9d.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        n9d n9dVar = this.a;
        if (n9dVar != null) {
            try {
                c9d c9dVar = (c9d) n9dVar;
                Parcel R = c9dVar.R();
                jgd.c(R, intent);
                R.writeInt(i);
                R.writeInt(i2);
                Parcel T = c9dVar.T(R, 2);
                int readInt = T.readInt();
                T.recycle();
                return readInt;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onStartCommand", n9d.class.getSimpleName());
            }
        }
        return 2;
    }
}
