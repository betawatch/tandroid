package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.g0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class f extends o6.a {
    public static final Parcelable.Creator<f> CREATOR = new j(29);
    public final long a;
    public final a[] b;
    public final int c;
    public final boolean d;

    public f(long j3, a[] aVarArr, int i10, boolean z10) {
        this.a = j3;
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
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        g0.o(parcel, 3, this.b, i10);
        g0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        g0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        g0.r(parcel, q6);
    }
}
