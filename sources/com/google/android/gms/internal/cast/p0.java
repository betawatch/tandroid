package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p0 {
    public static final s5.b i = new s5.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final p5.g a;
    public final t b;
    public final d c;
    public Long e;
    public y2.p g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public p0(Context context, s5.s sVar, p5.g gVar, t tVar, d dVar) {
        this.a = gVar;
        this.b = tVar;
        this.c = dVar;
    }

    public final void a(t1 t1Var, int i10) {
        this.f.execute(new androidx.activity.g(this, t1Var, i10, 3));
    }
}
