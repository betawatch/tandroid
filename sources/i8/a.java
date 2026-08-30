package i8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.f5;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
