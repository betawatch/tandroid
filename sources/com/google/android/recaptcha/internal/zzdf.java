package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import zd.a1;
import zd.b0;
import zd.e0;
import zd.n1;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class zzdf {
    public static final e0 zza(Task task) {
        final t a10 = b0.a();
        task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                a1 a1Var = s.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((t) a1Var).Q(exception);
                } else if (task2.isCanceled()) {
                    ((n1) a1Var).cancel(null);
                } else {
                    ((t) a1Var).C(task2.getResult());
                }
            }
        });
        return new zzde(a10);
    }
}
