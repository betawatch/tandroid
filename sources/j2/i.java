package j2;

import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class i implements h2.d {
    public static final g9.t e = af.b.b(new d3.p(2));
    public final m9.z a;
    public final wf.b b;
    public final int c;
    public final boolean d;

    public i(w0 w0Var) {
        this.b = new wf.b((Context) w0Var.c);
        m9.z zVar = (m9.z) e.get();
        zVar.getClass();
        this.a = zVar;
        this.c = w0Var.b;
        this.d = w0Var.a;
    }

    @Override // h2.d
    public final m9.y I(o0 o0Var) {
        byte[] bArr = o0Var.k;
        if (bArr != null) {
            return V(bArr);
        }
        Uri uri = o0Var.n;
        if (uri == null) {
            return null;
        }
        return ((m9.a0) this.a).a(new ab.i(3, this, uri));
    }

    @Override // h2.d
    public final m9.y V(byte[] bArr) {
        return ((m9.a0) this.a).a(new ab.i(2, this, bArr));
    }
}
