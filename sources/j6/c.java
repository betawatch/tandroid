package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;
import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new t0(29);
    public final String a;

    public c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return a.d(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.s(parcel, r10);
    }
}
