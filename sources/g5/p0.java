package g5;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p0 implements j0 {
    public final long a;
    public final p b;
    public final int c;
    public final u0 d;
    public final o0 e;
    public volatile Object f;

    public p0(m mVar, Uri uri, int i10, o0 o0Var) {
        Map map = Collections.EMPTY_MAP;
        h5.a.k(uri, "The uri must be set.");
        p pVar = new p(uri, 1, null, map, 0L, -1L, null, 1);
        this.d = new u0(mVar);
        this.b = pVar;
        this.c = i10;
        this.e = o0Var;
        this.a = o4.j.a.getAndIncrement();
    }

    @Override // g5.j0
    public final void a() {
        this.d.b = 0L;
        o oVar = new o(this.d, this.b);
        try {
            oVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.w(uri, oVar);
            try {
                oVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = h5.d0.a;
            try {
                oVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // g5.j0
    public final void l() {
    }
}
