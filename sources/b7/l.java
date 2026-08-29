package b7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l extends a6.a {
    public static final Parcelable.Creator<l> CREATOR = new w.a(22);
    public final boolean a;

    public l(boolean z10) {
        this.a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.a == ((l) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        o.r(parcel, q6);
    }
}
