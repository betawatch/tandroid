package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza;
    private kdd zzb = new kdd();
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

    public final void zza(int i, a4e a4eVar) {
        if (i == 3) {
            kdd kddVar = this.zzb;
            synchronized (kddVar.a) {
                long currentTimeMillis = System.currentTimeMillis();
                if (kddVar.b + 30000 > currentTimeMillis) {
                    if (Log.isLoggable("Vision", 2)) {
                        Log.v("Vision", "Skipping image analysis log due to rate limiting");
                        return;
                    }
                    return;
                }
                kddVar.b = currentTimeMillis;
            }
        }
        zza.execute(new jr((Object) this, i, (Object) a4eVar, (byte) 5));
    }
}
