package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o0 {
    public static final r5.b i = new r5.b("ClientCastAnalytics", null);
    public static final boolean j = true;
    public final n5.h a;
    public final s b;
    public final d c;
    public Long e;
    public w2.p g;
    public int h = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public o0(Context context, r5.s sVar, n5.h hVar, s sVar2, d dVar) {
        this.a = hVar;
        this.b = sVar2;
        this.c = dVar;
    }

    public final void a(r1 r1Var, int i10) {
        this.f.execute(new androidx.activity.g(this, r1Var, i10, 3));
    }
}
