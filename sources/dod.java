// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
