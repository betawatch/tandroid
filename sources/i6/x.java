package i6;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x extends q6.a {
    public static final Parcelable.Creator<x> CREATOR = new c0(12);
    public final int a;
    public final boolean b;
    public final boolean c;

    public x(int i3, boolean z10, boolean z11) {
        this.a = i3;
        this.b = z10;
        this.c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && this.b == xVar.b && this.c == xVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
