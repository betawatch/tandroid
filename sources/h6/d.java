package h6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import f7.t0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(20);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i7, String str2) {
        this.a = str;
        this.b = i7;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 2, this.a);
        wb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        wb.l(parcel, 4, this.c);
        wb.s(parcel, r10);
    }
}
