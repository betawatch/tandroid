package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
