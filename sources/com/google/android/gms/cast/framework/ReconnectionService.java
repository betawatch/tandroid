package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.d;
import com.google.android.gms.internal.cast.f;
import f6.g;
import f6.k;
import f6.r;
import f6.s;
import f6.u;
import f6.y;
import i6.b;
import p6.m;
import z6.a;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "onBind", u.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a aVar;
        a aVar2;
        f6.a c2 = f6.a.c(this);
        g b10 = c2.b();
        b10.getClass();
        u uVar = null;
        try {
            y yVar = b10.a;
            Parcel R0 = yVar.R0(yVar.P0(), 7);
            aVar = z6.b.M0(R0.readStrongBinder());
            R0.recycle();
        } catch (RemoteException e10) {
            g.c.a(e10, "Unable to call %s on %s.", "getWrappedThis", y.class.getSimpleName());
            aVar = null;
        }
        m.d("Must be called from the main thread.");
        k kVar = c2.d;
        kVar.getClass();
        try {
            r rVar = kVar.a;
            Parcel R02 = rVar.R0(rVar.P0(), 5);
            aVar2 = z6.b.M0(R02.readStrongBinder());
            R02.recycle();
        } catch (RemoteException e11) {
            k.b.a(e11, "Unable to call %s on %s.", "getWrappedThis", r.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = d.a;
        if (aVar != null && aVar2 != null) {
            try {
                uVar = d.b(getApplicationContext()).Y0(new z6.b(this), aVar, aVar2);
            } catch (RemoteException | f6.d e12) {
                d.a.a(e12, "Unable to call %s on %s.", "newReconnectionServiceImpl", f.class.getSimpleName());
            }
        }
        this.a = uVar;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.T0(sVar.P0(), 1);
            } catch (RemoteException e13) {
                b.a(e13, "Unable to call %s on %s.", "onCreate", u.class.getSimpleName());
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
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "onDestroy", u.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i3, int i10) {
        u uVar = this.a;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                Parcel P0 = sVar.P0();
                com.google.android.gms.internal.cast.u.c(P0, intent);
                P0.writeInt(i3);
                P0.writeInt(i10);
                Parcel R0 = sVar.R0(P0, 2);
                int readInt = R0.readInt();
                R0.recycle();
                return readInt;
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "onStartCommand", u.class.getSimpleName());
            }
        }
        return 2;
    }
}
