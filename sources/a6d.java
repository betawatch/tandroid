// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
