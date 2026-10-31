package g2;

import android.content.Context;
import android.net.Uri;
import b2.s0;
import v7.v6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j implements e2.d {
    public static final d9.t e = v6.a(new a3.s(2));
    public final j9.z a;
    public final hf.b b;
    public final int c;
    public final boolean d;

    public j(c5.e eVar) {
        this.b = new hf.b((Context) eVar.c);
        j9.z zVar = (j9.z) e.get();
        zVar.getClass();
        this.a = zVar;
        this.c = eVar.a;
        this.d = eVar.b;
    }

    @Override // e2.d
    public final j9.y a(s0 s0Var) {
        byte[] bArr = s0Var.k;
        if (bArr != null) {
            return w(bArr);
        }
        Uri uri = s0Var.n;
        if (uri == null) {
            return null;
        }
        return ((j9.a0) this.a).a(new i(1, this, uri));
    }

    @Override // e2.d
    public final j9.y w(byte[] bArr) {
        return ((j9.a0) this.a).a(new i(0, this, bArr));
    }
}
