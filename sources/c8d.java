// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c8d {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final byte e;

    public c8d(d10 d10Var) {
        this.e = d10Var.a;
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
