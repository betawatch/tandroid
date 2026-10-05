package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import gd.i;
import java.util.concurrent.CancellationException;
import rd.l;
import zd.h0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class zzbv {
    public static final Task zza(final h0 h0Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        h0Var.invokeOnCompletion(new l() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // rd.l
            public final Object invoke(Object obj) {
                Throwable th2 = (Throwable) obj;
                boolean z10 = th2 instanceof CancellationException;
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (z10) {
                    taskCompletionSource2.setException((Exception) th2);
                } else {
                    h0 h0Var2 = h0Var;
                    Throwable completionExceptionOrNull = h0Var2.getCompletionExceptionOrNull();
                    if (completionExceptionOrNull == null) {
                        taskCompletionSource2.setResult(h0Var2.getCompleted());
                    } else {
                        Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                        if (exc == null) {
                            exc = new RuntimeExecutionException(completionExceptionOrNull);
                        }
                        taskCompletionSource2.setException(exc);
                    }
                }
                return i.a;
            }
        });
        return taskCompletionSource.getTask();
    }
}
