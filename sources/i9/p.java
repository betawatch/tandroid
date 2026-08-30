package i9;

import android.content.Context;
import android.util.Log;
import androidx.biometric.f0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class p {
    public final Context a;
    public final s b;
    public final f7.b c;
    public f7.b d;
    public f7.b e;
    public n f;
    public final w g;
    public final n9.b h;
    public final e9.a i;
    public final e9.a j;
    public final ExecutorService k;
    public final com.google.firebase.messaging.r l;
    public final k m;
    public final f9.a n;
    public final f0 o;

    public p(w8.g gVar, w wVar, f9.a aVar, s sVar, e9.a aVar2, e9.a aVar3, n9.b bVar, ExecutorService executorService, k kVar, f0 f0Var) {
        this.b = sVar;
        gVar.a();
        this.a = gVar.a;
        this.g = wVar;
        this.n = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = executorService;
        this.h = bVar;
        this.l = new com.google.firebase.messaging.r(executorService);
        this.m = kVar;
        this.o = f0Var;
        System.currentTimeMillis();
        this.c = new f7.b(15, (byte) 0);
    }

    public static Task a(p pVar, e3.g gVar) {
        Task forException;
        o oVar;
        com.google.firebase.messaging.r rVar = pVar.l;
        if (!Boolean.TRUE.equals(((ThreadLocal) rVar.e).get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        pVar.d.n();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                pVar.i.a(new f0.d(19));
                pVar.f.g();
                if (gVar.d().b.a) {
                    if (!pVar.f.d(gVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    forException = pVar.f.h(((TaskCompletionSource) ((AtomicReference) gVar.i).get()).getTask());
                    oVar = new o(pVar, 0);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    oVar = new o(pVar, 0);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                forException = Tasks.forException(e);
                oVar = new o(pVar, 0);
            }
            rVar.V(oVar);
            return forException;
        } catch (Throwable th2) {
            rVar.V(new o(pVar, 0));
            throw th2;
        }
    }

    public final void b(e3.g gVar) {
        Future<?> submit = this.k.submit(new androidx.biometric.k(16, this, gVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e6) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e6);
        } catch (TimeoutException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e10);
        }
    }
}
