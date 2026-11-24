// default package

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class l70 {
    public static final long a = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int b = 0;

    public static void a(Task task, Activity activity) {
        ehd ehdVar = new ehd();
        int incrementAndGet = ehd.f.incrementAndGet();
        ehdVar.a = incrementAndGet;
        ehd.e.put(incrementAndGet, ehdVar);
        ehd.d.postDelayed(ehdVar, 600000L);
        task.addOnCompleteListener(ehdVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i = ehdVar.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", a);
        gnd gndVar = new gnd();
        gndVar.setArguments(bundle);
        int i2 = ehdVar.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i2);
        beginTransaction.add(gndVar, sb.toString()).commit();
    }

    public static void b(Activity activity, int i, int i2, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i, intent, TLObject.FLAG_30);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                createPendingResult.send(i2);
            } catch (PendingIntent.CanceledException e) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e);
                }
            }
        }
    }
}
