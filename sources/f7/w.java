package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        q6.m.h(str);
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
        if (!this.a.equals(wVar.a) || !q6.m.l(this.b, wVar.b)) {
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
        return a8.p0.s(e2.n("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c10, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        this.a.getClass();
        bc.l(parcel, 2, "public-key");
        bc.c(parcel, 3, this.b.p());
        bc.p(parcel, 4, this.c);
        bc.s(parcel, r10);
    }
}
