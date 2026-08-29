package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w extends a6.a {
    public static final Parcelable.Creator<w> CREATOR;
    public final a0 a;
    public final z6.s0 b;
    public final List c;

    static {
        z6.o.r(2, z6.a.c, z6.a.d);
        CREATOR = new n0(8);
    }

    public w(String str, byte[] bArr, ArrayList arrayList) {
        z6.s0 s0Var = z6.s0.c;
        z6.s0 t10 = z6.s0.t(bArr.length, bArr);
        z5.l.h(str);
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
        if (!this.a.equals(wVar.a) || !z5.l.l(this.b, wVar.b)) {
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
        String c3 = g6.b.c(this.b.u());
        return a4.w.q(th.k("PublicKeyCredentialDescriptor{\n type=", valueOf, ", \n id=", c3, ", \n transports="), String.valueOf(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        this.a.getClass();
        com.google.android.gms.internal.cast.o.l(parcel, 2, "public-key");
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.b.u());
        com.google.android.gms.internal.cast.o.p(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
