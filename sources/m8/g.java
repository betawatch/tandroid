package m8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new m6.e(7);
    public float D;
    public LatLng a;
    public String b;
    public String c;
    public k8.a d;
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
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        xb.l(parcel, 3, this.b);
        xb.l(parcel, 4, this.c);
        k8.a aVar = this.d;
        xb.f(parcel, 5, aVar == null ? null : aVar.a.asBinder());
        float f10 = this.e;
        xb.q(parcel, 6, 4);
        parcel.writeFloat(f10);
        float f11 = this.f;
        xb.q(parcel, 7, 4);
        parcel.writeFloat(f11);
        boolean z9 = this.h;
        xb.q(parcel, 8, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.n;
        xb.q(parcel, 9, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.r;
        xb.q(parcel, 10, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f12 = this.s;
        xb.q(parcel, 11, 4);
        parcel.writeFloat(f12);
        float f13 = this.w;
        xb.q(parcel, 12, 4);
        parcel.writeFloat(f13);
        float f14 = this.x;
        xb.q(parcel, 13, 4);
        parcel.writeFloat(f14);
        float f15 = this.y;
        xb.q(parcel, 14, 4);
        parcel.writeFloat(f15);
        float f16 = this.D;
        xb.q(parcel, 15, 4);
        parcel.writeFloat(f16);
        xb.s(parcel, r10);
    }
}
