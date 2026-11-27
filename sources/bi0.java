// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class bi0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ es6 d;

    public /* synthetic */ bi0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, es6 es6Var, byte b) {
        this.a = b;
        this.b = atomicInteger;
        this.c = atomicInteger2;
        this.d = es6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        es6 es6Var = this.d;
        AtomicInteger atomicInteger = this.c;
        AtomicInteger atomicInteger2 = this.b;
        switch (b) {
            case 0:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && es6Var != null) {
                    es6Var.run();
                    break;
                }
                break;
            case 1:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && es6Var != null) {
                    es6Var.run();
                    break;
                }
                break;
            default:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && es6Var != null) {
                    es6Var.run();
                    break;
                }
                break;
        }
    }
}
