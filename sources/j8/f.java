package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f extends r6.a {
    public static final Parcelable.Creator<f> CREATOR = new j7.b(19);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = z13;
        this.e = z14;
        this.f = z15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        yb.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        yb.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        yb.s(parcel, r10);
    }
}
