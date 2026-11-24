// default package

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class myc extends Binder {
    public final z24 a;

    public myc(z24 z24Var) {
        this.a = z24Var;
    }

    public final void a(nyc nycVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = nycVar.a;
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.a.b;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        firebaseMessagingService.a.execute(new mg3(firebaseMessagingService, intent, taskCompletionSource, (byte) 18));
        taskCompletionSource.getTask().addOnCompleteListener(new hc((byte) 1), new dkc(nycVar, (byte) 11));
    }
}
