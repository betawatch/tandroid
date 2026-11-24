// default package

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ nn6 d;

    public /* synthetic */ ai0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, nn6 nn6Var, byte b) {
        this.a = b;
        this.b = atomicInteger;
        this.c = atomicInteger2;
        this.d = nn6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        nn6 nn6Var = this.d;
        AtomicInteger atomicInteger = this.c;
        AtomicInteger atomicInteger2 = this.b;
        switch (b) {
            case 0:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && nn6Var != null) {
                    nn6Var.run();
                    break;
                }
                break;
            case 1:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && nn6Var != null) {
                    nn6Var.run();
                    break;
                }
                break;
            default:
                if (atomicInteger2.incrementAndGet() == atomicInteger.get() && nn6Var != null) {
                    nn6Var.run();
                    break;
                }
                break;
        }
    }
}
