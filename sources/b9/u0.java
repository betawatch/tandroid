package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(6);
    public final int a;
    public final int b;

    public u0(int i7, int i10) {
        this.a = i7;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        yb.s(parcel, r10);
    }
}
