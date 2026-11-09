package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
            Parcel p12 = eVar.p1();
            v7.b.b(p12, gVar2);
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
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            eVar.t1(p12, 5);
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
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            p12.writeInt(500);
            v7.b.c(p12, null);
            eVar.t1(p12, 7);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final fi.y4 d() {
        wf.b bVar = this.a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
            Parcel o12 = eVar.o1(eVar.p1(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i7 = v7.b.a;
            CameraPosition createFromParcel = o12.readInt() == 0 ? null : creator.createFromParcel(o12);
            o12.recycle();
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
            Parcel o12 = eVar.o1(eVar.p1(), 2);
            float readFloat = o12.readFloat();
            o12.recycle();
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
            Parcel o12 = eVar.o1(eVar.p1(), 3);
            float readFloat = o12.readFloat();
            o12.recycle();
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
                Parcel o12 = eVar.o1(eVar.p1(), 25);
                IBinder readStrongBinder = o12.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    bVar = queryLocalInterface instanceof l8.b ? (l8.b) queryLocalInterface : new l8.b(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 11);
                }
                o12.recycle();
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
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar2);
            eVar.t1(p12, 4);
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
            Parcel p12 = eVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(z9 ? 1 : 0);
            eVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void l(db dbVar) {
        wf.b bVar = this.a;
        j1 j1Var = new j1(dbVar, 8);
        l8.e eVar = (l8.e) bVar.b;
        try {
            k8.c cVar = new k8.c(j1Var, (byte) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 96);
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
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 30);
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
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 36);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void o(int i7, int i10, int i11, int i12) {
        wf.b bVar = this.a;
        bVar.getClass();
        try {
            l8.e eVar = (l8.e) bVar.b;
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
