package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class i0 extends r6.a {
    public static final Parcelable.Creator<i0> CREATOR = new db.k(25);
    public final boolean a;

    public i0(boolean z10) {
        this.a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i0) && this.a == ((i0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        yb.s(parcel, r10);
    }
}
