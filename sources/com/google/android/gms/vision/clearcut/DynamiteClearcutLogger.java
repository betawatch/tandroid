package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza;
    private ibd zzb = new ibd();
    private VisionClearcutLogger zzc;

    static {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), defaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i, x1e x1eVar) {
        if (i == 3) {
            ibd ibdVar = this.zzb;
            synchronized (ibdVar.a) {
                long currentTimeMillis = System.currentTimeMillis();
                if (ibdVar.b + 30000 > currentTimeMillis) {
                    if (Log.isLoggable("Vision", 2)) {
                        Log.v("Vision", "Skipping image analysis log due to rate limiting");
                        return;
                    }
                    return;
                }
                ibdVar.b = currentTimeMillis;
            }
        }
        zza.execute(new jq((Object) this, i, (Object) x1eVar, (byte) 5));
    }
}
