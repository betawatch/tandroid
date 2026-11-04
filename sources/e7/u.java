package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p7.l1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u extends q6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(29);
    public final String a;
    public final String b;
    public final p7.t0 c;
    public final j d;
    public final i e;
    public final k f;
    public final g h;
    public final String n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        p7.t0 o10 = bArr == null ? null : p7.t0.o(bArr.length, bArr);
        boolean z10 = false;
        p6.m.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && o10 != null)) {
            z10 = true;
        }
        p6.m.a("Must provide id and rawId if not an error response.", z10);
        this.a = str;
        this.b = str2;
        this.c = o10;
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
        return p6.m.k(this.a, uVar.a) && p6.m.k(this.b, uVar.b) && p6.m.k(this.c, uVar.c) && p6.m.k(this.d, uVar.d) && p6.m.k(this.e, uVar.e) && p6.m.k(this.f, uVar.f) && p6.m.k(this.h, uVar.h) && p6.m.k(this.n, uVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        p7.t0 t0Var = this.c;
        String c2 = w6.b.c(t0Var == null ? null : t0Var.p());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        com.google.android.recaptcha.internal.a.s(n4, c2, ", \n registerResponse=", valueOf, ", \n signResponse=");
        com.google.android.recaptcha.internal.a.s(n4, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n4.append(valueOf4);
        n4.append(", \n authenticatorAttachment='");
        n4.append(this.n);
        n4.append("'}");
        return n4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        l1.a.b();
        throw null;
    }
}
