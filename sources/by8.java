// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class by8 extends c4 {
    public static final Parcelable.Creator<by8> CREATOR = new ced(2);
    public final gfe a;
    public final String b;
    public final String c;
    public final String d;

    public by8(String str, byte[] bArr, String str2, String str3) {
        xve.h(bArr);
        this.a = gfe.o(bArr.length, bArr);
        xve.h(str);
        this.b = str;
        this.c = str2;
        xve.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof by8)) {
            return false;
        }
        by8 by8Var = (by8) obj;
        return vue.a(this.a, by8Var.a) && vue.a(this.b, by8Var.b) && vue.a(this.c, by8Var.c) && vue.a(this.d, by8Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder p = ik8.p("PublicKeyCredentialUserEntity{\n id=", lsd.b(this.a.p()), ", \n name='");
        p.append(this.b);
        p.append("', \n icon='");
        p.append(this.c);
        p.append("', \n displayName='");
        return c00.k(p, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.c(parcel, 2, this.a.p());
        bye.l(parcel, 3, this.b);
        bye.l(parcel, 4, this.c);
        bye.l(parcel, 5, this.d);
        bye.s(parcel, r);
    }
}
