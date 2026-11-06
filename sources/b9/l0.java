package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class l0 extends r6.a {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public l0(int i7, String str, String str2, boolean z9) {
        this.a = str;
        this.b = str2;
        this.c = i7;
        this.d = z9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return ((l0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Node{", this.b, ", id=", this.a, ", hops=");
        n10.append(this.c);
        n10.append(", isNearby=");
        n10.append(this.d);
        n10.append("}");
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.l(parcel, 3, this.b);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.s(parcel, r10);
    }
}
