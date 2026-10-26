package k8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h8.j;
import jg.i;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends p6.a {
    public static final Parcelable.Creator<g> CREATOR = new j(15);
    public LatLng a;
    public String b;
    public String c;
    public i d;
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
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.a, i10);
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        i iVar = this.d;
        df.f(parcel, 5, iVar == null ? null : ((y6.a) iVar.a).asBinder());
        float f7 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeFloat(f7);
        float f10 = this.f;
        df.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        boolean z10 = this.h;
        df.s(parcel, 8, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        df.s(parcel, 9, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.r;
        df.s(parcel, 10, 4);
        parcel.writeInt(z12 ? 1 : 0);
        float f11 = this.s;
        df.s(parcel, 11, 4);
        parcel.writeFloat(f11);
        float f12 = this.v;
        df.s(parcel, 12, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        df.s(parcel, 13, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        df.s(parcel, 14, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        df.s(parcel, 15, 4);
        parcel.writeFloat(f15);
        df.r(parcel, q5);
    }
}
