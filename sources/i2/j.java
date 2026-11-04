package i2;

import android.content.Context;
import android.net.Uri;
import b8.bc;
import cg.v0;
import d2.q0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j implements g2.e {
    public static final f9.t e = bc.a(new c3.q(2));
    public final l9.z a;
    public final tf.b b;
    public final int c;
    public final boolean d;

    public j(v0 v0Var) {
        this.b = new tf.b((Context) v0Var.c);
        l9.z zVar = (l9.z) e.get();
        zVar.getClass();
        this.a = zVar;
        this.c = v0Var.b;
        this.d = v0Var.a;
    }

    @Override // g2.e
    public final l9.y L(q0 q0Var) {
        byte[] bArr = q0Var.k;
        if (bArr != null) {
            return u(bArr);
        }
        Uri uri = q0Var.n;
        if (uri == null) {
            return null;
        }
        return ((l9.a0) this.a).a(new i(1, this, uri));
    }

    @Override // g2.e
    public final l9.y u(byte[] bArr) {
        return ((l9.a0) this.a).a(new i(0, this, bArr));
    }
}
