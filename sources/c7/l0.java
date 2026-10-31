package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l0 extends o6.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int a;
    public final short b;
    public final short c;

    public l0(int i10, short s10, short s11) {
        this.a = i10;
        this.b = s10;
        this.c = s11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.a == l0Var.a && this.b == l0Var.b && this.c == l0Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Short.valueOf(this.b), Short.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        w7.h0.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        w7.h0.r(parcel, q6);
    }
}
