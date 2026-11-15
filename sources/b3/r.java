package b3;

import android.net.Uri;
import h2.l0;
import j2.b0;
import java.io.IOException;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class r implements l {
    public final long a = x2.t.g.getAndIncrement();
    public final j2.m b;
    public final int c;
    public final b0 d;
    public final q e;
    public volatile Object f;

    public r(j2.h hVar, j2.m mVar, int i7, q qVar) {
        this.d = new b0(hVar);
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
            this.f = this.e.l(uri, kVar);
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

    @Override // b3.l
    public final void D() {
    }
}
