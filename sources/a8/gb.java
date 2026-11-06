package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class gb extends r6.a {
    public static final Parcelable.Creator<gb> CREATOR = new z5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public gb(float f10, int i7, String str, String str2) {
        this.a = str;
        this.b = f10;
        this.c = str2;
        this.d = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.a);
        wb.q(parcel, 2, 4);
        parcel.writeFloat(this.b);
        wb.l(parcel, 3, this.c);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        wb.s(parcel, r10);
    }
}
