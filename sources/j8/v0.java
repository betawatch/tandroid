package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v0 extends z5.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);
    public final int a;
    public final long b;
    public final List c;

    public v0(int i10, long j10, ArrayList arrayList) {
        this.a = i10;
        this.b = j10;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        r8.p(parcel, 4, this.c);
        r8.r(parcel, q6);
    }
}
