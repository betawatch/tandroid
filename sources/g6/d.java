package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new e6.p(9);
    public double a;
    public boolean b;
    public int c;
    public c6.d d;
    public int e;
    public c6.x f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            c6.x xVar = this.f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        double d = this.a;
        h0.s(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.b;
        h0.s(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.c;
        h0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        h0.k(parcel, 5, this.d, i10);
        int i12 = this.e;
        h0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        h0.k(parcel, 7, this.f, i10);
        double d10 = this.h;
        h0.s(parcel, 8, 8);
        parcel.writeDouble(d10);
        h0.r(parcel, q6);
    }
}
