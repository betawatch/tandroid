// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f84 extends b4 {
    public static final Parcelable.Creator<f84> CREATOR = new j9d(18);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public f84(String str, int i, long j, boolean z) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = z;
    }

    public final long b() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f84) {
            f84 f84Var = (f84) obj;
            if (cqe.a(this.a, f84Var.a) && b() == f84Var.b() && this.d == f84Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        wk4 wk4Var = new wk4(this);
        wk4Var.a(this.a, "name");
        wk4Var.a(Long.valueOf(b()), "version");
        wk4Var.a(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return wk4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 1, this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b = b();
        jte.q(parcel, 3, 8);
        parcel.writeLong(b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.s(parcel, r);
    }

    public f84(String str, long j) {
        this(str, -1, j, false);
    }
}
