package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import td.e0;
import td.h0;
import td.s;
import td.t;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zzdf {
    public static final h0 zza(Task task) {
        final t a2 = e0.a();
        task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                s sVar = s.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((t) sVar).L(exception);
                } else if (task2.isCanceled()) {
                    sVar.cancel(null);
                } else {
                    ((t) sVar).A(task2.getResult());
                }
            }
        });
        return new zzde(a2);
    }
}
