package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 extends c6.a {
    public static final Parcelable.Creator<c0> CREATOR = new c(24);
    public final int a;
    public final m0 b;

    public c0(int i10, m0 m0Var) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        f5.k(parcel, 3, this.b, i10);
        f5.r(parcel, q10);
    }
}
