package androidx.emoji2.text;

import a8.t6;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import c8.pb;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class q implements k {
    public final Context a;
    public final o0.d b;
    public final pb.b c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor h;
    public t6 n;

    public q(Context context, o0.d dVar) {
        pb.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = dVar;
        this.c = r.d;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.n = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.h;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.h = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.emoji2.text.k
    public final void b(t6 t6Var) {
        synchronized (this.d) {
            this.n = t6Var;
        }
        c();
    }

    public final void c() {
        synchronized (this.d) {
            try {
                if (this.n == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat", 0));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.h = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new a3.f(this, 8));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o0.h d() {
        try {
            pb.b bVar = this.c;
            Context context = this.a;
            o0.d dVar = this.b;
            bVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            m4.f a10 = o0.c.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i7 = a10.a;
            if (i7 != 0) {
                throw new RuntimeException(jg.g.k(i7, "fetchFonts failed (", ")"));
            }
            o0.h[] hVarArr = (o0.h[]) a10.b.get(0);
            if (hVarArr == null || hVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return hVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
