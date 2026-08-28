package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 extends y5.a {
    public static final Parcelable.Creator<w0> CREATOR = new p0(7);
    public final int a;
    public final long b;
    public final List c;

    public w0(int i9, long j10, ArrayList arrayList) {
        this.a = i9;
        this.b = j10;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        p8.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        p8.p(parcel, 4, this.c);
        p8.r(parcel, q10);
    }
}
