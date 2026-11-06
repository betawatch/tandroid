package aa;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class u {
    public final Context a;
    public final x b;
    public final q4.q c;
    public wf.b d;
    public wf.b e;
    public q f;
    public final b0 g;
    public final ga.d h;
    public final w9.a i;
    public final w9.a j;
    public final j k;
    public final x9.a l;
    public final uy m;
    public final ba.e n;

    public u(o9.g gVar, b0 b0Var, x9.a aVar, x xVar, w9.a aVar2, w9.a aVar3, ga.d dVar, j jVar, uy uyVar, ba.e eVar) {
        this.b = xVar;
        gVar.a();
        this.a = gVar.a;
        this.g = b0Var;
        this.l = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.h = dVar;
        this.k = jVar;
        this.m = uyVar;
        this.n = eVar;
        System.currentTimeMillis();
        this.c = new q4.q(4);
    }

    public final void a(ia.c cVar) {
        ba.e.a();
        ba.e.a();
        this.d.D();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.i.a(new a3.l(3));
                this.f.i();
                if (!cVar.b().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f.f(cVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f.j(((TaskCompletionSource) ((AtomicReference) cVar.i).get()).getTask());
                c();
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(ia.c cVar) {
        Future<?> submit = this.n.a.a.submit(new r(this, cVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        ba.e.a();
        try {
            wf.b bVar = this.d;
            ga.d dVar = (ga.d) bVar.c;
            String str = (String) bVar.b;
            dVar.getClass();
            if (new File((File) dVar.d, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
