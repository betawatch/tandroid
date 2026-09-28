package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
