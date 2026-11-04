package a3;

import android.net.Uri;
import g2.n0;
import i2.c0;
import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements m {
    public final long a = w2.u.g.getAndIncrement();
    public final i2.n b;
    public final int c;
    public final c0 d;
    public final s e;
    public volatile Object f;

    public t(i2.h hVar, i2.n nVar, int i3, s sVar) {
        this.d = new c0(hVar);
        this.b = nVar;
        this.c = i3;
        this.e = sVar;
    }

    @Override // a3.m
    public final void a() {
        this.d.b = 0L;
        i2.l lVar = new i2.l(this.d, this.b);
        try {
            lVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.L(uri, lVar);
            try {
                lVar.close();
            } catch (IOException unused) {
            }
        } finally {
            String str = n0.a;
            try {
                lVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // a3.m
    public final void X1() {
    }
}
