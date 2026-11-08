package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b0 extends r6.a {
    public static final Parcelable.Creator<b0> CREATOR = new db.k(19);
    public final q7.s0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        q6.m.g(bArr);
        this.a = q7.s0.o(bArr.length, bArr);
        q6.m.g(str);
        this.b = str;
        this.c = str2;
        q6.m.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return q6.m.k(this.a, b0Var.a) && q6.m.k(this.b, b0Var.b) && q6.m.k(this.c, b0Var.c) && q6.m.k(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a8.p0.u("PublicKeyCredentialUserEntity{\n id=", x6.b.c(this.a.p()), ", \n name='");
        u10.append(this.b);
        u10.append("', \n icon='");
        u10.append(this.c);
        u10.append("', \n displayName='");
        return a8.p0.s(u10, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.c(parcel, 2, this.a.p());
        xb.l(parcel, 3, this.b);
        xb.l(parcel, 4, this.c);
        xb.l(parcel, 5, this.d);
        xb.s(parcel, r10);
    }
}
