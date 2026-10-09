package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.d0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        int q6 = d0.q(parcel, 20293);
        d0.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        d0.o(parcel, 3, this.b, i10);
        d0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        d0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        d0.r(parcel, q6);
    }
}
