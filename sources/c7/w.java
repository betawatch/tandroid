package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class w extends o6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 a;
    public final n7.t0 b;
    public final List c;

    static {
        n7.p.q(2, n7.a.c, n7.a.d);
        CREATOR = new w.a(26);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        n7.t0 t0Var = n7.t0.c;
        n7.t0 s10 = n7.t0.s(bArr.length, bArr);
        n6.l.h(str);
        try {
            this.a = a0.a(str);
            this.b = s10;
            this.c = arrayList;
        } catch (z e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        List list = wVar.c;
        if (!this.a.equals(wVar.a) || !n6.l.l(this.b, wVar.b)) {
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
        String c10 = u6.b.c(this.b.t());
        return a1.g.s(a1.g.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        this.a.getClass();
        w7.f0.l(parcel, 2, "public-key");
        w7.f0.c(parcel, 3, this.b.t());
        w7.f0.p(parcel, 4, this.c);
        w7.f0.r(parcel, q6);
    }
}
