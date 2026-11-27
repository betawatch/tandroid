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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class n70 {
    public static final long a = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int b = 0;

    public static void a(Task task, Activity activity) {
        vld vldVar = new vld();
        int incrementAndGet = vld.f.incrementAndGet();
        vldVar.a = incrementAndGet;
        vld.e.put(incrementAndGet, vldVar);
        vld.d.postDelayed(vldVar, 600000L);
        task.addOnCompleteListener(vldVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i = vldVar.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", a);
        xrd xrdVar = new xrd();
        xrdVar.setArguments(bundle);
        int i2 = vldVar.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i2);
        beginTransaction.add(xrdVar, sb.toString()).commit();
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
