package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
