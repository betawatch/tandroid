package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class ea {
    public final m8.f a;

    public ea(m8.f fVar) {
        this.a = fVar;
    }

    public final cb a() {
        m8.f fVar = this.a;
        fVar.getClass();
        try {
            v7.i iVar = (v7.i) fVar.a;
            Parcel o12 = iVar.o1(iVar.p1(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i7 = v7.b.a;
            LatLng createFromParcel = o12.readInt() == 0 ? null : creator.createFromParcel(o12);
            o12.recycle();
            return new cb(createFromParcel.a, createFromParcel.b);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void b(cb cbVar) {
        LatLng latLng = new LatLng(cbVar.a, cbVar.b);
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
