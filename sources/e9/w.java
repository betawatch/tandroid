package e9;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w extends d {
    public final /* synthetic */ String a;
    public final /* synthetic */ ExecutorService b;

    public w(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = str;
        this.b = executorService;
    }

    @Override // e9.d
    public final void a() {
        String str = this.a;
        ExecutorService executorService = this.b;
        try {
            String concat = "Executing shutdown hook for ".concat(str);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", concat, null);
            }
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            String concat2 = str.concat(" did not shut down in the allocated time. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", concat2, null);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            String o6 = aa.d.o("Interrupted while waiting for ", str, " to shut down. Requesting immediate shutdown.");
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", o6, null);
            }
            executorService.shutdownNow();
        }
    }
}
