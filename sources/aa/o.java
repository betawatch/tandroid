package aa;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class o implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ ia.c d;
    public final /* synthetic */ q e;

    public o(q qVar, long j3, Throwable th2, Thread thread, ia.c cVar) {
        this.e = qVar;
        this.a = j3;
        this.b = th2;
        this.c = thread;
        this.d = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ga.d dVar;
        String str;
        long j3 = this.a;
        long j10 = j3 / 1000;
        q qVar = this.e;
        String g10 = qVar.g();
        if (g10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        qVar.c.D();
        f0 f0Var = qVar.m;
        f0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(g10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        f0Var.g(this.b, this.c, "crash", new ca.c(g10, j10, hd.o.a), true);
        try {
            dVar = qVar.g;
            str = ".ae" + j3;
            dVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File((File) dVar.d, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ia.c cVar = this.d;
        qVar.c(false, cVar, false);
        qVar.d(new e().a, Boolean.FALSE);
        return !qVar.b.a() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).getTask().onSuccessTask(qVar.e.a, new cb.c(this, g10));
    }
}
