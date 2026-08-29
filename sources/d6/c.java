package d6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends a6.a {
    public static final Parcelable.Creator<c> CREATOR = new d(0);
    public final int a;
    public final boolean b;

    public c(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        o.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        o.r(parcel, q6);
    }
}
