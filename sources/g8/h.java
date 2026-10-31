package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new g(1);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public h(long j10, long j11, int i10, int i11) {
        this.a = i10;
        this.b = i11;
        this.c = j10;
        this.d = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder m10 = i0.a.m("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.c);
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        h0.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        h0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        h0.r(parcel, q6);
    }
}
