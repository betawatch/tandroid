package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import fd.h;
import wd.b0;
import wd.e0;
import wd.n1;
import wd.s;
import wd.t;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzdf {
    public static final e0 zza(Task task) {
        final t a10 = b0.a();
        task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                h hVar = s.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((t) hVar).Q(exception);
                } else if (task2.isCanceled()) {
                    ((n1) hVar).cancel(null);
                } else {
                    ((t) hVar).C(task2.getResult());
                }
            }
        });
        return new zzde(a10);
    }
}
