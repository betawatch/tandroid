package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n0 {
    public static final i6.b i = new i6.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final f6.g a;
    public final t b;
    public final c c;
    public Long e;
    public n5.r g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public n0(Context context, i6.r rVar, f6.g gVar, t tVar, c cVar) {
        this.a = gVar;
        this.b = tVar;
        this.c = cVar;
    }

    public final void a(q1 q1Var, int i3) {
        this.f.execute(new androidx.activity.g(this, q1Var, i3, 3));
    }
}
