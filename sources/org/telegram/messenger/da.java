package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class da {
    public final m8.f a;

    public da(m8.f fVar) {
        this.a = fVar;
    }

    public final bb a() {
        m8.f fVar = this.a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.a;
            Parcel o12 = iVar.o1(iVar.p1(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i7 = v7.b.a;
            LatLng createFromParcel = o12.readInt() == 0 ? null : creator.createFromParcel(o12);
            o12.recycle();
            return new bb(createFromParcel.a, createFromParcel.b);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void b(bb bbVar) {
        LatLng latLng = new LatLng(bbVar.a, bbVar.b);
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
