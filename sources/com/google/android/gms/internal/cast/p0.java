package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class p0 {
    public static final g6.b i = new g6.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final d6.g a;
    public final u b;
    public final d c;
    public Long e;
    public l5.r g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public p0(Context context, g6.r rVar, d6.g gVar, u uVar, d dVar) {
        this.a = gVar;
        this.b = uVar;
        this.c = dVar;
    }

    public final void a(s1 s1Var, int i10) {
        this.f.execute(new androidx.activity.g(this, s1Var, i10, 3));
    }
}
