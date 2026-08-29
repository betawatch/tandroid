package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.th;
import z6.k1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u extends a6.a {
    public static final Parcelable.Creator<u> CREATOR = new n0(7);
    public final String a;
    public final String b;
    public final z6.s0 c;
    public final j d;
    public final i e;
    public final k f;
    public final g h;
    public final String n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        z6.s0 t10 = bArr == null ? null : z6.s0.t(bArr.length, bArr);
        boolean z10 = false;
        z5.l.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && t10 != null)) {
            z10 = true;
        }
        z5.l.a("Must provide id and rawId if not an error response.", z10);
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
        return z5.l.l(this.a, uVar.a) && z5.l.l(this.b, uVar.b) && z5.l.l(this.c, uVar.c) && z5.l.l(this.d, uVar.d) && z5.l.l(this.e, uVar.e) && z5.l.l(this.f, uVar.f) && z5.l.l(this.h, uVar.h) && z5.l.l(this.n, uVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        z6.s0 s0Var = this.c;
        String c3 = g6.b.c(s0Var == null ? null : s0Var.u());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder k9 = th.k("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        th.w(k9, c3, ", \n registerResponse=", valueOf, ", \n signResponse=");
        th.w(k9, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        k9.append(valueOf4);
        k9.append(", \n authenticatorAttachment='");
        k9.append(this.n);
        k9.append("'}");
        return k9.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k1.a.a();
        throw null;
    }
}
