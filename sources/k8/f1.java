package k8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f1 extends a6.a {
    public static final Parcelable.Creator<f1> CREATOR = new p0(11);
    public final int a;
    public final List b;
    public final c1 c;

    public f1(int i10, ArrayList arrayList, c1 c1Var) {
        this.a = i10;
        this.b = arrayList;
        this.c = c1Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.p(parcel, 2, this.b);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.c, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
