package j8;

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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        int i10 = uVar.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i10);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", b);
        v vVar = new v();
        vVar.setArguments(bundle);
        int i11 = uVar.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i11);
        beginTransaction.add(vVar, sb.toString()).commit();
    }

    public static void b(Activity activity, int i10, int i11, Intent intent) {
        PendingIntent createPendingResult = activity.createPendingResult(i10, intent, TLObject.FLAG_30);
        if (createPendingResult == null) {
            if (Log.isLoggable("AutoResolveHelper", 5)) {
                Log.w("AutoResolveHelper", "Null pending result returned when trying to deliver task result!");
            }
        } else {
            try {
                createPendingResult.send(i11);
            } catch (PendingIntent.CanceledException e6) {
                if (Log.isLoggable("AutoResolveHelper", 6)) {
                    Log.e("AutoResolveHelper", "Exception sending pending result", e6);
                }
            }
        }
    }
}
