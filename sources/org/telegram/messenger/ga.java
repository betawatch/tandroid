package org.telegram.messenger;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ga {
    public final j8.e a;
    public final /* synthetic */ ha b;

    public ga(ha haVar, j8.e eVar) {
        this.b = haVar;
        this.a = eVar;
    }

    public final db a() {
        j8.e eVar = this.a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.a;
            Parcel O0 = iVar.O0(iVar.P0(), 4);
            Parcelable.Creator<LatLng> creator = LatLng.CREATOR;
            int i10 = s7.b.a;
            LatLng createFromParcel = O0.readInt() == 0 ? null : creator.createFromParcel(O0);
            O0.recycle();
            return new db(createFromParcel.a, createFromParcel.b);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final Object b() {
        j8.e eVar = this.a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.a;
            Parcel O0 = iVar.O0(iVar.P0(), 30);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return x6.b.N0(M0);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void c() {
        j8.e eVar = this.a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.a;
            iVar.T0(iVar.P0(), 1);
            this.b.b.remove(eVar);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void d(db dbVar) {
        LatLng latLng = new LatLng(dbVar.a, dbVar.b);
        j8.e eVar = this.a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.a;
            Parcel P0 = iVar.P0();
            s7.b.b(P0, latLng);
            iVar.T0(P0, 3);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void e(int i10) {
        float f7 = i10;
        j8.e eVar = this.a;
        eVar.getClass();
        try {
            s7.i iVar = (s7.i) eVar.a;
            Parcel P0 = iVar.P0();
            P0.writeFloat(f7);
            iVar.T0(P0, 22);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    public final void f(Object obj) {
        j8.e eVar = this.a;
        eVar.getClass();
        try {
            s7.a aVar = eVar.a;
            x6.b bVar = new x6.b(obj);
            s7.i iVar = (s7.i) aVar;
            Parcel P0 = iVar.P0();
            s7.b.c(P0, bVar);
            iVar.T0(P0, 29);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }
}
