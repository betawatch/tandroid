package i8;

import android.os.Parcel;
import android.os.Parcelable;
import i7.p;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends q6.a {
    public static final Parcelable.Creator<g> CREATOR = new p(5);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public g(long j10, long j11, int i3, int i10) {
        this.a = i3;
        this.b = i10;
        this.c = j10;
        this.d = j11;
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
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        m10.append(this.d);
        m10.append(" system time ms: ");
        m10.append(this.c);
        return m10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.c);
        j8.a.r(parcel, 4, 8);
        parcel.writeLong(this.d);
        j8.a.t(parcel, s6);
    }
}
