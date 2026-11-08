package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
