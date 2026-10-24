package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class z3 {
    public static final z3 d = new z3();
    public final Runnable a;
    public final Executor b;
    public z3 c;

    public z3() {
        this.a = null;
        this.b = null;
    }

    public z3(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
