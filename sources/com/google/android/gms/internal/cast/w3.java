package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
