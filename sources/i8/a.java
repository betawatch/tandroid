package i8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends c6.a {
    public static final Parcelable.Creator<a> CREATOR = new o(8);
    public final PointF[] a;
    public final int b;

    public a(PointF[] pointFArr, int i10) {
        this.a = pointFArr;
        this.b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.o(parcel, 2, this.a, i10);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        f5.r(parcel, q10);
    }
}
