package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ReconnectionService extends Service {
    public static final ce6 b = new ce6("ReconnectionService", null);
    public pbd a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        pbd pbdVar = this.a;
        if (pbdVar != null) {
            try {
                ebd ebdVar = (ebd) pbdVar;
                Parcel R = ebdVar.R();
                kid.c(R, intent);
                Parcel T = ebdVar.T(R, 3);
                IBinder readStrongBinder = T.readStrongBinder();
                T.recycle();
                return readStrongBinder;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onBind", pbd.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        xk5 xk5Var;
        xk5 xk5Var2;
        ie1 c = ie1.c(this);
        l8a b2 = c.b();
        b2.getClass();
        pbd pbdVar = null;
        try {
            pcd pcdVar = b2.a;
            Parcel T = pcdVar.T(pcdVar.R(), 7);
            xk5Var = eq7.T(T.readStrongBinder());
            T.recycle();
        } catch (RemoteException e) {
            l8a.c.a(e, "Unable to call %s on %s.", "getWrappedThis", pcd.class.getSimpleName());
            xk5Var = null;
        }
        ite.e("Must be called from the main thread.");
        y7d y7dVar = c.d;
        y7dVar.getClass();
        try {
            sad sadVar = y7dVar.a;
            Parcel T2 = sadVar.T(sadVar.R(), 5);
            xk5Var2 = eq7.T(T2.readStrongBinder());
            T2.recycle();
        } catch (RemoteException e2) {
            y7d.b.a(e2, "Unable to call %s on %s.", "getWrappedThis", sad.class.getSimpleName());
            xk5Var2 = null;
        }
        ce6 ce6Var = v8d.a;
        if (xk5Var != null && xk5Var2 != null) {
            try {
                pbdVar = v8d.b(getApplicationContext()).a0(new eq7(this), xk5Var, xk5Var2);
            } catch (RemoteException | sg7 e3) {
                v8d.a.a(e3, "Unable to call %s on %s.", "newReconnectionServiceImpl", q9d.class.getSimpleName());
            }
        }
        this.a = pbdVar;
        if (pbdVar != null) {
            try {
                ebd ebdVar = (ebd) pbdVar;
                ebdVar.V(ebdVar.R(), 1);
            } catch (RemoteException e4) {
                b.a(e4, "Unable to call %s on %s.", "onCreate", pbd.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        pbd pbdVar = this.a;
        if (pbdVar != null) {
            try {
                ebd ebdVar = (ebd) pbdVar;
                ebdVar.V(ebdVar.R(), 4);
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onDestroy", pbd.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        pbd pbdVar = this.a;
        if (pbdVar != null) {
            try {
                ebd ebdVar = (ebd) pbdVar;
                Parcel R = ebdVar.R();
                kid.c(R, intent);
                R.writeInt(i);
                R.writeInt(i2);
                Parcel T = ebdVar.T(R, 2);
                int readInt = T.readInt();
                T.recycle();
                return readInt;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onStartCommand", pbd.class.getSimpleName());
            }
        }
        return 2;
    }
}
