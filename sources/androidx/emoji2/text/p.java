package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import hg.k0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import w7.o6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class p implements k {
    public final Context a;
    public final o0.e b;
    public final t7.u c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor h;
    public v7.w n;

    public p(Context context, o0.e eVar) {
        o6.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = eVar;
        this.c = q.d;
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
    public final void b(v7.w wVar) {
        synchronized (this.d) {
            this.n = wVar;
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
                this.f.execute(new a3.d(this, 28));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o0.i d() {
        try {
            t7.u uVar = this.c;
            Context context = this.a;
            o0.e eVar = this.b;
            uVar.getClass();
            Object[] objArr = {eVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            j4.f a2 = o0.d.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i10 = a2.a;
            if (i10 != 0) {
                throw new RuntimeException(k0.i(i10, "fetchFonts failed (", ")"));
            }
            o0.i[] iVarArr = (o0.i[]) a2.b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
