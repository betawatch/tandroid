package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class x extends r6.a {
    public static final Parcelable.Creator<x> CREATOR = new v(3);
    public final w a;
    public final w b;

    public x(w wVar, w wVar2) {
        this.a = wVar;
        this.b = wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return j6.a.d(this.a, xVar.a) && j6.a.d(this.b, xVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.a, i7);
        xb.k(parcel, 3, this.b, i7);
        xb.s(parcel, r10);
    }
}
