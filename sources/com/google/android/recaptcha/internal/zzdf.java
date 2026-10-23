package com.google.android.recaptcha.internal;

import be.f0;
import be.i0;
import be.s;
import be.t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class zzdf {
    public static final i0 zza(Task task) {
        final t a2 = f0.a();
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
