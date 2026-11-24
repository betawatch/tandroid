package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zzdf {
    public static final zc3 zza(Task task) {
        final cp2 a = hsd.a();
        task.addOnCompleteListener(zzdd.zza, new OnCompleteListener() { // from class: com.google.android.recaptcha.internal.zzdc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                bt5 bt5Var = bp2.this;
                Exception exception = task2.getException();
                if (exception != null) {
                    ((cp2) bt5Var).P(exception);
                } else if (task2.isCanceled()) {
                    ((pt5) bt5Var).cancel(null);
                } else {
                    ((cp2) bt5Var).B(task2.getResult());
                }
            }
        });
        return new zzde(a);
    }
}
