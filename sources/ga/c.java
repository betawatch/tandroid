package ga;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k5.d;
import n5.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final r h;
    public final ua.b i;
    public int j;
    public long k;

    public c(r rVar, ha.b bVar, ua.b bVar2) {
        double d = bVar.d;
        double d10 = bVar.e;
        this.a = d;
        this.b = d10;
        this.c = bVar.f * 1000;
        this.h = rVar;
        this.i = bVar2;
        this.d = SystemClock.elapsedRealtime();
        int i3 = (int) d;
        this.e = i3;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i3);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int min = this.f.size() == this.e ? Math.min(100, this.j + currentTimeMillis) : Math.max(0, this.j - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(z9.b bVar, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.a(new k5.a(null, bVar.a, d.c, null), new b(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.d < 2000, bVar, 0));
    }
}
