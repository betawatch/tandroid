package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n0 extends c6.a {
    public static final Parcelable.Creator<n0> CREATOR = new o0(0);
    public final int a;
    public final f b;

    public n0(int i10, f fVar) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        f5.k(parcel, 3, this.b, i10);
        f5.r(parcel, q10);
    }
}
