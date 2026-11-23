package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.maps.model.LatLng;
import hi.u0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float E;
    public LatLng a;
    public String b;
    public String c;
    public u0 d;
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
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.a, i7);
        cc.l(parcel, 3, this.b);
        cc.l(parcel, 4, this.c);
        u0 u0Var = this.d;
        cc.f(parcel, 5, u0Var == null ? null : ((a7.a) u0Var.b).asBinder());
        float f10 = this.e;
        cc.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        cc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        cc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        cc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        cc.q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.s;
        cc.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        cc.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        cc.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        cc.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        cc.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        cc.s(parcel, r10);
    }
}
