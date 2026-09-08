package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(0);
    public final n7.s0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        n6.l.h(bArr);
        this.a = n7.s0.t(bArr.length, bArr);
        n6.l.h(str);
        this.b = str;
        this.c = str2;
        n6.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return n6.l.l(this.a, b0Var.a) && n6.l.l(this.b, b0Var.b) && n6.l.l(this.c, b0Var.c) && n6.l.l(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder v = a4.a.v("PublicKeyCredentialUserEntity{\n id=", u6.b.c(this.a.u()), ", \n name='");
        v.append(this.b);
        v.append("', \n icon='");
        v.append(this.c);
        v.append("', \n displayName='");
        return a4.a.s(v, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.c(parcel, 2, this.a.u());
        w7.e0.l(parcel, 3, this.b);
        w7.e0.l(parcel, 4, this.c);
        w7.e0.l(parcel, 5, this.d);
        w7.e0.r(parcel, q6);
    }
}
