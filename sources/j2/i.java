package j2;

import a8.ka;
import android.content.Context;
import android.net.Uri;
import bg.w0;
import e2.o0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class i implements h2.d {
    public static final g9.u e = ka.a(new d3.q(2));
    public final m9.z a;
    public final n b;
    public final int c;
    public final boolean d;

    public i(w0 w0Var) {
        this.b = new n((Context) w0Var.c);
        m9.z zVar = (m9.z) e.get();
        zVar.getClass();
        this.a = zVar;
        this.c = w0Var.b;
        this.d = w0Var.a;
    }

    @Override // h2.d
    public final m9.y A(o0 o0Var) {
        byte[] bArr = o0Var.k;
        if (bArr != null) {
            return W(bArr);
        }
        Uri uri = o0Var.n;
        if (uri == null) {
            return null;
        }
        return ((m9.a0) this.a).a(new ab.i(2, this, uri));
    }

    @Override // h2.d
    public final m9.y W(byte[] bArr) {
        return ((m9.a0) this.a).a(new ab.i(1, this, bArr));
    }
}
