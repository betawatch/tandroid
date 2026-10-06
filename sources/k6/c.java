package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.y;
import w7.g0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.j(18);
    public final String a;
    public final int b;
    public final long c;

    public c(int i10, String str, long j3) {
        this.a = str;
        this.b = i10;
        this.c = j3;
    }

    public final long b() {
        long j3 = this.c;
        return j3 == -1 ? this.b : j3;
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
        y yVar = new y(this);
        yVar.m(this.a, "name");
        yVar.m(Long.valueOf(b()), "version");
        return yVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.l(parcel, 1, this.a);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        g0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        g0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.a = str;
        this.c = j3;
        this.b = -1;
    }
}
