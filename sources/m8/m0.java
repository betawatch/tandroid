package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class m0 extends c6.a implements l8.h {
    public static final Parcelable.Creator<m0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public m0(int i10, String str, String str2, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            return ((m0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder m9 = yh.m("Node{", this.b, ", id=", this.a, ", hops=");
        m9.append(this.c);
        m9.append(", isNearby=");
        m9.append(this.d);
        m9.append("}");
        return m9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.l(parcel, 2, this.a);
        f5.l(parcel, 3, this.b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.r(parcel, q10);
    }
}
