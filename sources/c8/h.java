package c8;

import android.os.Parcel;
import android.os.Parcelable;
import b6.w;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h extends c6.a {
    public static final Parcelable.Creator<h> CREATOR = new b9.e(5);
    public final int a;
    public final y5.a b;
    public final w c;

    public h(int i10, y5.a aVar, w wVar) {
        this.a = i10;
        this.b = aVar;
        this.c = wVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.k(parcel, 2, this.b, i10);
        f5.k(parcel, 3, this.c, i10);
        f5.r(parcel, q10);
    }
}
