// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
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
