package com.google.android.gms.internal.cast;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
