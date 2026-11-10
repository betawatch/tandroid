package b3;

import android.net.Uri;
import h2.m0;
import j2.c0;
import java.io.IOException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r implements l {
    public final long a = x2.t.g.getAndIncrement();
    public final j2.m b;
    public final int c;
    public final c0 d;
    public final q e;
    public volatile Object f;

    public r(j2.h hVar, j2.m mVar, int i7, q qVar) {
        this.d = new c0(hVar);
        this.b = mVar;
        this.c = i7;
        this.e = qVar;
    }

    @Override // b3.l
    public final void a() {
        this.d.b = 0L;
        j2.k kVar = new j2.k(this.d, this.b);
        try {
            kVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.L1(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = m0.a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // b3.l
    public final void q0() {
    }
}
