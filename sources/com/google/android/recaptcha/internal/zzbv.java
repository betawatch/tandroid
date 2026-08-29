package com.google.android.recaptcha.internal;

import bd.l;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import jd.h0;
import qc.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class zzbv {
    public static final Task zza(final h0 h0Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        h0Var.invokeOnCompletion(new l() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // bd.l
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
