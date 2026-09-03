package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.sb0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 extends Binder {
    public final y5.h a;

    public c0(y5.h hVar) {
        this.a = hVar;
    }

    public final void a(d0 d0Var) {
        Task b10;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        b10 = ((g) this.a.b).b(d0Var.a);
        b10.addOnCompleteListener(new sb0(1), new a1.c(d0Var, 7));
    }
}
