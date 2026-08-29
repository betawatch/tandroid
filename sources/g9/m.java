package g9;

import android.util.Log;
import bg.c2;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ e3.f d;
    public final /* synthetic */ p e;

    public m(p pVar, long j10, Throwable th2, Thread thread, e3.f fVar) {
        this.e = pVar;
        this.a = j10;
        this.b = th2;
        this.c = thread;
        this.d = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        l9.b bVar;
        String str;
        long j10 = this.a;
        long j11 = j10 / 1000;
        p pVar = this.e;
        String e10 = pVar.e();
        if (e10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        pVar.c.j();
        c2 c2Var = pVar.m;
        c2Var.getClass();
        String concat = "Persisting fatal event for session ".concat(e10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        c2Var.t(this.b, this.c, e10, "crash", j11, true);
        try {
            bVar = pVar.g;
            str = ".ae" + j10;
            bVar.getClass();
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e11);
        }
        if (!new File(bVar.b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        e3.f fVar = this.d;
        pVar.c(false, fVar);
        new f(pVar.f);
        p.a(pVar, f.b, Boolean.FALSE);
        if (!pVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) pVar.e.b;
        return ((TaskCompletionSource) ((AtomicReference) fVar.i).get()).getTask().onSuccessTask(executor, new l(this, executor, e10));
    }
}
