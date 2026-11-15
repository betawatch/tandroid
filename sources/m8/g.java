package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float E;
    public LatLng a;
    public String b;
    public String c;
    public ia.d d;
    public float e;
    public float f;
    public boolean h;
    public boolean n;
    public boolean r;
    public float s;
    public float w;
    public float x;
    public float y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.a, i7);
        yb.l(parcel, 3, this.b);
        yb.l(parcel, 4, this.c);
        ia.d dVar = this.d;
        yb.f(parcel, 5, dVar == null ? null : ((a7.a) dVar.b).asBinder());
        float f10 = this.e;
        yb.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        yb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        yb.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        yb.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        yb.q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.s;
        yb.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        yb.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        yb.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        yb.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        yb.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        yb.s(parcel, r10);
    }
}
