package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.a, i7);
        bc.k(parcel, 3, this.b, i7);
        bc.s(parcel, r10);
    }
}
