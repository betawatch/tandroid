package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class da {
    public jb.m a;
    public HashMap b;
    public HashMap c;

    public final ca a(j6.r rVar) {
        v7.a iVar;
        jb.m mVar = this.a;
        m8.g gVar = (m8.g) rVar.b;
        mVar.getClass();
        try {
            q6.m.i(gVar, "MarkerOptions must not be null.");
            l8.e eVar = (l8.e) mVar.b;
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
        jb.m mVar = this.a;
        h6.o oVar = ((aa) saVar).a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.b;
            a7.a aVar = (a7.a) oVar.b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar);
            eVar.t1(p12, 5);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void c(sa saVar) {
        jb.m mVar = this.a;
        h6.o oVar = ((aa) saVar).a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.b;
            a7.a aVar = (a7.a) oVar.b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar);
            p12.writeInt(500);
            v7.b.c(p12, null);
            eVar.t1(p12, 7);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final hi.g5 d() {
        jb.m mVar = this.a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.b;
            Parcel o12 = eVar.o1(eVar.p1(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i7 = v7.b.a;
            CameraPosition createFromParcel = o12.readInt() == 0 ? null : creator.createFromParcel(o12);
            o12.recycle();
            LatLng latLng = createFromParcel.a;
            return new hi.g5(new ab(latLng.a, latLng.b), createFromParcel.b, 2);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final float e() {
        jb.m mVar = this.a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.b;
            Parcel o12 = eVar.o1(eVar.p1(), 2);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final float f() {
        jb.m mVar = this.a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.b;
            Parcel o12 = eVar.o1(eVar.p1(), 3);
            float readFloat = o12.readFloat();
            o12.recycle();
            return readFloat;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final h6.o g() {
        l8.b bVar;
        jb.m mVar = this.a;
        mVar.getClass();
        try {
            if (((hi.u0) mVar.c) == null) {
                l8.e eVar = (l8.e) mVar.b;
                Parcel o12 = eVar.o1(eVar.p1(), 25);
                IBinder readStrongBinder = o12.readStrongBinder();
                if (readStrongBinder == null) {
                    bVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    bVar = queryLocalInterface instanceof l8.b ? (l8.b) queryLocalInterface : new l8.b(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 11);
                }
                o12.recycle();
                mVar.c = new hi.u0(bVar, 9);
            }
            hi.u0 u0Var = (hi.u0) mVar.c;
            h6.o oVar = new h6.o(26, false);
            oVar.b = u0Var;
            return oVar;
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void h(sa saVar) {
        jb.m mVar = this.a;
        h6.o oVar = ((aa) saVar).a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.b;
            a7.a aVar = (a7.a) oVar.b;
            Parcel p12 = eVar.p1();
            v7.b.c(p12, aVar);
            eVar.t1(p12, 4);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void i(wa waVar) {
        jb.m mVar = this.a;
        m8.e eVar = waVar == null ? null : ((ea) waVar).a;
        mVar.getClass();
        try {
            l8.e eVar2 = (l8.e) mVar.b;
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
        jb.m mVar = this.a;
        if (i7 == 0) {
            mVar.Y0(1);
        } else if (i7 == 1) {
            mVar.Y0(2);
        } else {
            if (i7 != 2) {
                return;
            }
            mVar.Y0(4);
        }
    }

    public final void k(boolean z10) {
        jb.m mVar = this.a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.b;
            Parcel p12 = eVar.p1();
            int i7 = v7.b.a;
            p12.writeInt(z10 ? 1 : 0);
            eVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void l(bb bbVar) {
        jb.m mVar = this.a;
        j1 j1Var = new j1(bbVar, 9);
        l8.e eVar = (l8.e) mVar.b;
        try {
            k8.b bVar = new k8.b(j1Var, (char) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, bVar);
            eVar.t1(p12, 96);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void m(cb cbVar) {
        jb.m mVar = this.a;
        o oVar = new o(3, this, cbVar);
        l8.e eVar = (l8.e) mVar.b;
        try {
            k8.b bVar = new k8.b(oVar);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, bVar);
            eVar.t1(p12, 30);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void n(int i7, int i10, int i11, int i12) {
        jb.m mVar = this.a;
        mVar.getClass();
        try {
            l8.e eVar = (l8.e) mVar.b;
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
