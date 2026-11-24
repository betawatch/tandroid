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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class l80 {
    public static final long a = SystemClock.elapsedRealtime();
    public static final /* synthetic */ int b = 0;

    public static void a(Task task, Activity activity) {
        fjd fjdVar = new fjd();
        int incrementAndGet = fjd.f.incrementAndGet();
        fjdVar.a = incrementAndGet;
        fjd.e.put(incrementAndGet, fjdVar);
        fjd.d.postDelayed(fjdVar, 600000L);
        task.addOnCompleteListener(fjdVar);
        FragmentTransaction beginTransaction = activity.getFragmentManager().beginTransaction();
        int i = fjdVar.a;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i);
        bundle.putInt("requestCode", 991);
        bundle.putLong("initializationElapsedRealtime", a);
        jpd jpdVar = new jpd();
        jpdVar.setArguments(bundle);
        int i2 = fjdVar.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i2);
        beginTransaction.add(jpdVar, sb.toString()).commit();
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
