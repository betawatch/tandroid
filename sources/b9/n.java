package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class n extends r6.a {
    public static final Parcelable.Creator<n> CREATOR = new c(11);
    public final int a;
    public final b b;

    public n(int i7, b bVar) {
        this.a = i7;
        this.b = bVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.k(parcel, 3, this.b, i7);
        xb.s(parcel, r10);
    }
}
