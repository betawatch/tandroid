package com.google.android.gms.internal.play_billing;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class j1 {
    public static final j1 b;
    public static final j1 c;
    public final Throwable a;

    static {
        if (h4.d) {
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
