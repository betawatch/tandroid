package g5;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
