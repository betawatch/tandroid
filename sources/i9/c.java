package i9;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
