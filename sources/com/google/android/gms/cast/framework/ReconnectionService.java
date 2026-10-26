package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.d;
import com.google.android.gms.internal.cast.f;
import com.google.android.gms.internal.cast.t;
import e6.g;
import e6.k;
import e6.r;
import e6.s;
import e6.u;
import e6.y;
import h6.b;
import o6.l;
import y6.a;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                Parcel N0 = sVar.N0();
                t.c(N0, intent);
                Parcel P0 = sVar.P0(N0, 3);
                IBinder readStrongBinder = P0.readStrongBinder();
                P0.recycle();
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
        e6.a c10 = e6.a.c(this);
        g b10 = c10.b();
        b10.getClass();
        u uVar = null;
        try {
            y yVar = b10.a;
            Parcel P0 = yVar.P0(yVar.N0(), 7);
            aVar = y6.b.K0(P0.readStrongBinder());
            P0.recycle();
        } catch (RemoteException e) {
            g.c.a(e, "Unable to call %s on %s.", "getWrappedThis", y.class.getSimpleName());
            aVar = null;
        }
        l.e("Must be called from the main thread.");
        k kVar = c10.d;
        kVar.getClass();
        try {
            r rVar = kVar.a;
            Parcel P02 = rVar.P0(rVar.N0(), 5);
            aVar2 = y6.b.K0(P02.readStrongBinder());
            P02.recycle();
        } catch (RemoteException e10) {
            k.b.a(e10, "Unable to call %s on %s.", "getWrappedThis", r.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = d.a;
        if (aVar != null && aVar2 != null) {
            try {
                uVar = d.b(getApplicationContext()).W0(new y6.b(this), aVar, aVar2);
            } catch (RemoteException | e6.d e11) {
                d.a.a(e11, "Unable to call %s on %s.", "newReconnectionServiceImpl", f.class.getSimpleName());
            }
        }
        this.a = uVar;
        if (uVar != null) {
            try {
                s sVar = (s) uVar;
                sVar.R0(sVar.N0(), 1);
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
                sVar.R0(sVar.N0(), 4);
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
                Parcel N0 = sVar.N0();
                t.c(N0, intent);
                N0.writeInt(i10);
                N0.writeInt(i11);
                Parcel P0 = sVar.P0(N0, 2);
                int readInt = P0.readInt();
                P0.recycle();
                return readInt;
            } catch (RemoteException e) {
                b.a(e, "Unable to call %s on %s.", "onStartCommand", u.class.getSimpleName());
            }
        }
        return 2;
    }
}
