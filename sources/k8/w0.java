package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w0 extends a6.a {
    public static final Parcelable.Creator<w0> CREATOR = new p0(7);
    public final int a;
    public final long b;
    public final List c;

    public w0(int i10, long j10, ArrayList arrayList) {
        this.a = i10;
        this.b = j10;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        com.google.android.gms.internal.cast.o.p(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
