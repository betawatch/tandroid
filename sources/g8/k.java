package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class k extends o6.a {
    public static final Parcelable.Creator<k> CREATOR = new j(2);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public k(long j3, int i10, int i11, long j10) {
        this.a = i10;
        this.b = i11;
        this.c = j3;
        this.d = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.a == kVar.a && this.b == kVar.b && this.c == kVar.c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder k10 = hg.c.k("NetworkLocationStatus: Wifi status: ", this.a, " Cell status: ", this.b, " elapsed time NS: ");
        k10.append(this.d);
        k10.append(" system time ms: ");
        k10.append(this.c);
        return k10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        f0.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        f0.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        f0.r(parcel, q6);
    }
}
