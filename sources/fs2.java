// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fs2 extends b4 {
    public static final Parcelable.Creator<fs2> CREATOR = new rhe((byte) 24);
    public final mj9 a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public fs2(mj9 mj9Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = mj9Var;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 1, this.a, i);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.g(parcel, 4, this.d);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.e);
        jte.g(parcel, 6, this.f);
        jte.s(parcel, r);
    }
}
