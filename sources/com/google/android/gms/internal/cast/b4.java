package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b4 {
    public static final b4 d = new b4();
    public final Runnable a;
    public final Executor b;
    public b4 c;

    public b4() {
        this.a = null;
        this.b = null;
    }

    public b4(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
