// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hi6 extends c4 {
    public static final Parcelable.Creator<hi6> CREATOR = new ime((byte) 3);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 2, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 3, this.b);
        double d = this.c;
        bye.q(parcel, 4, 8);
        parcel.writeDouble(d);
        bye.l(parcel, 5, this.d);
        long j = this.e;
        bye.q(parcel, 6, 8);
        parcel.writeLong(j);
        int i3 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeInt(i3);
        bye.s(parcel, r);
    }
}
