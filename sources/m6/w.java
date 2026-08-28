package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends y5.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 a;
    public final x6.s0 b;
    public final List c;

    static {
        x6.o.r(2, x6.a.c, x6.a.d);
        CREATOR = new h5.h(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        x6.s0 s0Var = x6.s0.c;
        x6.s0 t10 = x6.s0.t(bArr.length, bArr);
        x5.l.h(str);
        try {
            this.a = a0.a(str);
            this.b = t10;
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
        if (!this.a.equals(wVar.a) || !x5.l.l(this.b, wVar.b)) {
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
        String c10 = e6.b.c(this.b.u());
        return aa.d.r(j3.r0.q("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        this.a.getClass();
        p8.l(parcel, 2, "public-key");
        p8.c(parcel, 3, this.b.u());
        p8.p(parcel, 4, this.c);
        p8.r(parcel, q10);
    }
}
