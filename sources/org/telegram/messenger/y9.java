package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y9 {
    public final l8.f a;

    public y9(l8.f fVar) {
        this.a = fVar;
    }

    public final va a() {
        l8.f fVar = this.a;
        fVar.getClass();
        try {
            u7.i iVar = (u7.i) fVar.a;
            Parcel O0 = iVar.O0(iVar.P0(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i3 = u7.b.a;
            LatLng createFromParcel = O0.readInt() == 0 ? null : creator.createFromParcel(O0);
            O0.recycle();
            return new va(createFromParcel.a, createFromParcel.b);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void b(va vaVar) {
        LatLng latLng = new LatLng(vaVar.a, vaVar.b);
        l8.f fVar = this.a;
        fVar.getClass();
        try {
            u7.i iVar = (u7.i) fVar.a;
            Parcel P0 = iVar.P0();
            u7.b.b(P0, latLng);
            iVar.T0(P0, 3);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public final void c(int i3) {
        float f10 = i3;
        l8.f fVar = this.a;
        fVar.getClass();
        try {
            u7.i iVar = (u7.i) fVar.a;
            Parcel P0 = iVar.P0();
            P0.writeFloat(f10);
            iVar.T0(P0, 22);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
