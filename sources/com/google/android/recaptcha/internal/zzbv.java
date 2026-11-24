package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzbv {
    public static final Task zza(final le3 le3Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        le3Var.invokeOnCompletion(new rr4() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // rr4
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof CancellationException;
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (z) {
                    taskCompletionSource2.setException((Exception) th);
                } else {
                    le3 le3Var2 = le3Var;
                    Throwable completionExceptionOrNull = le3Var2.getCompletionExceptionOrNull();
                    if (completionExceptionOrNull == null) {
                        taskCompletionSource2.setResult(le3Var2.getCompleted());
                    } else {
                        Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                        if (exc == null) {
                            exc = new RuntimeExecutionException(completionExceptionOrNull);
                        }
                        taskCompletionSource2.setException(exc);
                    }
                }
                return g7c.a;
            }
        });
        return taskCompletionSource.getTask();
    }
}
