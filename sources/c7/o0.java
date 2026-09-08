package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class o0 extends o6.a {
    public static final Parcelable.Creator<o0> CREATOR = new w.a(21);
    public final String a;

    public o0(String str) {
        n6.l.h(str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            return this.a.equals(((o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 1, this.a);
        w7.e0.r(parcel, q6);
    }
}
