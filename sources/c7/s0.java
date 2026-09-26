package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class s0 extends o6.a {
    public static final Parcelable.Creator<s0> CREATOR = new r0(2);
    public final String a;

    public s0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s0) {
            return n6.l.l(this.a, ((s0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.l(parcel, 1, this.a);
        w7.f0.r(parcel, q6);
    }
}
