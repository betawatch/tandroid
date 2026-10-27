package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
