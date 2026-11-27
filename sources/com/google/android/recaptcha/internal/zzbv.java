package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzbv {
    public static final Task zza(final rd3 rd3Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        rd3Var.invokeOnCompletion(new ur4() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // ur4
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof CancellationException;
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (z) {
                    taskCompletionSource2.setException((Exception) th);
                } else {
                    rd3 rd3Var2 = rd3Var;
                    Throwable completionExceptionOrNull = rd3Var2.getCompletionExceptionOrNull();
                    if (completionExceptionOrNull == null) {
                        taskCompletionSource2.setResult(rd3Var2.getCompleted());
                    } else {
                        Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                        if (exc == null) {
                            exc = new RuntimeExecutionException(completionExceptionOrNull);
                        }
                        taskCompletionSource2.setException(exc);
                    }
                }
                return f9c.a;
            }
        });
        return taskCompletionSource.getTask();
    }
}
