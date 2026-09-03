package i8;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import f8.o;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int q10 = g5.q(parcel, 20293);
        g5.o(parcel, 2, this.a, i10);
        g5.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        g5.r(parcel, q10);
    }
}
