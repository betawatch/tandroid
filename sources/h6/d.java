package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(20);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i7, String str2) {
        this.a = str;
        this.b = i7;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        xb.l(parcel, 4, this.c);
        xb.s(parcel, r10);
    }
}
