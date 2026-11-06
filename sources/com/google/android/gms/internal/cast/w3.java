package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class w3 {
    public static final w3 d = new w3();
    public final Runnable a;
    public final Executor b;
    public w3 c;

    public w3() {
        this.a = null;
        this.b = null;
    }

    public w3(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
