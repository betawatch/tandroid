package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z9 {
    public p4.q a;
    public HashMap b;
    public HashMap c;

    public final y9 a(gi.v5 v5Var) {
        u7.a iVar;
        p4.q qVar = this.a;
        l8.g gVar = (l8.g) v5Var.b;
        qVar.getClass();
        try {
            p6.m.h(gVar, "MarkerOptions must not be null.");
            k8.e eVar = (k8.e) qVar.a;
            Parcel P0 = eVar.P0();
            u7.b.b(P0, gVar);
            Parcel O0 = eVar.O0(P0, 11);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i3 = u7.j.b;
            if (readStrongBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                iVar = queryLocalInterface instanceof u7.a ? (u7.a) queryLocalInterface : new u7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 10);
            }
            O0.recycle();
            l8.f fVar = iVar != null ? new l8.f(iVar) : null;
            y9 y9Var = new y9(fVar);
            this.b.put(fVar, y9Var);
            return y9Var;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void b(na naVar) {
        p4.q qVar = this.a;
        gi.w5 w5Var = ((w9) naVar).a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            z6.a aVar = (z6.a) w5Var.b;
            Parcel P0 = eVar.P0();
            u7.b.c(P0, aVar);
            eVar.T0(P0, 5);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void c(na naVar) {
        p4.q qVar = this.a;
        gi.w5 w5Var = ((w9) naVar).a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            z6.a aVar = (z6.a) w5Var.b;
            Parcel P0 = eVar.P0();
            u7.b.c(P0, aVar);
            P0.writeInt(500);
            u7.b.c(P0, null);
            eVar.T0(P0, 7);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final gi.w4 d() {
        p4.q qVar = this.a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            Parcel O0 = eVar.O0(eVar.P0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i3 = u7.b.a;
            CameraPosition createFromParcel = O0.readInt() == 0 ? null : creator.createFromParcel(O0);
            O0.recycle();
            LatLng latLng = createFromParcel.a;
            return new gi.w4(new va(latLng.a, latLng.b), createFromParcel.b, 2);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final float e() {
        p4.q qVar = this.a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            Parcel O0 = eVar.O0(eVar.P0(), 2);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final float f() {
        p4.q qVar = this.a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            Parcel O0 = eVar.O0(eVar.P0(), 3);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final hi.d g() {
        k8.b bVar;
        p4.q qVar = this.a;
        qVar.getClass();
        try {
            if (((gi.v5) qVar.b) == null) {
                k8.e eVar = (k8.e) qVar.a;
                Parcel O0 = eVar.O0(eVar.P0(), 25);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    bVar = queryLocalInterface instanceof k8.b ? (k8.b) queryLocalInterface : new k8.b(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 10);
                }
                O0.recycle();
                qVar.b = new gi.v5(bVar, 5);
            }
            gi.v5 v5Var = (gi.v5) qVar.b;
            hi.d dVar = new hi.d(24, false);
            dVar.b = v5Var;
            return dVar;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void h(na naVar) {
        p4.q qVar = this.a;
        gi.w5 w5Var = ((w9) naVar).a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            z6.a aVar = (z6.a) w5Var.b;
            Parcel P0 = eVar.P0();
            u7.b.c(P0, aVar);
            eVar.T0(P0, 4);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void i(ra raVar) {
        p4.q qVar = this.a;
        l8.e eVar = raVar == null ? null : ((aa) raVar).a;
        qVar.getClass();
        try {
            k8.e eVar2 = (k8.e) qVar.a;
            Parcel P0 = eVar2.P0();
            u7.b.b(P0, eVar);
            Parcel O0 = eVar2.O0(P0, 91);
            O0.readInt();
            O0.recycle();
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void j(int i3) {
        p4.q qVar = this.a;
        if (i3 == 0) {
            qVar.E(1);
        } else if (i3 == 1) {
            qVar.E(2);
        } else {
            if (i3 != 2) {
                return;
            }
            qVar.E(4);
        }
    }

    public final void k(boolean z10) {
        p4.q qVar = this.a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            Parcel P0 = eVar.P0();
            int i3 = u7.b.a;
            P0.writeInt(z10 ? 1 : 0);
            eVar.T0(P0, 22);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void l(wa waVar) {
        p4.q qVar = this.a;
        p1 p1Var = new p1(waVar, 7);
        k8.e eVar = (k8.e) qVar.a;
        try {
            j8.b bVar = new j8.b(p1Var, (byte) 0);
            Parcel P0 = eVar.P0();
            u7.b.c(P0, bVar);
            eVar.T0(P0, 96);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void m(xa xaVar) {
        p4.q qVar = this.a;
        o oVar = new o(3, this, xaVar);
        k8.e eVar = (k8.e) qVar.a;
        try {
            j8.b bVar = new j8.b(oVar);
            Parcel P0 = eVar.P0();
            u7.b.c(P0, bVar);
            eVar.T0(P0, 30);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void n(q0.a aVar) {
        p4.q qVar = this.a;
        s9 s9Var = new s9(aVar, 2);
        k8.e eVar = (k8.e) qVar.a;
        try {
            j8.b bVar = new j8.b(s9Var);
            Parcel P0 = eVar.P0();
            u7.b.c(P0, bVar);
            eVar.T0(P0, 36);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void o(int i3, int i10, int i11, int i12) {
        p4.q qVar = this.a;
        qVar.getClass();
        try {
            k8.e eVar = (k8.e) qVar.a;
            Parcel P0 = eVar.P0();
            P0.writeInt(i3);
            P0.writeInt(i10);
            P0.writeInt(i11);
            P0.writeInt(i12);
            eVar.T0(P0, 39);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
