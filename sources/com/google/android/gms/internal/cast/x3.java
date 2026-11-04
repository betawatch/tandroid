package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x3 {
    public static final x3 d = new x3();
    public final Runnable a;
    public final Executor b;
    public x3 c;

    public x3() {
        this.a = null;
        this.b = null;
    }

    public x3(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
