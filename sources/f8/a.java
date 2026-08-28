package f8;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    public static final long a = TimeUnit.MINUTES.toMillis(10);
    public static final long b = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int c = 0;

    public static void a(Task task, Activity activity) {
        u uVar = new u();
        int incrementAndGet = u.f.incrementAndGet();
        uVar.a = incrementAndGet;
        u.e.put(incrementAndGet, uVar);
        u.d.postDelayed(uVar, a);
        task.addOnCompleteListener(uVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i9 = uVar.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i9);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", b);
        v vVar = new v();
        vVar.setArguments(bundle);
        int i10 = uVar.a;
        StringBuilder sb2 = new StringBuilder(58);
        sb2.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb2.append(i10);
        beginTransaction.add(vVar, sb2.toString()).commit();
    }

    public static void b(Activity activity, int i9, int i10, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i9, intent, TLObject.FLAG_30);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                createPendingResult.send(i10);
            } catch (PendingIntent.CanceledException e10) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e10);
                }
            }
        }
    }
}
