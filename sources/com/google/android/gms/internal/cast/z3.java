package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class z3 {
    public static final z3 d = new z3();
    public final Runnable a;
    public final Executor b;
    public z3 c;

    public z3() {
        this.a = null;
        this.b = null;
    }

    public z3(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
