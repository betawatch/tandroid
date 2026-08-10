package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class FirebaseExecutors {
    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
