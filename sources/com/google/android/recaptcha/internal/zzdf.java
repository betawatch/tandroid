package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zzdf {
    public static final le3 zza(Task task) {
        final nq2 a = kud.a();
        task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                av5 av5Var = mq2.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((nq2) av5Var).P(exception);
                } else if (task2.isCanceled()) {
                    ((ov5) av5Var).cancel(null);
                } else {
                    ((nq2) av5Var).B(task2.getResult());
                }
            }
        });
        return new zzde(a);
    }
}
