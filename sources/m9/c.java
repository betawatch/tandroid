package m9;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
