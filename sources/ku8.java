// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ku8 extends b4 {
    public static final Parcelable.Creator<ku8> CREATOR = new t4d(24);
    public final String a;
    public final String b;
    public final qae c;
    public final a50 d;
    public final z40 e;
    public final b50 f;
    public final x40 h;
    public final String n;

    public ku8(String str, String str2, byte[] bArr, a50 a50Var, z40 z40Var, b50 b50Var, x40 x40Var, String str3) {
        qae o = bArr == null ? null : qae.o(bArr.length, bArr);
        boolean z = false;
        fre.a("Must provide a response object.", (a50Var != null && z40Var == null && b50Var == null) || (a50Var == null && z40Var != null && b50Var == null) || (a50Var == null && z40Var == null && b50Var != null));
        if (b50Var != null || (str != null && o != null)) {
            z = true;
        }
        fre.a("Must provide id and rawId if not an error response.", z);
        this.a = str;
        this.b = str2;
        this.c = o;
        this.d = a50Var;
        this.e = z40Var;
        this.f = b50Var;
        this.h = x40Var;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ku8)) {
            return false;
        }
        ku8 ku8Var = (ku8) obj;
        return cqe.a(this.a, ku8Var.a) && cqe.a(this.b, ku8Var.b) && cqe.a(this.c, ku8Var.c) && cqe.a(this.d, ku8Var.d) && cqe.a(this.e, ku8Var.e) && cqe.a(this.f, ku8Var.f) && cqe.a(this.h, ku8Var.h) && cqe.a(this.n, ku8Var.n);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.h, this.n});
    }

    public final String toString() {
        qae qaeVar = this.c;
        String b = und.b(qaeVar == null ? null : qaeVar.p());
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder l = yjb.l("PublicKeyCredential{\n id='", this.a, "', \n type='", this.b, "', \n rawId=");
        ls6.u(l, b, ", \n registerResponse=", valueOf, ", \n signResponse=");
        ls6.u(l, valueOf2, ", \n errorResponse=", valueOf3, ", \n extensionsClientOutputs=");
        l.append(valueOf4);
        l.append(", \n authenticatorAttachment='");
        l.append(this.n);
        l.append("'}");
        return l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nie.a.b();
        throw null;
    }
}
