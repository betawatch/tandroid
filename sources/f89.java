// default package

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f89 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final h1c h;
    public final sk4 i;
    public int j;
    public long k;

    public f89(h1c h1cVar, q7a q7aVar, sk4 sk4Var) {
        double d = q7aVar.d;
        double d2 = q7aVar.e;
        this.a = d;
        this.b = d2;
        this.c = q7aVar.f * 1000;
        this.h = h1cVar;
        this.i = sk4Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
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
        int size = this.f.size();
        int i = this.j;
        int min = size == this.e ? Math.min(100, i + currentTimeMillis) : Math.max(0, i - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(b80 b80Var, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + b80Var.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.a(new n90(null, b80Var.a, cj8.c, null), new xf((Object) this, (Object) taskCompletionSource, SystemClock.elapsedRealtime() - this.d < 2000, (Object) b80Var, (byte) 6));
    }
}
