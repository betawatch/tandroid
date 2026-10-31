package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y3 {
    public static final y3 d = new y3();
    public final Runnable a;
    public final Executor b;
    public y3 c;

    public y3() {
        this.a = null;
        this.b = null;
    }

    public y3(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
