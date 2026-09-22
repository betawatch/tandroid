package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
