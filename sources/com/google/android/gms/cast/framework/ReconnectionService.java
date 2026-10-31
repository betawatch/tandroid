package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.d;
import com.google.android.gms.internal.cast.f;
import d6.g;
import d6.k;
import d6.r;
import d6.s;
import d6.u;
import d6.y;
import g6.b;
import n6.l;
import x6.a;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ReconnectionService extends Service {
    public static final b b = new b("ReconnectionService", null);
    public u a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        u uVar = this.a;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                Parcel P0 = sVar.P0();
                com.google.android.gms.internal.cast.u.c(P0, intent);
                Parcel R0 = sVar.R0(P0, 3);
                IBinder readStrongBinder = R0.readStrongBinder();
                R0.recycle();
                return readStrongBinder;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onBind", u.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a aVar;
        a aVar2;
        d6.a c10 = d6.a.c(this);
        g b10 = c10.b();
        b10.getClass();
        u uVar = null;
        try {
            y yVar = b10.a;
            Parcel R0 = yVar.R0(yVar.P0(), 7);
            aVar = x6.b.M0(R0.readStrongBinder());
            R0.recycle();
        } catch (RemoteException e) {
            g.c.a(e, "Unable to call %s on %s.", "getWrappedThis", y.class.getSimpleName());
            aVar = null;
        }
        l.d("Must be called from the main thread.");
        k kVar = c10.d;
        kVar.getClass();
        try {
            r rVar = kVar.a;
            Parcel R02 = rVar.R0(rVar.P0(), 5);
            aVar2 = x6.b.M0(R02.readStrongBinder());
            R02.recycle();
        } catch (RemoteException e7) {
            k.b.a(e7, "Unable to call %s on %s.", "getWrappedThis", r.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = d.a;
        if (aVar != null && aVar2 != null) {
            try {
                uVar = d.b(getApplicationContext()).Y0(new x6.b(this), aVar, aVar2);
            } catch (RemoteException | d6.d e10) {
                d.a.a(e10, "Unable to call %s on %s.", "newReconnectionServiceImpl", f.class.getSimpleName());
            }
        }
        this.a = uVar;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.T0(sVar.P0(), 1);
            } catch (RemoteException e11) {
                b.a(e11, "Unable to call %s on %s.", "onCreate", u.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        u uVar = this.a;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.T0(sVar.P0(), 4);
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onDestroy", u.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        u uVar = this.a;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                Parcel P0 = sVar.P0();
                com.google.android.gms.internal.cast.u.c(P0, intent);
                P0.writeInt(i10);
                P0.writeInt(i11);
                Parcel R0 = sVar.R0(P0, 2);
                int readInt = R0.readInt();
                R0.recycle();
                return readInt;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onStartCommand", u.class.getSimpleName());
            }
        }
        return 2;
    }
}
