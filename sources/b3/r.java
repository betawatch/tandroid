package b3;

import android.net.Uri;
import h2.m0;
import j2.c0;
import java.io.IOException;
import x2.u;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class r implements l {
    public final long a = u.g.getAndIncrement();
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
