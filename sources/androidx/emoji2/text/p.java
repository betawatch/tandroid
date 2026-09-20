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
import w7.p6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class p implements k {
    public final Context a;
    public final o0.d b;
    public final t7.u c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public v7.w h;

    public p(Context context, o0.d dVar) {
        p6.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = dVar;
        this.c = q.d;
    }

    @Override // androidx.emoji2.text.k
    public final void a(v7.w wVar) {
        synchronized (this.d) {
            this.h = wVar;
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
                this.f.execute(new a3.d(this, 28));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o0.h d() {
        try {
            t7.u uVar = this.c;
            Context context = this.a;
            o0.d dVar = this.b;
            uVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            j4.f a2 = o0.c.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i10 = a2.a;
            if (i10 != 0) {
                throw new RuntimeException(k0.i(i10, "fetchFonts failed (", ")"));
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
