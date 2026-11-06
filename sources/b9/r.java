package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class r extends r6.a {
    public static final Parcelable.Creator<r> CREATOR = new c(15);
    public final int a;
    public final boolean b;
    public final boolean c;

    public r(int i7, boolean z9, boolean z10) {
        this.a = i7;
        this.b = z9;
        this.c = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        xb.s(parcel, r10);
    }
}
