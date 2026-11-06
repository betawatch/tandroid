package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int a;
    public final long b;
    public final List c;

    public u0(int i7, long j3, ArrayList arrayList) {
        this.a = i7;
        this.b = j3;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        wb.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        wb.p(parcel, 4, this.c);
        wb.s(parcel, r10);
    }
}
