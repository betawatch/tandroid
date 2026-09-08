package m8;

import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i extends o6.a {
    public static final Parcelable.Creator<i> CREATOR = new h(1);
    public final int a;
    public final boolean b;

    public i(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        e0.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        e0.r(parcel, q6);
    }
}
