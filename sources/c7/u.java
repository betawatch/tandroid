package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n7.k1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class u extends o6.a {
    public static final Parcelable.Creator<u> CREATOR = new w.a(25);
    public final String a;
    public final String b;
    public final n7.s0 c;
    public final j d;
    public final i e;
    public final k f;
    public final g h;
    public final String n;

    public u(String str, String str2, byte[] bArr, j jVar, i iVar, k kVar, g gVar, String str3) {
        n7.s0 s10 = bArr == null ? null : n7.s0.s(bArr.length, bArr);
        boolean z10 = false;
        n6.l.a("Must provide a response object.", (jVar != null && iVar == null && kVar == null) || (jVar == null && iVar != null && kVar == null) || (jVar == null && iVar == null && kVar != null));
        if (kVar != null || (str != null && s10 != null)) {
            z10 = true;
        }
        n6.l.a("Must provide id and rawId if not an error response.", z10);
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
        return n6.l.k(this.a, uVar.a) && n6.l.k(this.b, uVar.b) && n6.l.k(this.c, uVar.c) && n6.l.k(this.d, uVar.d) && n6.l.k(this.e, uVar.e) && n6.l.k(this.f, uVar.f) && n6.l.k(this.h, uVar.h) && n6.l.k(this.n, uVar.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        n7.s0 s0Var = this.c;
        String c10 = u6.b.c(s0Var == null ? null : s0Var.t());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder v = a1.g.v("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        c3.i0.r(v, c10, ", \n registerResponse=", valueOf, ", \n signResponse=");
        c3.i0.r(v, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        v.append(valueOf4);
        v.append(", \n authenticatorAttachment='");
        v.append(this.n);
        v.append("'}");
        return v.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        k1.a.O();
        throw null;
    }
}
