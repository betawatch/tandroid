package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p0 extends a6.a {
    public static final Parcelable.Creator<p0> CREATOR = new n0(3);
    public final String a;

    public p0(String str) {
        z5.l.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.a.equals(((p0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.a);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
