package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e0 extends Binder {
    public final xa.c a;

    public e0(xa.c cVar) {
        this.a = cVar;
    }

    public final void a(f0 f0Var) {
        Task b10;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        b10 = ((g) this.a.b).b(f0Var.a);
        b10.addOnCompleteListener(new a3.b(2), new a1.c(f0Var, 24));
    }
}
