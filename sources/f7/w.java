package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class w extends r6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 a;
    public final q7.s0 b;
    public final List c;

    static {
        q7.o.m(2, q7.a.c, q7.a.d);
        CREATOR = new db.k(15);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        q7.s0 s0Var = q7.s0.c;
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(str);
        try {
            this.a = a0.a(str);
            this.b = o4;
            this.c = arrayList;
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        List list = wVar.c;
        if (!this.a.equals(wVar.a) || !q6.m.k(this.b, wVar.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String c10 = x6.b.c(this.b.p());
        return a8.p0.s(com.google.android.recaptcha.internal.a.n("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        this.a.getClass();
        xb.l(parcel, 2, "public-key");
        xb.c(parcel, 3, this.b.p());
        xb.p(parcel, 4, this.c);
        xb.s(parcel, r10);
    }
}
