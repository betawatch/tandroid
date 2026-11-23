package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.maps.model.LatLng;
import hi.t5;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float E;
    public LatLng a;
    public String b;
    public String c;
    public t5 d;
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
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.a, i7);
        bc.l(parcel, 3, this.b);
        bc.l(parcel, 4, this.c);
        t5 t5Var = this.d;
        bc.f(parcel, 5, t5Var == null ? null : ((a7.a) t5Var.b).asBinder());
        float f10 = this.e;
        bc.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        bc.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z10 = this.h;
        bc.q(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        bc.q(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        bc.q(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f12 = this.s;
        bc.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        bc.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        bc.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        bc.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.E;
        bc.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        bc.s(parcel, r10);
    }
}
