package h8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new g8.b(22);
    public ArrayList a;
    public String b;
    public String c;
    public ArrayList d;
    public boolean e;
    public String f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.h(parcel, 2, this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.b);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.c);
        com.google.android.gms.internal.cast.o.h(parcel, 6, this.d);
        boolean z10 = this.e;
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.cast.o.l(parcel, 8, this.f);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
