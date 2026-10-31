package j8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import k6.h;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new g8.g(14);
    public float D;
    public LatLng a;
    public String b;
    public String c;
    public h d;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.k(parcel, 2, this.a, i10);
        h0.l(parcel, 3, this.b);
        h0.l(parcel, 4, this.c);
        h hVar = this.d;
        h0.f(parcel, 5, hVar == null ? null : ((x6.a) hVar.b).asBinder());
        float f7 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f;
        h0.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        h0.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        h0.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        h0.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.s;
        h0.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.w;
        h0.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.x;
        h0.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.y;
        h0.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.D;
        h0.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        h0.r(parcel, q6);
    }
}
