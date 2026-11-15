package m9;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
