package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final int e;

    public b(ae.j jVar) {
        this.e = jVar.a;
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
