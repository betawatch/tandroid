package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class k0 extends r6.a {
    public static final Parcelable.Creator<k0> CREATOR = new c(27);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public k0(int i7, String str, String str2, byte[] bArr) {
        this.a = i7;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        byte[] bArr = this.c;
        String obj = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        StringBuilder sb2 = new StringBuilder("MessageEventParcelable[");
        sb2.append(this.a);
        sb2.append(",");
        sb2.append(this.b);
        sb2.append(", size=");
        return a8.p0.s(sb2, obj, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        wb.l(parcel, 3, this.b);
        wb.c(parcel, 4, this.c);
        wb.l(parcel, 5, this.d);
        wb.s(parcel, r10);
    }
}
