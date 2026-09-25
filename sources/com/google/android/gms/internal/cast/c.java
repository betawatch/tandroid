package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
