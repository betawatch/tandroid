package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class da {
    public k8.a a;
    public HashMap b;
    public HashMap c;

    public final ca a(h9.g1 g1Var) {
        v7.a iVar;
        k8.a aVar = this.a;
        m8.g gVar = (m8.g) g1Var.b;
        aVar.getClass();
        try {
            q6.m.i(gVar, "MarkerOptions must not be null.");
            l8.e eVar = (l8.e) aVar.b;
            Parcel p12 = eVar.p1();
            v7.b.b(p12, gVar);
            Parcel o12 = eVar.o1(p12, 11);
            IBinder readStrongBinder = o12.readStrongBinder();
            int i7 = v7.j.b;
            if (readStrongBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                iVar = queryLocalInterface instanceof v7.a ? (v7.a) queryLocalInterface : new v7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 11);
            }
            o12.recycle();
            m8.f fVar = iVar != null ? new m8.f(iVar) : null;
            ca caVar = new ca(fVar);
            this.b.put(fVar, caVar);
            return caVar;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void b(sa saVar) {
        k8.a aVar = this.a;
        hi.w4 w4Var = ((aa) saVar).a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            a7.a aVar2 = (a7.a) w4Var.b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            eVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void c(sa saVar) {
        k8.a aVar = this.a;
        hi.w4 w4Var = ((aa) saVar).a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            a7.a aVar2 = (a7.a) w4Var.b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            p12.writeInt(500);
            v7.b.c(p12, null);
            eVar.t1(p12, 7);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final hi.u4 d() {
        k8.a aVar = this.a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            Parcel o12 = eVar.o1(eVar.p1(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i7 = v7.b.a;
            CameraPosition createFromParcel = o12.readInt() == 0 ? null : creator.createFromParcel(o12);
            o12.recycle();
            LatLng latLng = createFromParcel.a;
            return new hi.u4(new ab(latLng.a, latLng.b), createFromParcel.b, 2);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final float e() {
        k8.a aVar = this.a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            Parcel o12 = eVar.o1(eVar.p1(), 2);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final float f() {
        k8.a aVar = this.a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            Parcel o12 = eVar.o1(eVar.p1(), 3);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final hi.w4 g() {
        l8.b bVar;
        k8.a aVar = this.a;
        aVar.getClass();
        try {
            if (((hi.u5) aVar.c) == null) {
                l8.e eVar = (l8.e) aVar.b;
                Parcel o12 = eVar.o1(eVar.p1(), 25);
                IBinder readStrongBinder = o12.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    bVar = queryLocalInterface instanceof l8.b ? (l8.b) queryLocalInterface : new l8.b(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 11);
                }
                o12.recycle();
                aVar.c = new hi.u5(bVar, 8);
            }
            hi.u5 u5Var = (hi.u5) aVar.c;
            hi.w4 w4Var = new hi.w4(24, false);
            w4Var.b = u5Var;
            return w4Var;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void h(sa saVar) {
        k8.a aVar = this.a;
        hi.w4 w4Var = ((aa) saVar).a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            a7.a aVar2 = (a7.a) w4Var.b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            eVar.t1(p12, 4);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void i(wa waVar) {
        k8.a aVar = this.a;
        m8.e eVar = waVar == null ? null : ((ea) waVar).a;
        aVar.getClass();
        try {
            l8.e eVar2 = (l8.e) aVar.b;
            Parcel p12 = eVar2.p1();
            v7.b.b(p12, eVar);
            Parcel o12 = eVar2.o1(p12, 91);
            o12.readInt();
            o12.recycle();
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void j(int i7) {
        k8.a aVar = this.a;
        if (i7 == 0) {
            aVar.d1(1);
        } else if (i7 == 1) {
            aVar.d1(2);
        } else {
            if (i7 != 2) {
                return;
            }
            aVar.d1(4);
        }
    }

    public final void k(boolean z10) {
        k8.a aVar = this.a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            Parcel p12 = eVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(z10 ? 1 : 0);
            eVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void l(bb bbVar) {
        k8.a aVar = this.a;
        j1 j1Var = new j1(bbVar, 9);
        l8.e eVar = (l8.e) aVar.b;
        try {
            k8.c cVar = new k8.c(j1Var, (char) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 96);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void m(cb cbVar) {
        k8.a aVar = this.a;
        o oVar = new o(3, this, cbVar);
        l8.e eVar = (l8.e) aVar.b;
        try {
            k8.c cVar = new k8.c(oVar);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 30);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void n(int i7, int i10, int i11, int i12) {
        k8.a aVar = this.a;
        aVar.getClass();
        try {
            l8.e eVar = (l8.e) aVar.b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            p12.writeInt(i10);
            p12.writeInt(i11);
            p12.writeInt(i12);
            eVar.t1(p12, 39);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
