package d7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o7.k1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u extends p6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(26);
    public final String a;
    public final String b;
    public final o7.s0 c;
    public final j d;
    public final i e;
    public final k f;
    public final g h;
    public final String n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        o7.s0 s10 = bArr == null ? null : o7.s0.s(bArr.length, bArr);
        boolean z10 = false;
        o6.l.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && s10 != null)) {
            z10 = true;
        }
        o6.l.a("Must provide id and rawId if not an error response.", z10);
        this.a = str;
        this.b = str2;
        this.c = s10;
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
        return o6.l.l(this.a, uVar.a) && o6.l.l(this.b, uVar.b) && o6.l.l(this.c, uVar.c) && o6.l.l(this.d, uVar.d) && o6.l.l(this.e, uVar.e) && o6.l.l(this.f, uVar.f) && o6.l.l(this.h, uVar.h) && o6.l.l(this.n, uVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        o7.s0 s0Var = this.c;
        String c10 = v6.b.c(s0Var == null ? null : s0Var.t());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder w10 = a1.g.w("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        c3.h0.r(w10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        c3.h0.r(w10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorAttachment='");
        w10.append(this.n);
        w10.append("'}");
        return w10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k1.a.a();
        throw null;
    }
}
