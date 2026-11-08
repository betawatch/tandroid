package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class m0 {
    public static final j6.b i = new j6.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final g6.g a;
    public final s b;
    public final c c;
    public Long e;
    public o5.r g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public m0(Context context, j6.r rVar, g6.g gVar, s sVar, c cVar) {
        this.a = gVar;
        this.b = sVar;
        this.c = cVar;
    }

    public final void a(p1 p1Var, int i7) {
        this.f.execute(new androidx.activity.g(this, p1Var, i7, 3));
    }
}
