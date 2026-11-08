package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int a;
    public final long b;
    public final List c;

    public u0(int i7, long j3, ArrayList arrayList) {
        this.a = i7;
        this.b = j3;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        xb.p(parcel, 4, this.c);
        xb.s(parcel, r10);
    }
}
