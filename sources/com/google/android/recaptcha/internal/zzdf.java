package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import zd.e0;
import zd.h0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
