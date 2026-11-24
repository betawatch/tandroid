// default package

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n0d extends Binder {
    public final k44 a;

    public n0d(k44 k44Var) {
        this.a = k44Var;
    }

    public final void a(o0d o0dVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = o0dVar.a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.a.b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        firebaseMessagingService.a.execute(new pz2(firebaseMessagingService, intent, taskCompletionSource, (byte) 20));
        taskCompletionSource.getTask().addOnCompleteListener(new kc((byte) 1), new lcc(o0dVar, (byte) 15));
    }
}
