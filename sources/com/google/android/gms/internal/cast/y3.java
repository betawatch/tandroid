package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
