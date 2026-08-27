package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p0 extends z5.a {
    public static final Parcelable.Creator<p0> CREATOR = new o0(2);
    public final String a;

    public p0(String str) {
        y5.l.h(str);
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
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 1, this.a);
        r8.r(parcel, q6);
    }
}
