package ea;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import j5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m5.s;
import y9.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final s h;
    public final l i;
    public int j;
    public long k;

    public c(s sVar, fa.a aVar, l lVar) {
        double d = aVar.d;
        double d10 = aVar.e;
        this.a = d;
        this.b = d10;
        this.c = aVar.f * 1000;
        this.h = sVar;
        this.i = lVar;
        this.d = SystemClock.elapsedRealtime();
        int i10 = (int) d;
        this.e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
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

    public final void b(y9.b bVar, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.a(new j5.a(null, bVar.a, d.c, null), new b(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.d < 2000, bVar, 0));
    }
}
