package g9;

import ag.o1;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r {
    public final Context a;
    public final u b;
    public final l c;
    public l d;
    public l e;
    public p f;
    public final y g;
    public final l9.b h;
    public final c9.a i;
    public final c9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.s l;
    public final k m;
    public final d9.b n;
    public final o1 o;

    public r(u8.g gVar, y yVar, d9.b bVar, u uVar, c9.a aVar, c9.a aVar2, l9.b bVar2, ExecutorService executorService, k kVar, o1 o1Var) {
        this.b = uVar;
        gVar.a();
        this.a = gVar.a;
        this.g = yVar;
        this.n = bVar;
        this.i = aVar;
        this.j = aVar2;
        this.k = executorService;
        this.h = bVar2;
        this.l = new com.google.firebase.messaging.s(executorService);
        this.m = kVar;
        this.o = o1Var;
        System.currentTimeMillis();
        this.c = new l();
    }

    public static Task a(r rVar, e3.f fVar) {
        Task forException;
        q qVar;
        com.google.firebase.messaging.s sVar = rVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) sVar.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        rVar.d.j();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                rVar.i.b(new eg.c(14));
                rVar.f.g();
                if (fVar.d().b.a) {
                    if (!rVar.f.d(fVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    forException = rVar.f.h(((TaskCompletionSource) ((AtomicReference) fVar.i).get()).getTask());
                    qVar = new q(rVar, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    qVar = new q(rVar, 0);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                forException = Tasks.forException(e10);
                qVar = new q(rVar, 0);
            }
            sVar.Q(qVar);
            return forException;
        } catch (Throwable th2) {
            sVar.Q(new q(rVar, 0));
            throw th2;
        }
    }

    public final void b(e3.f fVar) {
        Future<?> submit = this.k.submit(new ab.o(this, fVar, false, 11));
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
