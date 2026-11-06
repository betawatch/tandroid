package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
            Parcel O0 = iVar.O0(iVar.P0(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i7 = v7.b.a;
            LatLng createFromParcel = O0.readInt() == 0 ? null : creator.createFromParcel(O0);
            O0.recycle();
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
            Parcel P0 = iVar.P0();
            v7.b.b(P0, latLng);
            iVar.T0(P0, 3);
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
            Parcel P0 = iVar.P0();
            P0.writeFloat(f10);
            iVar.T0(P0, 22);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
