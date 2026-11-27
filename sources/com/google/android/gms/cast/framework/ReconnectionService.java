package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class ReconnectionService extends Service {
    public static final he6 b = new he6("ReconnectionService", null);
    public ged a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ged gedVar = this.a;
        if (gedVar != null) {
            try {
                vdd vddVar = (vdd) gedVar;
                Parcel R = vddVar.R();
                ald.c(R, intent);
                Parcel T = vddVar.T(R, 3);
                IBinder readStrongBinder = T.readStrongBinder();
                T.recycle();
                return readStrongBinder;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onBind", ged.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        al5 al5Var;
        al5 al5Var2;
        id1 c = id1.c(this);
        baa b2 = c.b();
        b2.getClass();
        ged gedVar = null;
        try {
            gfd gfdVar = b2.a;
            Parcel T = gfdVar.T(gfdVar.R(), 7);
            al5Var = br7.T(T.readStrongBinder());
            T.recycle();
        } catch (RemoteException e) {
            baa.c.a(e, "Unable to call %s on %s.", "getWrappedThis", gfd.class.getSimpleName());
            al5Var = null;
        }
        xve.e("Must be called from the main thread.");
        pad padVar = c.d;
        padVar.getClass();
        try {
            jdd jddVar = padVar.a;
            Parcel T2 = jddVar.T(jddVar.R(), 5);
            al5Var2 = br7.T(T2.readStrongBinder());
            T2.recycle();
        } catch (RemoteException e2) {
            pad.b.a(e2, "Unable to call %s on %s.", "getWrappedThis", jdd.class.getSimpleName());
            al5Var2 = null;
        }
        he6 he6Var = mbd.a;
        if (al5Var != null && al5Var2 != null) {
            try {
                gedVar = mbd.b(getApplicationContext()).a0(new br7(this), al5Var, al5Var2);
            } catch (RemoteException | zg7 e3) {
                mbd.a.a(e3, "Unable to call %s on %s.", "newReconnectionServiceImpl", hcd.class.getSimpleName());
            }
        }
        this.a = gedVar;
        if (gedVar != null) {
            try {
                vdd vddVar = (vdd) gedVar;
                vddVar.V(vddVar.R(), 1);
            } catch (RemoteException e4) {
                b.a(e4, "Unable to call %s on %s.", "onCreate", ged.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ged gedVar = this.a;
        if (gedVar != null) {
            try {
                vdd vddVar = (vdd) gedVar;
                vddVar.V(vddVar.R(), 4);
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onDestroy", ged.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ged gedVar = this.a;
        if (gedVar != null) {
            try {
                vdd vddVar = (vdd) gedVar;
                Parcel R = vddVar.R();
                ald.c(R, intent);
                R.writeInt(i);
                R.writeInt(i2);
                Parcel T = vddVar.T(R, 2);
                int readInt = T.readInt();
                T.recycle();
                return readInt;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onStartCommand", ged.class.getSimpleName());
            }
        }
        return 2;
    }
}
