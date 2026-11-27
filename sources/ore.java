// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ore extends c4 {
    public static final Parcelable.Creator<ore> CREATOR = new ime((byte) 17);
    public Bundle a;
    public a94[] b;
    public int c;
    public ys2 d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.b(parcel, 1, this.a);
        bye.o(parcel, 2, this.b, i);
        int i2 = this.c;
        bye.q(parcel, 3, 4);
        parcel.writeInt(i2);
        bye.k(parcel, 4, this.d, i);
        bye.s(parcel, r);
    }
}
