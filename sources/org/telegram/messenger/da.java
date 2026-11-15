package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    public final void c(int i7) {
        float f10 = i7;
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
