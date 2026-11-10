package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import gd.k;
import java.util.concurrent.CancellationException;
import rd.l;
import zd.e0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzbv {
    public static final Task zza(final e0 e0Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        e0Var.invokeOnCompletion(new l() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // rd.l
            public final Object invoke(Object obj) {
                Throwable th2 = (Throwable) obj;
                boolean z9 = th2 instanceof CancellationException;
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (z9) {
                    taskCompletionSource2.setException((Exception) th2);
                } else {
                    e0 e0Var2 = e0Var;
                    Throwable completionExceptionOrNull = e0Var2.getCompletionExceptionOrNull();
                    if (completionExceptionOrNull == null) {
                        taskCompletionSource2.setResult(e0Var2.getCompleted());
                    } else {
                        Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                        if (exc == null) {
                            exc = new RuntimeExecutionException(completionExceptionOrNull);
                        }
                        taskCompletionSource2.setException(exc);
                    }
                }
                return k.a;
            }
        });
        return taskCompletionSource.getTask();
    }
}
