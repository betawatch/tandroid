package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class zzdf {
    public static final Deferred zza(Task task) {
        final CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                CompletableDeferred completableDeferred = CompletableDeferred.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    completableDeferred.completeExceptionally(exception);
                } else if (task2.isCanceled()) {
                    Job.DefaultImpls.cancel$default(completableDeferred, null, 1, null);
                } else {
                    completableDeferred.complete(task2.getResult());
                }
            }
        });
        return new zzde(CompletableDeferred$default);
    }
}
