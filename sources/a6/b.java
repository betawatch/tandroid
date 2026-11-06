package a6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new w.a(4);
    public final boolean a;
    public final String b;

    public b(String str, boolean z9) {
        if (z9) {
            m.g(str);
        }
        this.a = z9;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && m.k(this.b, bVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        xb.l(parcel, 2, this.b);
        xb.s(parcel, r10);
    }
}
