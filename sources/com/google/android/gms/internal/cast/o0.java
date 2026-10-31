package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
