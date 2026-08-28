package m6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import x6.k1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u extends y5.a {
    public static final Parcelable.Creator<u> CREATOR = new h5.h(25);
    public final String a;
    public final String b;
    public final x6.s0 c;
    public final j d;
    public final i e;
    public final k f;
    public final g h;
    public final String n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        x6.s0 t10 = bArr == null ? null : x6.s0.t(bArr.length, bArr);
        boolean z10 = false;
        x5.l.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && t10 != null)) {
            z10 = true;
        }
        x5.l.a("Must provide id and rawId if not an error response.", z10);
        this.a = str;
        this.b = str2;
        this.c = t10;
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
        return x5.l.l(this.a, uVar.a) && x5.l.l(this.b, uVar.b) && x5.l.l(this.c, uVar.c) && x5.l.l(this.d, uVar.d) && x5.l.l(this.e, uVar.e) && x5.l.l(this.f, uVar.f) && x5.l.l(this.h, uVar.h) && x5.l.l(this.n, uVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        x6.s0 s0Var = this.c;
        String c10 = e6.b.c(s0Var == null ? null : s0Var.u());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder q10 = j3.r0.q("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        j3.r0.A(q10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        j3.r0.A(q10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        q10.append(valueOf4);
        q10.append(", \n authenticatorAttachment='");
        q10.append(this.n);
        q10.append("'}");
        return q10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        k1.a.R();
        throw null;
    }
}
