package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w extends p6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 a;
    public final o7.s0 b;
    public final List c;

    static {
        o7.o.q(2, o7.a.c, o7.a.d);
        CREATOR = new w.a(27);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        o7.s0 s0Var = o7.s0.c;
        o7.s0 s10 = o7.s0.s(bArr.length, bArr);
        o6.l.h(str);
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
        if (!this.a.equals(wVar.a) || !o6.l.l(this.b, wVar.b)) {
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
        String c10 = v6.b.c(this.b.t());
        return a1.g.s(a1.g.w("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        this.a.getClass();
        df.l(parcel, 2, "public-key");
        df.c(parcel, 3, this.b.t());
        df.p(parcel, 4, this.c);
        df.r(parcel, q5);
    }
}
