package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
import com.google.android.gms.internal.cast.d;
import com.google.android.gms.internal.cast.f;
import l6.a;
import r5.g;
import r5.k;
import r5.r;
import r5.s;
import r5.u;
import r5.y;
import u5.b;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                Parcel M0 = sVar.M0();
                com.google.android.gms.internal.cast.s.c(M0, intent);
                Parcel O0 = sVar.O0(M0, 3);
                IBinder readStrongBinder = O0.readStrongBinder();
                O0.recycle();
                return readStrongBinder;
            } catch (RemoteException e6) {
                b.a(e6, "Unable to call %s on %s.", "onBind", u.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a aVar;
        a aVar2;
        r5.a c3 = r5.a.c(this);
        g b10 = c3.b();
        b10.getClass();
        u uVar = null;
        try {
            y yVar = b10.a;
            Parcel O0 = yVar.O0(yVar.M0(), 7);
            aVar = l6.b.J0(O0.readStrongBinder());
            O0.recycle();
        } catch (RemoteException e6) {
            g.c.a(e6, "Unable to call %s on %s.", "getWrappedThis", y.class.getSimpleName());
            aVar = null;
        }
        m.e("Must be called from the main thread.");
        k kVar = c3.d;
        kVar.getClass();
        try {
            r rVar = kVar.a;
            Parcel O02 = rVar.O0(rVar.M0(), 5);
            aVar2 = l6.b.J0(O02.readStrongBinder());
            O02.recycle();
        } catch (RemoteException e10) {
            k.b.a(e10, "Unable to call %s on %s.", "getWrappedThis", r.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = d.a;
        if (aVar != null && aVar2 != null) {
            try {
                uVar = d.b(getApplicationContext()).V0(new l6.b(this), aVar, aVar2);
            } catch (RemoteException | r5.d e11) {
                d.a.a(e11, "Unable to call %s on %s.", "newReconnectionServiceImpl", f.class.getSimpleName());
            }
        }
        this.a = uVar;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.Q0(sVar.M0(), 1);
            } catch (RemoteException e12) {
                b.a(e12, "Unable to call %s on %s.", "onCreate", u.class.getSimpleName());
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
                sVar.Q0(sVar.M0(), 4);
            } catch (RemoteException e6) {
                b.a(e6, "Unable to call %s on %s.", "onDestroy", u.class.getSimpleName());
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
                Parcel M0 = sVar.M0();
                com.google.android.gms.internal.cast.s.c(M0, intent);
                M0.writeInt(i10);
                M0.writeInt(i11);
                Parcel O0 = sVar.O0(M0, 2);
                int readInt = O0.readInt();
                O0.recycle();
                return readInt;
            } catch (RemoteException e6) {
                b.a(e6, "Unable to call %s on %s.", "onStartCommand", u.class.getSimpleName());
            }
        }
        return 2;
    }
}
