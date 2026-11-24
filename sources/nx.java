// default package

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class nx implements Runnable {
    public static Handler f;
    public final /* synthetic */ v3d e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final le7 a = new le7(this, new ke7(this, 0));

    public nx(v3d v3dVar) {
        this.e = v3dVar;
    }

    public final void a() {
        v3d v3dVar = this.e;
        Iterator it = v3dVar.j.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((gy4) it.next()).a(v3dVar)) {
                i++;
            }
        }
        try {
            v3dVar.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (nx.class) {
            handler = f;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                f = handler;
            }
        }
        handler.post(new rld((Object) this, obj, false, (byte) 7));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.a();
    }
}
