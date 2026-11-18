package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class ca {
    public final m8.f a;

    public ca(m8.f fVar) {
        this.a = fVar;
    }

    public final ab a() {
        m8.f fVar = this.a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.a;
            Parcel o12 = iVar.o1(iVar.p1(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i7 = v7.b.a;
            LatLng createFromParcel = o12.readInt() == 0 ? null : creator.createFromParcel(o12);
            o12.recycle();
            return new ab(createFromParcel.a, createFromParcel.b);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void b(ab abVar) {
        LatLng latLng = new LatLng(abVar.a, abVar.b);
        m8.f fVar = this.a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.a;
            Parcel p12 = iVar.p1();
            v7.b.b(p12, latLng);
            iVar.t1(p12, 3);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void c(float f10) {
        m8.f fVar = this.a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.a;
            Parcel p12 = iVar.p1();
            p12.writeFloat(f10);
            iVar.t1(p12, 22);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
