package i9;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class c {
    public static final c d = new c();
    public final Runnable a;
    public final Executor b;
    public c c;

    public c(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }

    public c() {
        this.a = null;
        this.b = null;
    }
}
