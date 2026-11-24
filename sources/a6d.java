// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class a6d {
    public final long a;
    public long b;
    public long c;
    public final AtomicInteger d;
    public final byte e;

    public a6d(d00 d00Var) {
        this.e = d00Var.a;
        long currentTimeMillis = System.currentTimeMillis();
        this.a = currentTimeMillis;
        this.b = currentTimeMillis;
        this.d = new AtomicInteger(1);
    }
}
