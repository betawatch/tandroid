package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s extends c6.a {
    public static final Parcelable.Creator<s> CREATOR = new c(14);
    public final int a;
    public final boolean b;

    public s(int i10, boolean z4) {
        this.a = i10;
        this.b = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        f5.r(parcel, q10);
    }
}
