// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dg6 extends b4 {
    public static final Parcelable.Creator<dg6> CREATOR = new rhe((byte) 3);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        int i2 = this.a;
        jte.q(parcel, 2, 4);
        parcel.writeInt(i2);
        jte.l(parcel, 3, this.b);
        double d = this.c;
        jte.q(parcel, 4, 8);
        parcel.writeDouble(d);
        jte.l(parcel, 5, this.d);
        long j = this.e;
        jte.q(parcel, 6, 8);
        parcel.writeLong(j);
        int i3 = this.f;
        jte.q(parcel, 7, 4);
        parcel.writeInt(i3);
        jte.s(parcel, r);
    }
}
