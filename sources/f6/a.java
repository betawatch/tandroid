package f6;

import android.os.Parcel;
import android.os.Parcelable;
import b9.e;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new e(17);
    public final boolean a;
    public final int b;

    public a(int i10, boolean z4) {
        this.a = z4;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f5.r(parcel, q10);
    }
}
