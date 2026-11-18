package f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;
import q7.k1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        boolean z10 = false;
        q6.m.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && o4 != null)) {
            z10 = true;
        }
        q6.m.a("Must provide id and rawId if not an error response.", z10);
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
        return q6.m.l(this.a, uVar.a) && q6.m.l(this.b, uVar.b) && q6.m.l(this.c, uVar.c) && q6.m.l(this.d, uVar.d) && q6.m.l(this.e, uVar.e) && q6.m.l(this.f, uVar.f) && q6.m.l(this.h, uVar.h) && q6.m.l(this.n, uVar.n);
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
        StringBuilder n10 = e2.n("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        e2.r(n10, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        e2.r(n10, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorAttachment='");
        n10.append(this.n);
        n10.append("'}");
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        k1.a.c();
        throw null;
    }
}
