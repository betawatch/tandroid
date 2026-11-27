// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hre extends c4 {
    public static final Parcelable.Creator<hre> CREATOR = new ime((byte) 14);
    public final int a;
    public final float b;
    public final int c;

    public hre(int i, int i2, float f, int i3) {
        if (i != 1) {
            lq5.j("Unknown language.");
            throw null;
        }
        this.a = i2;
        this.b = f;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 2, 4);
        parcel.writeInt(1);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        bye.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        bye.s(parcel, r);
    }
}
