// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dod {
    public static final dod d = new dod();
    public final Runnable a;
    public final Executor b;
    public dod c;

    public dod() {
        this.a = null;
        this.b = null;
    }

    public dod(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
