package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import zd.e0;
import zd.h0;
import zd.s;
import zd.t;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
