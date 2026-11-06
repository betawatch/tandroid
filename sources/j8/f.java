package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new j7.b(19);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public f(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = z9;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.e = z13;
        this.f = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        wb.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        wb.s(parcel, r10);
    }
}
