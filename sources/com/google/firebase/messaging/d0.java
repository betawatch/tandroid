package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class d0 extends Binder {
    public final xa.c a;

    public d0(xa.c cVar) {
        this.a = cVar;
    }

    public final void a(e0 e0Var) {
        Task b10;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        b10 = ((g) this.a.b).b(e0Var.a);
        b10.addOnCompleteListener(new a3.b(2), new a1.c(e0Var, 24));
    }
}
