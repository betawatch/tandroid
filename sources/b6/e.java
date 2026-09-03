package b6;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.a, i10);
        g5.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        g5.g(parcel, 4, this.d);
        g5.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        g5.g(parcel, 6, this.f);
        g5.r(parcel, q10);
    }
}
