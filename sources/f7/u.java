package f7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import q7.k1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class u extends r6.a {
    public static final Parcelable.Creator<u> CREATOR = new db.k(14);
    public final String a;
    public final String b;
    public final q7.s0 c;
    public final j d;
    public final i e;
    public final k f;
    public final g h;
    public final String n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        q7.s0 o4 = bArr == null ? null : q7.s0.o(bArr.length, bArr);
        boolean z9 = false;
        q6.m.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && o4 != null)) {
            z9 = true;
        }
        q6.m.a("Must provide id and rawId if not an error response.", z9);
        this.a = str;
        this.b = str2;
        this.c = o4;
        this.d = jVar;
        this.e = iVar;
        this.f = kVar;
        this.h = gVar;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return q6.m.k(this.a, uVar.a) && q6.m.k(this.b, uVar.b) && q6.m.k(this.c, uVar.c) && q6.m.k(this.d, uVar.d) && q6.m.k(this.e, uVar.e) && q6.m.k(this.f, uVar.f) && q6.m.k(this.h, uVar.h) && q6.m.k(this.n, uVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        q7.s0 s0Var = this.c;
        String c10 = x6.b.c(s0Var == null ? null : s0Var.p());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        com.google.android.recaptcha.internal.a.s(n10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        com.google.android.recaptcha.internal.a.s(n10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorAttachment='");
        n10.append(this.n);
        n10.append("'}");
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        k1.a.T();
        throw null;
    }
}
