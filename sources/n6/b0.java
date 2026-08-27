package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b0 extends z5.a {
    public static final Parcelable.Creator<b0> CREATOR = new o0(11);
    public final y6.s0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        y5.l.h(bArr);
        this.a = y6.s0.t(bArr.length, bArr);
        y5.l.h(str);
        this.b = str;
        this.c = str2;
        y5.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return y5.l.l(this.a, b0Var.a) && y5.l.l(this.b, b0Var.b) && y5.l.l(this.c, b0Var.c) && y5.l.l(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder r10 = a9.p.r("PublicKeyCredentialUserEntity{\n id=", f6.b.c(this.a.u()), ", \n name='");
        r10.append(this.b);
        r10.append("', \n icon='");
        r10.append(this.c);
        r10.append("', \n displayName='");
        return a9.p.p(r10, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.c(parcel, 2, this.a.u());
        r8.l(parcel, 3, this.b);
        r8.l(parcel, 4, this.c);
        r8.l(parcel, 5, this.d);
        r8.r(parcel, q6);
    }
}
