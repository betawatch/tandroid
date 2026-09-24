package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
