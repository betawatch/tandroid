package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n4.x;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        x xVar = new x(this);
        xVar.o(this.a, "name");
        xVar.o(Long.valueOf(b()), "version");
        return xVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = d0.q(parcel, 20293);
        d0.l(parcel, 1, this.a);
        d0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        d0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        d0.r(parcel, q6);
    }

    public c(String str, long j3) {
        this.a = str;
        this.c = j3;
        this.b = -1;
    }
}
