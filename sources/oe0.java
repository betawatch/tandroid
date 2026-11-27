// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class oe0 extends c4 {
    public static final Parcelable.Creator<oe0> CREATOR = new zkd(20);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.d;
        bye.q(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.h;
        bye.q(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.l(parcel, 9, this.n);
        bye.s(parcel, r);
    }
}
