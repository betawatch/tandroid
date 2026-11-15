package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new c(21);
    public final int a;
    public final k b;

    public x(int i7, k kVar) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        yb.k(parcel, 3, this.b, i7);
        yb.s(parcel, r10);
    }
}
