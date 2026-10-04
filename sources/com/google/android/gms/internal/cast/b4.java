package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
