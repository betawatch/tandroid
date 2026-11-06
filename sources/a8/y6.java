package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class y6 extends r6.a {
    public static final Parcelable.Creator<y6> CREATOR = new z5(1);
    public final int a;
    public final float b;
    public final int c;

    public y6(int i7, int i10, float f10, int i11) {
        if (i7 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i10;
        this.b = f10;
        this.c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(1);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        wb.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        wb.s(parcel, r10);
    }
}
