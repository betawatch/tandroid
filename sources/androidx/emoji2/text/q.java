package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class q implements k {
    public final Context a;
    public final o0.d b;
    public final cb.b c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public j7.t h;

    public q(Context context, o0.d dVar) {
        k6.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = dVar;
        this.c = r.d;
    }

    @Override // androidx.emoji2.text.k
    public final void a(j7.t tVar) {
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
                this.f.execute(new ag.e(this, 4));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o0.i d() {
        try {
            cb.b bVar = this.c;
            Context context = this.a;
            o0.d dVar = this.b;
            bVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            b4.f a2 = o0.c.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i10 = a2.a;
            if (i10 != 0) {
                throw new RuntimeException(l.d.k(i10, "fetchFonts failed (", ")"));
            }
            o0.i[] iVarArr = (o0.i[]) a2.b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("provider not found", e6);
        }
    }
}
