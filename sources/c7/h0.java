package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h0 extends o6.a {
    public static final Parcelable.Creator<h0> CREATOR = new r0(4);
    public final f0 a;
    public final String b;

    static {
        new h0("supported", null);
        new h0("not-supported", null);
    }

    public h0(String str, String str2) {
        n6.l.h(str);
        try {
            this.a = f0.a(str);
            this.b = str2;
        } catch (g0 e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return n7.a.h(this.a, h0Var.a) && n7.a.h(this.b, h0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.l(parcel, 2, this.a.a);
        w7.e0.l(parcel, 3, this.b);
        w7.e0.r(parcel, q6);
    }
}
