package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import b8.w0;
import com.google.android.gms.internal.play_billing.s1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r implements k {
    public final Context a;
    public final o0.e b;
    public final ra.e c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor h;
    public w0 n;

    public r(Context context, o0.e eVar) {
        s1.a(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = eVar;
        this.c = s.d;
    }

    @Override // androidx.emoji2.text.k
    public final void a(w0 w0Var) {
        synchronized (this.d) {
            this.n = w0Var;
        }
        c();
    }

    public final void b() {
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
                this.f.execute(new ai.s(this, 10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o0.i d() {
        try {
            ra.e eVar = this.c;
            Context context = this.a;
            o0.e eVar2 = this.b;
            eVar.getClass();
            Object[] objArr = {eVar2};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            l4.f a10 = o0.d.a(context, DesugarCollections.unmodifiableList(arrayList));
            int i3 = a10.a;
            if (i3 != 0) {
                throw new RuntimeException(p1.j(i3, "fetchFonts failed (", ")"));
            }
            o0.i[] iVarArr = (o0.i[]) a10.b.get(0);
            if (iVarArr == null || iVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iVarArr[0];
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("provider not found", e10);
        }
    }
}
