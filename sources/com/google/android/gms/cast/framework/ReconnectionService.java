package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.e;
import com.google.android.gms.internal.cast.v;
import d6.d;
import d6.g;
import d6.k;
import d6.r;
import d6.s;
import d6.u;
import d6.y;
import g6.b;
import n6.l;
import x6.a;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                Parcel O0 = sVar.O0();
                v.c(O0, intent);
                Parcel Q0 = sVar.Q0(O0, 3);
                IBinder readStrongBinder = Q0.readStrongBinder();
                Q0.recycle();
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
            Parcel Q0 = yVar.Q0(yVar.O0(), 7);
            aVar = x6.b.L0(Q0.readStrongBinder());
            Q0.recycle();
        } catch (RemoteException e) {
            g.c.a(e, "Unable to call %s on %s.", "getWrappedThis", y.class.getSimpleName());
            aVar = null;
        }
        l.e("Must be called from the main thread.");
        k kVar = c10.d;
        kVar.getClass();
        try {
            r rVar = kVar.a;
            Parcel Q02 = rVar.Q0(rVar.O0(), 5);
            aVar2 = x6.b.L0(Q02.readStrongBinder());
            Q02.recycle();
        } catch (RemoteException e7) {
            k.b.a(e7, "Unable to call %s on %s.", "getWrappedThis", r.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = e.a;
        if (aVar != null && aVar2 != null) {
            try {
                uVar = e.b(getApplicationContext()).X0(new x6.b(this), aVar, aVar2);
            } catch (RemoteException | d e10) {
                e.a.a(e10, "Unable to call %s on %s.", "newReconnectionServiceImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.a = uVar;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.S0(sVar.O0(), 1);
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
                sVar.S0(sVar.O0(), 4);
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
                Parcel O0 = sVar.O0();
                v.c(O0, intent);
                O0.writeInt(i10);
                O0.writeInt(i11);
                Parcel Q0 = sVar.Q0(O0, 2);
                int readInt = Q0.readInt();
                Q0.recycle();
                return readInt;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onStartCommand", u.class.getSimpleName());
            }
        }
        return 2;
    }
}
