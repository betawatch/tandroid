package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i1 {
    public static final i1 b;
    public static final i1 c;
    public final Throwable a;

    static {
        if (f4.d) {
            c = null;
            b = null;
        } else {
            c = new i1(null);
            b = new i1(null);
        }
    }

    public i1(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
