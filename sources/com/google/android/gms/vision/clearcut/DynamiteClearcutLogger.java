package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import androidx.activity.g;
import com.google.android.gms.internal.vision.f0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v8.a;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    public final void zza(int i7, f0 f0Var) {
        if (i7 == 3) {
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
        zza.execute(new g(this, i7, f0Var, 7));
    }
}
