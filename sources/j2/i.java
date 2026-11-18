package j2;

import a8.bb;
import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class i implements h2.d {
    public static final g9.t e = bb.a(new d3.p(2));
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
    public final m9.y O(o0 o0Var) {
        byte[] bArr = o0Var.k;
        if (bArr != null) {
            return t0(bArr);
        }
        Uri uri = o0Var.n;
        if (uri == null) {
            return null;
        }
        return ((m9.a0) this.a).a(new ab.i(3, this, uri));
    }

    @Override // h2.d
    public final m9.y t0(byte[] bArr) {
        return ((m9.a0) this.a).a(new ab.i(2, this, bArr));
    }
}
