package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class z0 extends o6.a {
    public static final Parcelable.Creator<z0> CREATOR = new w.a(17);
    public final boolean a;

    public z0(boolean z10) {
        this.a = Boolean.valueOf(z10).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z0) && this.a == ((z0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        w7.e0.r(parcel, q6);
    }
}
