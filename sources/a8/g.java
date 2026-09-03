package a8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new w.a(4);
    public final long a;
    public final a[] b;
    public final int c;
    public final boolean d;

    public g(long j10, a[] aVarArr, int i10, boolean z4) {
        this.a = j10;
        this.b = aVarArr;
        this.d = z4;
        if (z4) {
            this.c = i10;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        f5.o(parcel, 3, this.b, i10);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        f5.r(parcel, q10);
    }
}
