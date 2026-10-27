package com.google.android.recaptcha.internal;

import ce.i0;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import jd.i;
import ud.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class zzbv {
    public static final Task zza(final i0 i0Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        i0Var.invokeOnCompletion(new l() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // ud.l
            public final Object invoke(Object obj) {
                Throwable th2 = (Throwable) obj;
                boolean z10 = th2 instanceof CancellationException;
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (z10) {
                    taskCompletionSource2.setException((Exception) th2);
                } else {
                    i0 i0Var2 = i0Var;
                    Throwable completionExceptionOrNull = i0Var2.getCompletionExceptionOrNull();
                    if (completionExceptionOrNull == null) {
                        taskCompletionSource2.setResult(i0Var2.getCompleted());
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
