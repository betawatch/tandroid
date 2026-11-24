// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n5d extends b4 {
    public static final Parcelable.Creator<n5d> CREATOR = new t4d((byte) 11);
    public final long a;

    public n5d(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n5d) && this.a == ((n5d) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        jte.s(parcel, r);
    }
}
