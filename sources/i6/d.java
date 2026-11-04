package i6;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(13);
    public double a;
    public boolean b;
    public int c;
    public e6.d d;
    public int e;
    public e6.x f;
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
            e6.x xVar = this.f;
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
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        double d = this.a;
        j8.a.r(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.b;
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.c;
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(i10);
        j8.a.l(parcel, 5, this.d, i3);
        int i11 = this.e;
        j8.a.r(parcel, 6, 4);
        parcel.writeInt(i11);
        j8.a.l(parcel, 7, this.f, i3);
        double d10 = this.h;
        j8.a.r(parcel, 8, 8);
        parcel.writeDouble(d10);
        j8.a.t(parcel, s6);
    }
}
