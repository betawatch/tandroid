package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class r0 extends r6.a {
    public static final Parcelable.Creator<r0> CREATOR = new db.k(21);
    public final String a;

    public r0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r0) {
            return q6.m.k(this.a, ((r0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.l(parcel, 1, this.a);
        yb.s(parcel, r10);
    }
}
