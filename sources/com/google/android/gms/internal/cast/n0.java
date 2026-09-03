package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
