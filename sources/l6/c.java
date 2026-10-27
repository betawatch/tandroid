package l6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import m4.w1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends p6.a {
    public static final Parcelable.Creator<c> CREATOR = new h8.j(18);
    public final String a;
    public final int b;
    public final long c;

    public c(int i10, String str, long j10) {
        this.a = str;
        this.b = i10;
        this.c = j10;
    }

    public final long b() {
        long j10 = this.c;
        return j10 == -1 ? this.b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.a;
            String str2 = this.a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b())});
    }

    public final String toString() {
        w1 w1Var = new w1(this);
        w1Var.x(this.a, "name");
        w1Var.x(Long.valueOf(b()), "version");
        return w1Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 1, this.a);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        df.s(parcel, 3, 8);
        parcel.writeLong(b10);
        df.r(parcel, q5);
    }

    public c(String str, long j10) {
        this.a = str;
        this.c = j10;
        this.b = -1;
    }
}
