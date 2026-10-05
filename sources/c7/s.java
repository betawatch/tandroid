package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class s extends o6.a {
    public static final Parcelable.Creator<s> CREATOR = new r0(24);
    public final String a;

    public s(String str) {
        n6.l.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.a.equals(((s) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return a4.a.t(new StringBuilder("FidoAppIdExtension{appid='"), this.a, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.l(parcel, 2, this.a);
        w7.g0.r(parcel, q6);
    }
}
