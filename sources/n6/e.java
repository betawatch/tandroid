package n6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class e extends o6.a {
    public static final Parcelable.Creator<e> CREATOR = new m8.h(20);
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
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 1, this.a, i10);
        w7.e0.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        w7.e0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        w7.e0.g(parcel, 4, this.d);
        w7.e0.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        w7.e0.g(parcel, 6, this.f);
        w7.e0.r(parcel, q6);
    }
}
