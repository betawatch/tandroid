package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import g7.p6;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j3.r0;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p implements j {
    public final Context a;
    public final o0.d b;
    public final v9.d c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public f7.w h;

    public p(Context context, o0.d dVar) {
        p6.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = dVar;
        this.c = q.d;
    }

    @Override // androidx.emoji2.text.j
    public final void a(f7.w wVar) {
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
            } catch (Throwable th) {
                throw th;
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
                this.f.execute(new af.e(this, 4));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o0.i d() {
        try {
            v9.d dVar = this.c;
            Context context = this.a;
            o0.d dVar2 = this.b;
            dVar.getClass();
            Object[] objArr = {dVar2};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            o0.h a2 = o0.c.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i9 = a2.a;
            if (i9 != 0) {
                throw new RuntimeException(r0.m(i9, "fetchFonts failed (", ")"));
            }
            o0.i[] iVarArr = (o0.i[]) a2.b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
