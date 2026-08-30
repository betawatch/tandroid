package b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g0 extends c6.a {
    public static final Parcelable.Creator<g0> CREATOR = new w.a(26);
    public Bundle a;
    public y5.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.b(parcel, 1, this.a);
        f5.o(parcel, 2, this.b, i10);
        int i11 = this.c;
        f5.s(parcel, 3, 4);
        parcel.writeInt(i11);
        f5.k(parcel, 4, this.d, i10);
        f5.r(parcel, q10);
    }
}
