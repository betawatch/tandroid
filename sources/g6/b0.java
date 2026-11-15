package g6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new t0(15);
    public final int a;

    public b0(int i7) {
        this.a = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        yb.s(parcel, r10);
    }
}
