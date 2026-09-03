package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        StringBuilder l10 = ai.l("Node{", this.b, ", id=", this.a, ", hops=");
        l10.append(this.c);
        l10.append(", isNearby=");
        l10.append(this.d);
        l10.append("}");
        return l10.toString();
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
