// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class k2 {
    public static final k2 d = new k2();
    public final Runnable a;
    public final Executor b;
    public k2 c;

    public k2() {
        this.a = null;
        this.b = null;
    }

    public k2(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
