package org.telegram.messenger;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ga {
    public n4.q a;
    public HashMap b;
    public HashMap c;

    public final fa a(l2.f fVar) {
        s7.a iVar;
        n4.q qVar = this.a;
        j8.f fVar2 = (j8.f) fVar.b;
        qVar.getClass();
        try {
            n6.l.h(fVar2, "MarkerOptions must not be null.");
            i8.f fVar3 = (i8.f) qVar.a;
            Parcel P0 = fVar3.P0();
            s7.b.b(P0, fVar2);
            Parcel O0 = fVar3.O0(P0, 11);
            IBinder readStrongBinder = O0.readStrongBinder();
            int i10 = s7.j.b;
            if (readStrongBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                iVar = queryLocalInterface instanceof s7.a ? (s7.a) queryLocalInterface : new s7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 9);
            }
            O0.recycle();
            j8.e eVar = iVar != null ? new j8.e(iVar) : null;
            fa faVar = new fa(this, eVar);
            this.b.put(eVar, faVar);
            return faVar;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void b(ua uaVar) {
        n4.q qVar = this.a;
        za.c cVar = ((da) uaVar).a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            x6.a aVar = (x6.a) cVar.b;
            Parcel P0 = fVar.P0();
            s7.b.c(P0, aVar);
            fVar.T0(P0, 5);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void c(ua uaVar, int i10) {
        n4.q qVar = this.a;
        za.c cVar = ((da) uaVar).a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            x6.a aVar = (x6.a) cVar.b;
            Parcel P0 = fVar.P0();
            s7.b.c(P0, aVar);
            P0.writeInt(i10);
            s7.b.c(P0, null);
            fVar.T0(P0, 7);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final jg.c0 d() {
        n4.q qVar = this.a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            Parcel O0 = fVar.O0(fVar.P0(), 1);
            Parcelable.Creator<CameraPosition> creator = CameraPosition.CREATOR;
            int i10 = s7.b.a;
            CameraPosition createFromParcel = O0.readInt() == 0 ? null : creator.createFromParcel(O0);
            O0.recycle();
            LatLng latLng = createFromParcel.a;
            return new jg.c0(new cb(latLng.a, latLng.b), createFromParcel.b, 2);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final float e() {
        n4.q qVar = this.a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            Parcel O0 = fVar.O0(fVar.P0(), 2);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final float f() {
        n4.q qVar = this.a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            Parcel O0 = fVar.O0(fVar.P0(), 3);
            float readFloat = O0.readFloat();
            O0.recycle();
            return readFloat;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final n2.u g() {
        i8.b bVar;
        n4.q qVar = this.a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            Parcel O0 = fVar.O0(fVar.P0(), 26);
            IBinder readStrongBinder = O0.readStrongBinder();
            if (readStrongBinder == null) {
                bVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                bVar = queryLocalInterface instanceof i8.b ? (i8.b) queryLocalInterface : new i8.b(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 9);
            }
            O0.recycle();
            a6.i iVar = new a6.i(bVar, 25);
            n2.u uVar = new n2.u(5);
            uVar.b = iVar;
            return uVar;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final k2.m0 h() {
        i8.c cVar;
        n4.q qVar = this.a;
        qVar.getClass();
        try {
            if (((a4.l) qVar.b) == null) {
                i8.f fVar = (i8.f) qVar.a;
                Parcel O0 = fVar.O0(fVar.P0(), 25);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    cVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    cVar = queryLocalInterface instanceof i8.c ? (i8.c) queryLocalInterface : new i8.c(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 9);
                }
                O0.recycle();
                qVar.b = new a4.l(cVar, 19);
            }
            a4.l lVar = (a4.l) qVar.b;
            k2.m0 m0Var = new k2.m0();
            m0Var.a = lVar;
            return m0Var;
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void i(ua uaVar) {
        n4.q qVar = this.a;
        za.c cVar = ((da) uaVar).a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            x6.a aVar = (x6.a) cVar.b;
            Parcel P0 = fVar.P0();
            s7.b.c(P0, aVar);
            fVar.T0(P0, 4);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void j(ya yaVar) {
        n4.q qVar = this.a;
        j8.d dVar = yaVar == null ? null : ((ha) yaVar).a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            Parcel P0 = fVar.P0();
            s7.b.b(P0, dVar);
            Parcel O0 = fVar.O0(P0, 91);
            O0.readInt();
            O0.recycle();
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void k(int i10) {
        n4.q qVar = this.a;
        if (i10 == 0) {
            qVar.G(1);
        } else if (i10 == 1) {
            qVar.G(2);
        } else {
            if (i10 != 2) {
                return;
            }
            qVar.G(4);
        }
    }

    public final void l(boolean z10) {
        n4.q qVar = this.a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            Parcel P0 = fVar.P0();
            int i10 = s7.b.a;
            P0.writeInt(z10 ? 1 : 0);
            fVar.T0(P0, 22);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void m(Runnable runnable) {
        n4.q qVar = this.a;
        s1 s1Var = new s1(runnable, 5);
        i8.f fVar = (i8.f) qVar.a;
        try {
            h8.b bVar = new h8.b(s1Var, (char) 0);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 97);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void n(db dbVar) {
        n4.q qVar = this.a;
        s1 s1Var = new s1(dbVar, 7);
        i8.f fVar = (i8.f) qVar.a;
        try {
            h8.b bVar = new h8.b(s1Var, (byte) 0);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 96);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void o(eb ebVar) {
        n4.q qVar = this.a;
        p pVar = new p(3, this, ebVar);
        i8.f fVar = (i8.f) qVar.a;
        try {
            h8.b bVar = new h8.b(pVar);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 30);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void p(q0.a aVar) {
        n4.q qVar = this.a;
        z9 z9Var = new z9(aVar, 2);
        i8.f fVar = (i8.f) qVar.a;
        try {
            h8.b bVar = new h8.b(z9Var);
            Parcel P0 = fVar.P0();
            s7.b.c(P0, bVar);
            fVar.T0(P0, 36);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void q(int i10, int i11, int i12, int i13) {
        n4.q qVar = this.a;
        qVar.getClass();
        try {
            i8.f fVar = (i8.f) qVar.a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            P0.writeInt(i11);
            P0.writeInt(i12);
            P0.writeInt(i13);
            fVar.T0(P0, 39);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }
}
