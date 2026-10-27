package n8;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import n4.x;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends p6.a {
    public static final Parcelable.Creator<f> CREATOR = new x(6);
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
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        df.o(parcel, 3, this.b, i10);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        df.r(parcel, q5);
    }
}
