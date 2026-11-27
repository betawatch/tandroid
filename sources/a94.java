// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class a94 extends c4 {
    public static final Parcelable.Creator<a94> CREATOR = new ced(18);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public a94(String str, int i, long j, boolean z) {
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
        if (obj instanceof a94) {
            a94 a94Var = (a94) obj;
            if (vue.a(this.a, a94Var.a) && b() == a94Var.b() && this.d == a94Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        um4 um4Var = new um4(this);
        um4Var.a(this.a, "name");
        um4Var.a(Long.valueOf(b()), "version");
        um4Var.a(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return um4Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.l(parcel, 1, this.a);
        bye.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b = b();
        bye.q(parcel, 3, 8);
        parcel.writeLong(b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bye.s(parcel, r);
    }

    public a94(String str, long j) {
        this(str, -1, j, false);
    }
}
