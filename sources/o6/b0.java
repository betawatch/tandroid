package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b0 extends a6.a {
    public static final Parcelable.Creator<b0> CREATOR = new n0(12);
    public final z6.s0 a;
    public final String b;
    public final String c;
    public final String d;

    public b0(String str, byte[] bArr, String str2, String str3) {
        z5.l.h(bArr);
        this.a = z6.s0.t(bArr.length, bArr);
        z5.l.h(str);
        this.b = str;
        this.c = str2;
        z5.l.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return z5.l.l(this.a, b0Var.a) && z5.l.l(this.b, b0Var.b) && z5.l.l(this.c, b0Var.c) && z5.l.l(this.d, b0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder s10 = a4.w.s("PublicKeyCredentialUserEntity{\n id=", g6.b.c(this.a.u()), ", \n name='");
        s10.append(this.b);
        s10.append("', \n icon='");
        s10.append(this.c);
        s10.append("', \n displayName='");
        return a4.w.q(s10, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.c(parcel, 2, this.a.u());
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
