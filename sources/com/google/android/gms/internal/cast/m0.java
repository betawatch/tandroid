package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m0 {
    public static final h6.b i = new h6.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final e6.g a;
    public final s b;
    public final c c;
    public Long e;
    public m5.s g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public m0(Context context, h6.r rVar, e6.g gVar, s sVar, c cVar) {
        this.a = gVar;
        this.b = sVar;
        this.c = cVar;
    }

    public final void a(p1 p1Var, int i10) {
        this.f.execute(new androidx.activity.g(this, p1Var, i10, 3));
    }
}
