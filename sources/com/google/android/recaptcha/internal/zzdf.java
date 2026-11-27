package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzdf {
    public static final rd3 zza(Task task) {
        final vp2 a = xwd.a();
        task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                kx2 kx2Var = up2.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((vp2) kx2Var).P(exception);
                } else if (task2.isCanceled()) {
                    ((sv5) kx2Var).cancel(null);
                } else {
                    ((vp2) kx2Var).B(task2.getResult());
                }
            }
        });
        return new zzde(a);
    }
}
