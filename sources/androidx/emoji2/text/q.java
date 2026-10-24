package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import i2.o1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w7.k6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class q implements k {
    public final Context a;
    public final o0.d b;
    public final sb.a c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public v7.t h;

    public q(Context context, o0.d dVar) {
        k6.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = dVar;
        this.c = r.d;
    }

    @Override // androidx.emoji2.text.k
    public final void a(v7.t tVar) {
        synchronized (this.d) {
            this.h = tVar;
        }
        c();
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.h = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.h == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.g = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new a3.d(this, 29));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o0.h d() {
        try {
            sb.a aVar = this.c;
            Context context = this.a;
            o0.d dVar = this.b;
            aVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            j4.f a2 = o0.c.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i10 = a2.a;
            if (i10 != 0) {
                throw new RuntimeException(o1.l(i10, "fetchFonts failed (", ")"));
            }
            o0.h[] hVarArr = (o0.h[]) a2.b.get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
