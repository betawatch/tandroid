package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class m0 {
    public static final j6.b i = new j6.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final g6.g a;
    public final s b;
    public final c c;
    public Long e;
    public o5.s g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public m0(Context context, j6.s sVar, g6.g gVar, s sVar2, c cVar) {
        this.a = gVar;
        this.b = sVar2;
        this.c = cVar;
    }

    public final void a(p1 p1Var, int i7) {
        this.f.execute(new androidx.activity.g(this, p1Var, i7, 3));
    }
}
