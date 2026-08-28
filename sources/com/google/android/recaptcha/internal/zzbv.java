package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import hd.i0;
import java.util.concurrent.CancellationException;
import oc.i;
import zc.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class zzbv {
    public static final Task zza(final i0 i0Var) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        i0Var.invokeOnCompletion(new l() { // from class: com.google.android.recaptcha.internal.zzbu
            @Override // zc.l
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z10 = th instanceof CancellationException;
                TaskCompletionSource taskCompletionSource2 = TaskCompletionSource.this;
                if (z10) {
                    taskCompletionSource2.setException((Exception) th);
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
