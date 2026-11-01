package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class o0 {
    public static final g6.b i = new g6.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final d6.g a;
    public final t b;
    public final c c;
    public Long e;
    public l5.r g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public o0(Context context, g6.r rVar, d6.g gVar, t tVar, c cVar) {
        this.a = gVar;
        this.b = tVar;
        this.c = cVar;
    }

    public final void a(r1 r1Var, int i10) {
        this.f.execute(new androidx.activity.g(this, r1Var, i10, 3));
    }
}
