package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class f0 {
    public static final f0 d = new f0();
    public final Runnable a;
    public final Executor b;
    public f0 c;

    public f0() {
        this.a = null;
        this.b = null;
    }

    public f0(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
