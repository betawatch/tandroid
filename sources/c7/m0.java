package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class m0 extends o6.a {
    public static final Parcelable.Creator<m0> CREATOR = new w.a(18);
    public final long a;

    public m0(long j3) {
        this.a = Long.valueOf(j3).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m0) && this.a == ((m0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        w7.f0.r(parcel, q6);
    }
}
