package f9;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q {
    public final Context a;
    public final t b;
    public final xe.b c;
    public xe.b d;
    public xe.b e;
    public o f;
    public final x g;
    public final k9.c h;
    public final b9.a i;
    public final b9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.t l;
    public final k m;
    public final c9.a n;
    public final ga.c o;

    public q(t8.h hVar, x xVar, c9.a aVar, t tVar, b9.a aVar2, b9.a aVar3, k9.c cVar, ExecutorService executorService, k kVar, ga.c cVar2) {
        this.b = tVar;
        hVar.a();
        this.a = hVar.a;
        this.g = xVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = cVar;
        this.l = new com.google.firebase.messaging.t(executorService);
        this.m = kVar;
        this.o = cVar2;
        System.currentTimeMillis();
        this.c = new xe.b(28, (byte) 0);
    }

    public static Task a(q qVar, c3.g gVar) {
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
                qVar.i.a(new a9.m(29));
                qVar.f.g();
                if (gVar.d().b.a) {
                    if (!qVar.f.d(gVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    forException = qVar.f.h(((TaskCompletionSource) ((AtomicReference) gVar.i).get()).getTask());
                    pVar = new p(qVar, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    pVar = new p(qVar, 0);
                }
            } catch (Exception e9) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e9);
                forException = Tasks.forException(e9);
                pVar = new p(qVar, 0);
            }
            tVar.Q(pVar);
            return forException;
        } catch (Throwable th) {
            tVar.Q(new p(qVar, 0));
            throw th;
        }
    }

    public final void b(c3.g gVar) {
        Future<?> submit = this.k.submit(new a9.o(7, this, gVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e9) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e9);
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }
}
