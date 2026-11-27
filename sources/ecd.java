// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ecd extends c4 {
    public static final Parcelable.Creator<ecd> CREATOR = new m9d(20);
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ecd(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 2, this.a);
        bye.l(parcel, 3, this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }
}
