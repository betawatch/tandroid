package g6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x extends o6.a {
    public static final Parcelable.Creator<x> CREATOR = new e6.p(8);
    public final int a;
    public final boolean b;
    public final boolean c;

    public x(int i10, boolean z10, boolean z11) {
        this.a = i10;
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        h0.s(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        h0.r(parcel, q6);
    }
}
