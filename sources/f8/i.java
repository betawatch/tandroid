package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends c6.a {
    public static final Parcelable.Creator<i> CREATOR = new o(0);
    public int a;
    public String b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        int i11 = this.a;
        f5.s(parcel, 2, 4);
        parcel.writeInt(i11);
        f5.l(parcel, 3, this.b);
        f5.r(parcel, q10);
    }
}
