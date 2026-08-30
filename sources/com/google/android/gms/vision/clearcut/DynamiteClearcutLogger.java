package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import androidx.activity.g;
import com.google.android.gms.internal.vision.f0;
import g8.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza;
    private a zzb = new a();
    private VisionClearcutLogger zzc;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i10, f0 f0Var) {
        if (i10 == 3) {
            a aVar = this.zzb;
            synchronized (aVar.b) {
                long currentTimeMillis = System.currentTimeMillis();
                if (aVar.c + aVar.a > currentTimeMillis) {
                    if (Log.isLoggable("Vision", 2)) {
                        Log.v("Vision", "Skipping image analysis log due to rate limiting");
                        return;
                    }
                    return;
                }
                aVar.c = currentTimeMillis;
            }
        }
        zza.execute(new g(this, i10, f0Var, 5));
    }
}
