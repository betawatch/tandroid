package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new t0(27);
    public final int a;
    public final boolean b;
    public final boolean c;

    public y(int i7, boolean z10, boolean z11) {
        this.a = i7;
        this.b = z10;
        this.c = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.a == yVar.a && this.b == yVar.b && this.c == yVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        yb.s(parcel, r10);
    }
}
