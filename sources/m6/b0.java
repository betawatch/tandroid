package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 extends y5.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final x6.s0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        x5.l.h(bArr);
        this.a = x6.s0.t(bArr.length, bArr);
        x5.l.h(str);
        this.b = str;
        this.c = str2;
        x5.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return x5.l.l(this.a, b0Var.a) && x5.l.l(this.b, b0Var.b) && x5.l.l(this.c, b0Var.c) && x5.l.l(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder t10 = aa.d.t("PublicKeyCredentialUserEntity{\n id=", e6.b.c(this.a.u()), ", \n name='");
        t10.append(this.b);
        t10.append("', \n icon='");
        t10.append(this.c);
        t10.append("', \n displayName='");
        return aa.d.r(t10, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.c(parcel, 2, this.a.u());
        p8.l(parcel, 3, this.b);
        p8.l(parcel, 4, this.c);
        p8.l(parcel, 5, this.d);
        p8.r(parcel, q10);
    }
}
