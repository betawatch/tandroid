package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w extends z5.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 a;
    public final y6.s0 b;
    public final List c;

    static {
        y6.o.r(2, y6.a.c, y6.a.d);
        CREATOR = new o0(7);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        y6.s0 s0Var = y6.s0.c;
        y6.s0 t10 = y6.s0.t(bArr.length, bArr);
        y5.l.h(str);
        try {
            this.a = a0.a(str);
            this.b = t10;
            this.c = arrayList;
        } catch (z e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        List list = wVar.c;
        if (!this.a.equals(wVar.a) || !y5.l.l(this.b, wVar.b)) {
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
        String c10 = f6.b.c(this.b.u());
        return a9.p.p(i0.a.p("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        this.a.getClass();
        r8.l(parcel, 2, "public-key");
        r8.c(parcel, 3, this.b.u());
        r8.p(parcel, 4, this.c);
        r8.r(parcel, q6);
    }
}
