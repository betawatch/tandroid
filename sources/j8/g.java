package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import g8.j;
import ii.n4;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class g extends o6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng a;
    public String b;
    public String c;
    public n4 d;
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
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.a, i10);
        g0.l(parcel, 3, this.b);
        g0.l(parcel, 4, this.c);
        n4 n4Var = this.d;
        g0.f(parcel, 5, n4Var == null ? null : ((x6.a) n4Var.b).asBinder());
        float f7 = this.e;
        g0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f;
        g0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        g0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        g0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        g0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.s;
        g0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        g0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        g0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        g0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        g0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        g0.r(parcel, q6);
    }
}
