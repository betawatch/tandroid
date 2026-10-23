package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
