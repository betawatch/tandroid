package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 {
    public static final q5.b i = new q5.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final n5.g a;
    public final t b;
    public final d c;
    public Long e;
    public w2.p g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public p0(Context context, q5.s sVar, n5.g gVar, t tVar, d dVar) {
        this.a = gVar;
        this.b = tVar;
        this.c = dVar;
    }

    public final void a(s1 s1Var, int i9) {
        this.f.execute(new androidx.activity.g(this, s1Var, i9, 4));
    }
}
