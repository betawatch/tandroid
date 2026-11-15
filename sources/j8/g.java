package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = new j7.b(20);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public g(long j3, long j10, int i7, int i10) {
        this.a = i7;
        this.b = i10;
        this.c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder n10 = i5.c.n("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        n10.append(this.d);
        n10.append(" system time ms: ");
        n10.append(this.c);
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        yb.q(parcel, 3, 8);
        parcel.writeLong(this.c);
        yb.q(parcel, 4, 8);
        parcel.writeLong(this.d);
        yb.s(parcel, r10);
    }
}
