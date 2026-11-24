package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zzbv {
    public static final Task zza(final zc3 zc3Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        zc3Var.invokeOnCompletion(new qp4() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // qp4
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof CancellationException;
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (z) {
                    taskCompletionSource2.setException((Exception) th);
                } else {
                    zc3 zc3Var2 = zc3Var;
                    Throwable completionExceptionOrNull = zc3Var2.getCompletionExceptionOrNull();
                    if (completionExceptionOrNull == null) {
                        taskCompletionSource2.setResult(zc3Var2.getCompleted());
                    } else {
                        Exception exc = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                        if (exc == null) {
                            exc = new RuntimeExecutionException(completionExceptionOrNull);
                        }
                        taskCompletionSource2.setException(exc);
                    }
                }
                return g5c.a;
            }
        });
        return taskCompletionSource.getTask();
    }
}
