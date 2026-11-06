package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import f7.t0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        wb.s(parcel, r10);
    }
}
