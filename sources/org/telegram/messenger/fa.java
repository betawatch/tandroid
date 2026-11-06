package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class fa {
    public wf.b a;
    public HashMap b;
    public HashMap c;

    public final ea a(gf.g gVar) {
        v7.a iVar;
        wf.b bVar = this.a;
        m8.g gVar2 = (m8.g) gVar.b;
        bVar.getClass();
        try {
            q6.m.h(gVar2, "MarkerOptions must not be null.");
            l8.e eVar = (l8.e) bVar.b;
            Parcel P0 = eVar.P0();
            v7.b.b(P0, gVar2);
            Parcel O0 = eVar.O0(P0, 11);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i7 = v7.j.b;
            if (readStrongBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                iVar = queryLocalInterface instanceof v7.a ? (v7.a) queryLocalInterface : new v7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 11);
            }
            O0.recycle();
            m8.f fVar = iVar != null ? new m8.f(iVar) : null;
            ea eaVar = new ea(fVar);
            this.b.put(fVar, eaVar);
            return eaVar;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void b(ua uaVar) {
        wf.b bVar = this.a;
        k8.a aVar = ((ca) uaVar).a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            a7.a aVar2 = aVar.a;
            Parcel P0 = eVar.P0();
            v7.b.c(P0, aVar2);
            eVar.T0(P0, 5);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void c(ua uaVar) {
        wf.b bVar = this.a;
        k8.a aVar = ((ca) uaVar).a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            a7.a aVar2 = aVar.a;
            Parcel P0 = eVar.P0();
            v7.b.c(P0, aVar2);
            P0.writeInt(500);
            v7.b.c(P0, null);
            eVar.T0(P0, 7);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final fi.y4 d() {
        wf.b bVar = this.a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            Parcel O0 = eVar.O0(eVar.P0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i7 = v7.b.a;
            CameraPosition createFromParcel = O0.readInt() == 0 ? null : creator.createFromParcel(O0);
            O0.recycle();
            LatLng latLng = createFromParcel.a;
            return new fi.y4(new cb(latLng.a, latLng.b), createFromParcel.b, 2);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final float e() {
        wf.b bVar = this.a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            Parcel O0 = eVar.O0(eVar.P0(), 2);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final float f() {
        wf.b bVar = this.a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            Parcel O0 = eVar.O0(eVar.P0(), 3);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final h9.f1 g() {
        l8.b bVar;
        wf.b bVar2 = this.a;
        bVar2.getClass();
        try {
            if (((h9.f1) bVar2.c) == null) {
                l8.e eVar = (l8.e) bVar2.b;
                Parcel O0 = eVar.O0(eVar.P0(), 25);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    bVar = queryLocalInterface instanceof l8.b ? (l8.b) queryLocalInterface : new l8.b(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 11);
                }
                O0.recycle();
                bVar2.c = new h9.f1(bVar, 5);
            }
            h9.f1 f1Var = (h9.f1) bVar2.c;
            h9.f1 f1Var2 = new h9.f1(23, false);
            f1Var2.b = f1Var;
            return f1Var2;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void h(ua uaVar) {
        wf.b bVar = this.a;
        k8.a aVar = ((ca) uaVar).a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            a7.a aVar2 = aVar.a;
            Parcel P0 = eVar.P0();
            v7.b.c(P0, aVar2);
            eVar.T0(P0, 4);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void i(ya yaVar) {
        wf.b bVar = this.a;
        m8.e eVar = yaVar == null ? null : ((ga) yaVar).a;
        bVar.getClass();
        try {
            l8.e eVar2 = (l8.e) bVar.b;
            Parcel P0 = eVar2.P0();
            v7.b.b(P0, eVar);
            Parcel O0 = eVar2.O0(P0, 91);
            O0.readInt();
            O0.recycle();
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void j(int i7) {
        wf.b bVar = this.a;
        if (i7 == 0) {
            bVar.i0(1);
        } else if (i7 == 1) {
            bVar.i0(2);
        } else {
            if (i7 != 2) {
                return;
            }
            bVar.i0(4);
        }
    }

    public final void k(boolean z9) {
        wf.b bVar = this.a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            Parcel P0 = eVar.P0();
            int i7 = v7.b.a;
            P0.writeInt(z9 ? 1 : 0);
            eVar.T0(P0, 22);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void l(db dbVar) {
        wf.b bVar = this.a;
        p1 p1Var = new p1(dbVar, 8);
        l8.e eVar = (l8.e) bVar.b;
        try {
            k8.c cVar = new k8.c(p1Var, (byte) 0);
            Parcel P0 = eVar.P0();
            v7.b.c(P0, cVar);
            eVar.T0(P0, 96);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void m(eb ebVar) {
        wf.b bVar = this.a;
        o oVar = new o(3, this, ebVar);
        l8.e eVar = (l8.e) bVar.b;
        try {
            k8.c cVar = new k8.c(oVar);
            Parcel P0 = eVar.P0();
            v7.b.c(P0, cVar);
            eVar.T0(P0, 30);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void n(q0.a aVar) {
        wf.b bVar = this.a;
        y9 y9Var = new y9(aVar, 2);
        l8.e eVar = (l8.e) bVar.b;
        try {
            k8.c cVar = new k8.c(y9Var);
            Parcel P0 = eVar.P0();
            v7.b.c(P0, cVar);
            eVar.T0(P0, 36);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void o(int i7, int i10, int i11, int i12) {
        wf.b bVar = this.a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            Parcel P0 = eVar.P0();
            P0.writeInt(i7);
            P0.writeInt(i10);
            P0.writeInt(i11);
            P0.writeInt(i12);
            eVar.T0(P0, 39);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
