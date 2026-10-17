package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
