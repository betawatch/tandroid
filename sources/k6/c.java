package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.g(17);
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
        m4.c cVar = new m4.c(this);
        cVar.u(this.a, "name");
        cVar.u(Long.valueOf(b()), "version");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        h0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        h0.r(parcel, q6);
    }

    public c(String str, long j10) {
        this.a = str;
        this.c = j10;
        this.b = -1;
    }
}
