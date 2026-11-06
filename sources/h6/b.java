package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import f7.t0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends r6.a {
    public static final Parcelable.Creator<b> CREATOR = new t0(19);
    public final int a;
    public final int b;
    public final int c;

    public b(int i7, int i10, int i11) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        xb.s(parcel, r10);
    }
}
