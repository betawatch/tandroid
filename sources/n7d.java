// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class n7d extends c4 {
    public static final Parcelable.Creator<n7d> CREATOR = new s5d((byte) 11);
    public final int a;
    public final a8d b;

    public n7d(int i, a8d a8dVar) {
        this.a = i;
        this.b = a8dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        bye.k(parcel, 2, this.b, i);
        bye.s(parcel, r);
    }
}
