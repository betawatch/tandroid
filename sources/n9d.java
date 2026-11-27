// default package

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class n9d extends c4 {
    public static final Parcelable.Creator<n9d> CREATOR = new zkd((byte) 4);
    public final PointF[] a;
    public final int b;

    public n9d(PointF[] pointFArr, int i) {
        this.a = pointFArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.o(parcel, 2, this.a, i);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bye.s(parcel, r);
    }
}
