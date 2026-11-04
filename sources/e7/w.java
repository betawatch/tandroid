package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w extends q6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 a;
    public final p7.t0 b;
    public final List c;

    static {
        p7.p.m(2, p7.a.c, p7.a.d);
        CREATOR = new r0(0);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        p7.t0 t0Var = p7.t0.c;
        p7.t0 o10 = p7.t0.o(bArr.length, bArr);
        p6.m.g(str);
        try {
            this.a = a0.a(str);
            this.b = o10;
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
        if (!this.a.equals(wVar.a) || !p6.m.k(this.b, wVar.b)) {
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
        String c2 = w6.b.c(this.b.p());
        return a1.g.s(com.google.android.recaptcha.internal.a.n("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c2, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        this.a.getClass();
        j8.a.m(parcel, 2, "public-key");
        j8.a.d(parcel, 3, this.b.p());
        j8.a.q(parcel, 4, this.c);
        j8.a.t(parcel, s6);
    }
}
