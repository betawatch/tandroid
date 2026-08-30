package m8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class u extends c6.a {
    public static final Parcelable.Creator<u> CREATOR = new c(16);
    public final int a;
    public final boolean b;

    public u(int i10, boolean z4) {
        this.a = i10;
        this.b = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        f5.r(parcel, q10);
    }
}
