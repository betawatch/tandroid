package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t0 implements n0 {
    public final long a;
    public final q b;
    public final int c;
    public final x0 d;
    public final s0 e;
    public volatile Object f;

    public t0(m mVar, Uri uri, int i10, s0 s0Var) {
        Map map = Collections.EMPTY_MAP;
        f5.a.k(uri, "The uri must be set.");
        q qVar = new q(uri, 1, null, map, 0L, -1L, null, 1);
        this.d = new x0(mVar);
        this.b = qVar;
        this.c = i10;
        this.e = s0Var;
        this.a = l4.p.a.getAndIncrement();
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        this.d.b = 0L;
        o oVar = new o(this.d, this.b);
        try {
            oVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.d(uri, oVar);
            try {
                oVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = f5.d0.a;
            try {
                oVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void q() {
    }
}
