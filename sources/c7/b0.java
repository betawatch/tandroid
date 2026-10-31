package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.l.g(bArr);
        this.a = n7.s0.s(bArr.length, bArr);
        n6.l.g(str);
        this.b = str;
        this.c = str2;
        n6.l.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return n6.l.k(this.a, b0Var.a) && n6.l.k(this.b, b0Var.b) && n6.l.k(this.c, b0Var.c) && n6.l.k(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a1.g.u("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.a.t()), ", \n name='");
        u10.append(this.b);
        u10.append("', \n icon='");
        u10.append(this.c);
        u10.append("', \n displayName='");
        return a1.g.r(u10, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.c(parcel, 2, this.a.t());
        w7.h0.l(parcel, 3, this.b);
        w7.h0.l(parcel, 4, this.c);
        w7.h0.l(parcel, 5, this.d);
        w7.h0.r(parcel, q6);
    }
}
