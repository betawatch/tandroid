// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class m2c extends c4 {
    public static final Parcelable.Creator<m2c> CREATOR = new m9d((byte) 25);
    public int a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        int i2 = this.a;
        bye.q(parcel, 1, 4);
        parcel.writeInt(i2);
        bye.l(parcel, 2, this.b);
        bye.l(parcel, 3, this.c);
        bye.s(parcel, r);
    }
}
