package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t0 extends r6.a {
    public static final Parcelable.Creator<t0> CREATOR = new n0(6);
    public final int a;
    public final int b;

    public t0(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        xb.s(parcel, r10);
    }
}
