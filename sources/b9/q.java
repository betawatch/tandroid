package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR = new c(14);
    public final int a;
    public final boolean b;

    public q(int i7, boolean z9) {
        this.a = i7;
        this.b = z9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        xb.s(parcel, r10);
    }
}
