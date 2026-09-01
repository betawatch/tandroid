package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class n0 {
    public static final u5.b i = new u5.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final r5.g a;
    public final r b;
    public final c c;
    public Long e;
    public y2.p g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public n0(Context context, u5.s sVar, r5.g gVar, r rVar, c cVar) {
        this.a = gVar;
        this.b = rVar;
        this.c = cVar;
    }

    public final void a(r1 r1Var, int i10) {
        this.f.execute(new androidx.activity.g(this, r1Var, i10, 3));
    }
}
