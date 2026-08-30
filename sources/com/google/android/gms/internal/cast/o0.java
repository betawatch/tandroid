package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class o0 {
    public static final u5.b i = new u5.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final r5.g a;
    public final s b;
    public final c c;
    public Long e;
    public y2.p g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public o0(Context context, u5.s sVar, r5.g gVar, s sVar2, c cVar) {
        this.a = gVar;
        this.b = sVar2;
        this.c = cVar;
    }

    public final void a(s1 s1Var, int i10) {
        this.f.execute(new androidx.activity.g(this, s1Var, i10, 3));
    }
}
