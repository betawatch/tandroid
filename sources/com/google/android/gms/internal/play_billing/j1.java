package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j1 {
    public static final j1 b;
    public static final j1 c;
    public final Throwable a;

    static {
        if (g4.d) {
            c = null;
            b = null;
        } else {
            c = new j1(null);
            b = new j1(null);
        }
    }

    public j1(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
