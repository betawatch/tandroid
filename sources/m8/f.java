package m8;

import android.os.Parcel;
import android.os.Parcelable;
import g8.j;
import w7.e0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        int q6 = e0.q(parcel, 20293);
        e0.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        e0.o(parcel, 3, this.b, i10);
        e0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        e0.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        e0.r(parcel, q6);
    }
}
