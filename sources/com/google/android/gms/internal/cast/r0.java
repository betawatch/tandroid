package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class r0 {
    public static final g6.b i = new g6.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final d6.g a;
    public final u b;
    public final d c;
    public Long e;
    public l5.s g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public r0(Context context, g6.r rVar, d6.g gVar, u uVar, d dVar) {
        this.a = gVar;
        this.b = uVar;
        this.c = dVar;
    }

    public final void a(u1 u1Var, int i10) {
        this.f.execute(new androidx.activity.g(this, u1Var, i10, 3));
    }
}
