package da;

import android.os.SystemClock;
import android.util.Log;
import bi.o4;
import com.google.android.gms.tasks.TaskCompletionSource;
import ea.c;
import i5.d;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l5.r;
import x7.g8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final r h;
    public final g8 i;
    public int j;
    public long k;

    public b(r rVar, c cVar, g8 g8Var) {
        double d = cVar.d;
        double d10 = cVar.e;
        this.a = d;
        this.b = d10;
        this.c = cVar.f * 1000;
        this.h = rVar;
        this.i = g8Var;
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

    public final void b(x9.b bVar, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.a(new i5.a(null, bVar.a, d.c, null), new o4(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.d < 2000, bVar, 1));
    }
}
