package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class s0 extends r6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int a;
    public final int b;
    public final byte[] c;

    public s0(int i7, int i10, byte[] bArr) {
        this.a = i7;
        this.b = i10;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        wb.c(parcel, 3, this.c);
        wb.s(parcel, r10);
    }
}
