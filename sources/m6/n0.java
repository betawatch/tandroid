package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 extends y5.a {
    public static final Parcelable.Creator<n0> CREATOR = new h5.h(19);
    public final boolean a;

    public n0(boolean z10) {
        this.a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof n0) && this.a == ((n0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        p8.r(parcel, q10);
    }
}
