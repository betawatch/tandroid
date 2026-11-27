// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fgf {
    public static final fgf d = new fgf();
    public final Runnable a;
    public final Executor b;
    public fgf c;

    public fgf() {
        this.a = null;
        this.b = null;
    }

    public fgf(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
