package l8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import gi.v5;
import i7.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(21);
    public float E;
    public LatLng a;
    public String b;
    public String c;
    public v5 d;
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.a, i3);
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.c);
        v5 v5Var = this.d;
        j8.a.g(parcel, 5, v5Var == null ? null : ((z6.a) v5Var.b).asBinder());
        float f10 = this.e;
        j8.a.r(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        j8.a.r(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        j8.a.r(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        j8.a.r(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        j8.a.r(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.s;
        j8.a.r(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        j8.a.r(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        j8.a.r(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        j8.a.r(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        j8.a.r(parcel, 15, 4);
        parcel.writeFloat(f16);
        j8.a.t(parcel, s6);
    }
}
