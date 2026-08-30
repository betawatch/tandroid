package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.biometric.f0;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.rb0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 extends Binder {
    public final f0 a;

    public c0(f0 f0Var) {
        this.a = f0Var;
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
        b10.addOnCompleteListener(new rb0(1), new a1.c(d0Var, 8));
    }
}
