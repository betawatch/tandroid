package ab;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class n0 extends Binder {
    public final cb.c a;

    public n0(cb.c cVar) {
        this.a = cVar;
    }

    public final void a(o0 o0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = o0Var.a;
        h hVar = (h) this.a.b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hVar.a.execute(new aa.s(hVar, intent, taskCompletionSource, 1));
        taskCompletionSource.getTask().addOnCompleteListener(new d3.b(3), new a1.c(o0Var, 6));
    }
}
