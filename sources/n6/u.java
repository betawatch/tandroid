package n6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import y6.k1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u extends z5.a {
    public static final Parcelable.Creator<u> CREATOR = new o0(6);
    public final String a;
    public final String b;
    public final y6.s0 c;
    public final j d;
    public final i e;
    public final k f;
    public final g h;
    public final String n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        y6.s0 t10 = bArr == null ? null : y6.s0.t(bArr.length, bArr);
        boolean z10 = false;
        y5.l.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && t10 != null)) {
            z10 = true;
        }
        y5.l.a("Must provide id and rawId if not an error response.", z10);
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
        return y5.l.l(this.a, uVar.a) && y5.l.l(this.b, uVar.b) && y5.l.l(this.c, uVar.c) && y5.l.l(this.d, uVar.d) && y5.l.l(this.e, uVar.e) && y5.l.l(this.f, uVar.f) && y5.l.l(this.h, uVar.h) && y5.l.l(this.n, uVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        y6.s0 s0Var = this.c;
        String c10 = f6.b.c(s0Var == null ? null : s0Var.u());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder p6 = i0.a.p("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        i0.a.z(p6, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        i0.a.z(p6, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        p6.append(valueOf4);
        p6.append(", \n authenticatorAttachment='");
        p6.append(this.n);
        p6.append("'}");
        return p6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k1.a.p();
        throw null;
    }
}
