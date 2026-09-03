package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ld.e0;
import ld.h0;
import ld.s;
import ld.t;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
