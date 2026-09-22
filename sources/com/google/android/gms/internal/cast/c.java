package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class c {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final int e;

    public c(a aVar) {
        this.e = aVar.a;
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
