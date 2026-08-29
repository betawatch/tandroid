package k8;

import android.os.Parcel;
import android.os.Parcelable;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n0 extends a6.a implements j8.h {
    public static final Parcelable.Creator<n0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public n0(int i10, String str, String str2, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            return ((n0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder k9 = th.k("Node{", this.b, ", id=", this.a, ", hops=");
        k9.append(this.c);
        k9.append(", isNearby=");
        k9.append(this.d);
        k9.append("}");
        return k9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
