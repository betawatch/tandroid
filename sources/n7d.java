// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
