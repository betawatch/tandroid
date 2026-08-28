package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l0 extends y5.a {
    public static final Parcelable.Creator<l0> CREATOR = new r0(9);
    public final int a;
    public final short b;
    public final short c;

    public l0(int i9, short s10, short s11) {
        this.a = i9;
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        p8.r(parcel, q10);
    }
}
