package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        d5.a.k(uri, "The uri must be set.");
        q qVar = new q(uri, 1, null, map, 0L, -1L, null, 1);
        this.d = new x0(mVar);
        this.b = qVar;
        this.c = i10;
        this.e = s0Var;
        this.a = j4.p.a.getAndIncrement();
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void a() {
        this.d.b = 0L;
        o oVar = new o(this.d, this.b);
        try {
            oVar.a();
            Uri uri = this.d.a.getUri();
            uri.getClass();
            this.f = this.e.e(uri, oVar);
            try {
                oVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = d5.g0.a;
            try {
                oVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.n0
    public final void l() {
    }
}
