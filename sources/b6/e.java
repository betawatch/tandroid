package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new w.a(27);
    public final o a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public e(o oVar, boolean z4, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.a = oVar;
        this.b = z4;
        this.c = z10;
        this.d = iArr;
        this.e = i10;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 1, this.a, i10);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        f5.g(parcel, 4, this.d);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        f5.g(parcel, 6, this.f);
        f5.r(parcel, q10);
    }
}
