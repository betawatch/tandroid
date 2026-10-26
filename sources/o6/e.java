package o6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e extends p6.a {
    public static final Parcelable.Creator<e> CREATOR = new n4.x(18);
    public final n a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public e(n nVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.a = nVar;
        this.b = z10;
        this.c = z11;
        this.d = iArr;
        this.e = i10;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.a, i10);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        df.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        df.g(parcel, 4, this.d);
        df.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        df.g(parcel, 6, this.f);
        df.r(parcel, q5);
    }
}
