package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class b {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final int e;

    public b(b7.l lVar) {
        this.e = lVar.a;
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
