package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b0 extends p6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(1);
    public final o7.s0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        o6.l.h(bArr);
        this.a = o7.s0.s(bArr.length, bArr);
        o6.l.h(str);
        this.b = str;
        this.c = str2;
        o6.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return o6.l.l(this.a, b0Var.a) && o6.l.l(this.b, b0Var.b) && o6.l.l(this.c, b0Var.c) && o6.l.l(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder v = a1.g.v("PublicKeyCredentialUserEntity{\n id=", v6.b.c(this.a.t()), ", \n name='");
        v.append(this.b);
        v.append("', \n icon='");
        v.append(this.c);
        v.append("', \n displayName='");
        return a1.g.s(v, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.c(parcel, 2, this.a.t());
        df.l(parcel, 3, this.b);
        df.l(parcel, 4, this.c);
        df.l(parcel, 5, this.d);
        df.r(parcel, q5);
    }
}
