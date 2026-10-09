package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
