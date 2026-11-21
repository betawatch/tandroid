package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class s implements m {
    public final long a = x2.u.g.getAndIncrement();
    public final j2.m b;
    public final int c;
    public final b0 d;
    public final r e;
    public volatile Object f;

    public s(j2.h hVar, j2.m mVar, int i7, r rVar) {
        this.d = new b0(hVar);
        this.b = mVar;
        this.c = i7;
        this.e = rVar;
    }

    @Override // b3.m
    public final void a() {
        this.d.b = 0L;
        j2.k kVar = new j2.k(this.d, this.b);
        try {
            kVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.t(uri, kVar);
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = l0.a;
            try {
                kVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // b3.m
    public final void A() {
    }
}
