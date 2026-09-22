package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
