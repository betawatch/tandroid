package e9;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q {
    public final Context a;
    public final t b;
    public final we.b c;
    public we.b d;
    public we.b e;
    public o f;
    public final x g;
    public final j9.c h;
    public final a9.a i;
    public final a9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.t l;
    public final k m;
    public final b9.b n;
    public final android.support.v4.media.c o;

    public q(s8.h hVar, x xVar, b9.b bVar, t tVar, a9.a aVar, a9.a aVar2, j9.c cVar, ExecutorService executorService, k kVar, android.support.v4.media.c cVar2) {
        this.b = tVar;
        hVar.a();
        this.a = hVar.a;
        this.g = xVar;
        this.n = bVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = executorService;
        this.h = cVar;
        this.l = new com.google.firebase.messaging.t(executorService);
        this.m = kVar;
        this.o = cVar2;
        System.currentTimeMillis();
        this.c = new we.b(25, (byte) 0);
    }

    public static Task a(q qVar, c3.h hVar) {
        Task forException;
        p pVar;
        com.google.firebase.messaging.t tVar = qVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) tVar.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        qVar.d.k();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                qVar.i.a(new a9.b(22));
                qVar.f.g();
                if (hVar.d().b.a) {
                    if (!qVar.f.d(hVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    forException = qVar.f.h(((TaskCompletionSource) ((AtomicReference) hVar.i).get()).getTask());
                    pVar = new p(qVar, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    pVar = new p(qVar, 0);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                forException = Tasks.forException(e10);
                pVar = new p(qVar, 0);
            }
            tVar.Q(pVar);
            return forException;
        } catch (Throwable th) {
            tVar.Q(new p(qVar, 0));
            throw th;
        }
    }

    public final void b(c3.h hVar) {
        Future<?> submit = this.k.submit(new androidx.biometric.j(5, this, hVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }
}
