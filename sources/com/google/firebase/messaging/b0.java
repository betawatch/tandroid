package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.biometric.e0;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b0 extends Binder {
    public final e0 a;

    public b0(e0 e0Var) {
        this.a = e0Var;
    }

    public final void a(c0 c0Var) {
        Task b10;
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        b10 = ((g) this.a.b).b(c0Var.a);
        b10.addOnCompleteListener(new tb0(1), new a1.c(c0Var, 8));
    }
}
