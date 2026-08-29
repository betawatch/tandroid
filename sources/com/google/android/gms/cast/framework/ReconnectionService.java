package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.e;
import j6.a;
import p5.d;
import p5.g;
import p5.k;
import p5.r;
import p5.s;
import p5.u;
import p5.y;
import s5.b;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                com.google.android.gms.internal.cast.u.c(M0, intent);
                Parcel O0 = sVar.O0(M0, 3);
                IBinder readStrongBinder = O0.readStrongBinder();
                O0.recycle();
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
        p5.a c3 = p5.a.c(this);
        g b10 = c3.b();
        b10.getClass();
        u uVar = null;
        try {
            y yVar = b10.a;
            Parcel O0 = yVar.O0(yVar.M0(), 7);
            aVar = j6.b.J0(O0.readStrongBinder());
            O0.recycle();
        } catch (RemoteException e10) {
            g.c.a(e10, "Unable to call %s on %s.", "getWrappedThis", y.class.getSimpleName());
            aVar = null;
        }
        l.e("Must be called from the main thread.");
        k kVar = c3.d;
        kVar.getClass();
        try {
            r rVar = kVar.a;
            Parcel O02 = rVar.O0(rVar.M0(), 5);
            aVar2 = j6.b.J0(O02.readStrongBinder());
            O02.recycle();
        } catch (RemoteException e11) {
            k.b.a(e11, "Unable to call %s on %s.", "getWrappedThis", r.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = e.a;
        if (aVar != null && aVar2 != null) {
            try {
                uVar = e.b(getApplicationContext()).V0(new j6.b(this), aVar, aVar2);
            } catch (RemoteException | d e12) {
                e.a.a(e12, "Unable to call %s on %s.", "newReconnectionServiceImpl", com.google.android.gms.internal.cast.g.class.getSimpleName());
            }
        }
        this.a = uVar;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.Q0(sVar.M0(), 1);
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
                sVar.Q0(sVar.M0(), 4);
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "onDestroy", u.class.getSimpleName());
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
                com.google.android.gms.internal.cast.u.c(M0, intent);
                M0.writeInt(i10);
                M0.writeInt(i11);
                Parcel O0 = sVar.O0(M0, 2);
                int readInt = O0.readInt();
                O0.recycle();
                return readInt;
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "onStartCommand", u.class.getSimpleName());
            }
        }
        return 2;
    }
}
