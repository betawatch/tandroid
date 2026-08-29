package a8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;
import z5.v;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends a6.a {
    public static final Parcelable.Creator<h> CREATOR = new w.a(4);
    public final int a;
    public final w5.a b;
    public final v c;

    public h(int i10, w5.a aVar, v vVar) {
        this.a = i10;
        this.b = aVar;
        this.c = vVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        o.k(parcel, 2, this.b, i10);
        o.k(parcel, 3, this.c, i10);
        o.r(parcel, q6);
    }
}
