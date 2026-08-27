package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.e;
import com.google.android.gms.internal.cast.g;
import i6.a;
import n5.d;
import n5.h;
import n5.s;
import n5.t;
import n5.v;
import n5.z;
import r5.b;
import y5.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class ReconnectionService extends Service {
    public static final b b = new b("ReconnectionService", null);
    public v a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        v vVar = this.a;
        if (vVar != null) {
            try {
                t tVar = (t) vVar;
                Parcel M0 = tVar.M0();
                com.google.android.gms.internal.cast.t.c(M0, intent);
                Parcel O0 = tVar.O0(M0, 3);
                IBinder readStrongBinder = O0.readStrongBinder();
                O0.recycle();
                return readStrongBinder;
            } catch (RemoteException e9) {
                b.a(e9, "Unable to call %s on %s.", "onBind", v.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a aVar;
        a aVar2;
        n5.a c10 = n5.a.c(this);
        h b10 = c10.b();
        b10.getClass();
        v vVar = null;
        try {
            z zVar = b10.a;
            Parcel O0 = zVar.O0(zVar.M0(), 7);
            aVar = i6.b.J0(O0.readStrongBinder());
            O0.recycle();
        } catch (RemoteException e9) {
            h.c.a(e9, "Unable to call %s on %s.", "getWrappedThis", z.class.getSimpleName());
            aVar = null;
        }
        l.e("Must be called from the main thread.");
        n5.l lVar = c10.d;
        lVar.getClass();
        try {
            s sVar = lVar.a;
            Parcel O02 = sVar.O0(sVar.M0(), 5);
            aVar2 = i6.b.J0(O02.readStrongBinder());
            O02.recycle();
        } catch (RemoteException e10) {
            n5.l.b.a(e10, "Unable to call %s on %s.", "getWrappedThis", s.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = e.a;
        if (aVar != null && aVar2 != null) {
            try {
                vVar = e.b(getApplicationContext()).V0(new i6.b(this), aVar, aVar2);
            } catch (RemoteException | d e11) {
                e.a.a(e11, "Unable to call %s on %s.", "newReconnectionServiceImpl", g.class.getSimpleName());
            }
        }
        this.a = vVar;
        if (vVar != null) {
            try {
                t tVar = (t) vVar;
                tVar.Q0(tVar.M0(), 1);
            } catch (RemoteException e12) {
                b.a(e12, "Unable to call %s on %s.", "onCreate", v.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        v vVar = this.a;
        if (vVar != null) {
            try {
                t tVar = (t) vVar;
                tVar.Q0(tVar.M0(), 4);
            } catch (RemoteException e9) {
                b.a(e9, "Unable to call %s on %s.", "onDestroy", v.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        v vVar = this.a;
        if (vVar != null) {
            try {
                t tVar = (t) vVar;
                Parcel M0 = tVar.M0();
                com.google.android.gms.internal.cast.t.c(M0, intent);
                M0.writeInt(i10);
                M0.writeInt(i11);
                Parcel O0 = tVar.O0(M0, 2);
                int readInt = O0.readInt();
                O0.recycle();
                return readInt;
            } catch (RemoteException e9) {
                b.a(e9, "Unable to call %s on %s.", "onStartCommand", v.class.getSimpleName());
            }
        }
        return 2;
    }
}
