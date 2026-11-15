package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class t extends r6.a {
    public static final Parcelable.Creator<t> CREATOR = new db.k(9);
    public final boolean a;

    public t(boolean z10) {
        this.a = z10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && this.a == ((t) obj).a;
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
