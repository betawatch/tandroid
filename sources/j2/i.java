package j2;

import a8.la;
import android.content.Context;
import android.net.Uri;
import bg.v0;
import e2.o0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class i implements h2.d {
    public static final g9.t e = la.a(new d3.p(2));
    public final m9.z a;
    public final wf.b b;
    public final int c;
    public final boolean d;

    public i(v0 v0Var) {
        this.b = new wf.b((Context) v0Var.c);
        m9.z zVar = (m9.z) e.get();
        zVar.getClass();
        this.a = zVar;
        this.c = v0Var.b;
        this.d = v0Var.a;
    }

    @Override // h2.d
    public final m9.y L(o0 o0Var) {
        byte[] bArr = o0Var.k;
        if (bArr != null) {
            return d0(bArr);
        }
        Uri uri = o0Var.n;
        if (uri == null) {
            return null;
        }
        return ((m9.a0) this.a).a(new ab.i(3, this, uri));
    }

    @Override // h2.d
    public final m9.y d0(byte[] bArr) {
        return ((m9.a0) this.a).a(new ab.i(2, this, bArr));
    }
}
