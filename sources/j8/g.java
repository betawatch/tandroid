package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng a;
    public String b;
    public String c;
    public xa.d d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public float s;
    public float v;
    public float w;
    public float x;
    public float y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.k(parcel, 2, this.a, i10);
        d0.l(parcel, 3, this.b);
        d0.l(parcel, 4, this.c);
        xa.d dVar = this.d;
        d0.f(parcel, 5, dVar == null ? null : ((x6.a) dVar.b).asBinder());
        float f7 = this.e;
        d0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f;
        d0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        d0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        d0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        d0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.s;
        d0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        d0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        d0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        d0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        d0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        d0.r(parcel, q6);
    }
}
