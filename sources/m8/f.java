package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.f0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long a;
    public final a[] b;
    public final int c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i10, boolean z10) {
        this.a = j10;
        this.b = aVarArr;
        this.d = z10;
        if (z10) {
            this.c = i10;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        f0.o(parcel, 3, this.b, i10);
        f0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f0.r(parcel, q6);
    }
}
