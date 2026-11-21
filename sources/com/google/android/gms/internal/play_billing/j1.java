package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
