package a2;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.m;
import d6.d;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import m9.u;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public static Handler f;
    public final /* synthetic */ d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final c a = new c(this, new b(this, 0));

    public a(d dVar) {
        this.e = dVar;
    }

    public final void a() {
        d dVar = this.e;
        Iterator it = dVar.j.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (((m) it.next()).b(dVar)) {
                i7++;
            }
        }
        try {
            dVar.i.tryAcquire(i7, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        handler.post(new u(this, obj, false, 1));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b();
    }
}
