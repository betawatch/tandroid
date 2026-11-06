package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class hb extends r6.a {
    public static final Parcelable.Creator<hb> CREATOR = new z5(3);
    public final float a;
    public final int b;

    public hb(float f10, int i7) {
        this.a = f10;
        this.b = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeFloat(this.a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        wb.s(parcel, r10);
    }
}
