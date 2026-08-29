package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x extends a6.a {
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
        return s5.a.d(this.a, xVar.a) && s5.a.d(this.b, xVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.a, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
