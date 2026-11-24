// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class aj0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ op6 d;

    public /* synthetic */ aj0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, op6 op6Var, byte b) {
        this.a = b;
        this.b = atomicInteger;
        this.c = atomicInteger2;
        this.d = op6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        op6 op6Var = this.d;
        AtomicInteger atomicInteger = this.c;
        AtomicInteger atomicInteger2 = this.b;
        switch (b) {
            case 0:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && op6Var != null) {
                    op6Var.run();
                    break;
                }
                break;
            case 1:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && op6Var != null) {
                    op6Var.run();
                    break;
                }
                break;
            default:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && op6Var != null) {
                    op6Var.run();
                    break;
                }
                break;
        }
    }
}
