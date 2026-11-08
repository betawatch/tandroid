package com.google.android.gms.cast.framework;

import a7.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.d;
import com.google.android.gms.internal.cast.f;
import com.google.android.gms.internal.cast.t;
import g6.g;
import g6.k;
import g6.r;
import g6.s;
import g6.u;
import g6.y;
import j6.b;
import q6.m;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                Parcel p12 = sVar.p1();
                t.c(p12, intent);
                Parcel r12 = sVar.r1(p12, 3);
                IBinder readStrongBinder = r12.readStrongBinder();
                r12.recycle();
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
        g6.a c10 = g6.a.c(this);
        g b10 = c10.b();
        b10.getClass();
        u uVar = null;
        try {
            y yVar = b10.a;
            Parcel r12 = yVar.r1(yVar.p1(), 7);
            aVar = a7.b.m1(r12.readStrongBinder());
            r12.recycle();
        } catch (RemoteException e10) {
            g.c.a(e10, "Unable to call %s on %s.", "getWrappedThis", y.class.getSimpleName());
            aVar = null;
        }
        m.d("Must be called from the main thread.");
        k kVar = c10.d;
        kVar.getClass();
        try {
            r rVar = kVar.a;
            Parcel r13 = rVar.r1(rVar.p1(), 5);
            aVar2 = a7.b.m1(r13.readStrongBinder());
            r13.recycle();
        } catch (RemoteException e11) {
            k.b.a(e11, "Unable to call %s on %s.", "getWrappedThis", r.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = d.a;
        if (aVar != null && aVar2 != null) {
            try {
                uVar = d.b(getApplicationContext()).y1(new a7.b(this), aVar, aVar2);
            } catch (RemoteException | g6.d e12) {
                d.a.a(e12, "Unable to call %s on %s.", "newReconnectionServiceImpl", f.class.getSimpleName());
            }
        }
        this.a = uVar;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.t1(sVar.p1(), 1);
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
                sVar.t1(sVar.p1(), 4);
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "onDestroy", u.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        u uVar = this.a;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                Parcel p12 = sVar.p1();
                t.c(p12, intent);
                p12.writeInt(i7);
                p12.writeInt(i10);
                Parcel r12 = sVar.r1(p12, 2);
                int readInt = r12.readInt();
                r12.recycle();
                return readInt;
            } catch (RemoteException e10) {
                b.a(e10, "Unable to call %s on %s.", "onStartCommand", u.class.getSimpleName());
            }
        }
        return 2;
    }
}
