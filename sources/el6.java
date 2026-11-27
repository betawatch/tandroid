// default package

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class el6 extends c4 {
    public static final Parcelable.Creator<el6> CREATOR = new ime((byte) 0);
    public float E;
    public LatLng a;
    public String b;
    public String c;
    public zm9 d;
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
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        zm9 zm9Var = this.d;
        bye.f(parcel, 5, zm9Var == null ? null : ((al5) zm9Var.b).asBinder());
        float f = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeFloat(f);
        float f2 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeFloat(f2);
        boolean z = this.h;
        bye.q(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.n;
        bye.q(parcel, 9, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.r;
        bye.q(parcel, 10, 4);
        parcel.writeInt(z3 ? 1 : 0);
        float f3 = this.s;
        bye.q(parcel, 11, 4);
        parcel.writeFloat(f3);
        float f4 = this.w;
        bye.q(parcel, 12, 4);
        parcel.writeFloat(f4);
        float f5 = this.x;
        bye.q(parcel, 13, 4);
        parcel.writeFloat(f5);
        float f6 = this.y;
        bye.q(parcel, 14, 4);
        parcel.writeFloat(f6);
        float f7 = this.E;
        bye.q(parcel, 15, 4);
        parcel.writeFloat(f7);
        bye.s(parcel, r);
    }
}
