package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
