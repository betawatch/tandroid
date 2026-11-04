package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b0 extends q6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(4);
    public final p7.t0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        p6.m.g(bArr);
        this.a = p7.t0.o(bArr.length, bArr);
        p6.m.g(str);
        this.b = str;
        this.c = str2;
        p6.m.g(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return p6.m.k(this.a, b0Var.a) && p6.m.k(this.b, b0Var.b) && p6.m.k(this.c, b0Var.c) && p6.m.k(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder u10 = a1.g.u("PublicKeyCredentialUserEntity{\n id=", w6.b.c(this.a.p()), ", \n name='");
        u10.append(this.b);
        u10.append("', \n icon='");
        u10.append(this.c);
        u10.append("', \n displayName='");
        return a1.g.s(u10, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.d(parcel, 2, this.a.p());
        j8.a.m(parcel, 3, this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.m(parcel, 5, this.d);
        j8.a.t(parcel, s6);
    }
}
