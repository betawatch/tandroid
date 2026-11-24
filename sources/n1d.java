// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class n1d extends b4 {
    public static final Parcelable.Creator<n1d> CREATOR = new b1d((byte) 4);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final boolean e;

    public n1d(int i, int i2, long j, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.l(parcel, 2, this.b);
        jte.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        jte.s(parcel, r);
    }
}
