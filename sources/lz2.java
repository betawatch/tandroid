// default package

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lz2 implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ ex8 d;
    public final /* synthetic */ nz2 e;

    public lz2(nz2 nz2Var, long j, Throwable th, Thread thread, ex8 ex8Var) {
        this.e = nz2Var;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = ex8Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j = this.a;
        long j2 = j / 1000;
        nz2 nz2Var = this.e;
        String e = nz2Var.e();
        if (e == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nz2Var.c.k();
        p8a p8aVar = nz2Var.m;
        String concat = "Persisting fatal event for session ".concat(e);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        p8aVar.g(this.b, this.c, "crash", new v54(e, j2, o34.a), true);
        try {
            if (!new File((File) nz2Var.g.c, ".ae" + j).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e2);
        }
        ex8 ex8Var = this.d;
        nz2Var.a(false, ex8Var, false);
        nz2Var.b(new q61().a, Boolean.FALSE);
        if (!nz2Var.b.a()) {
            return Tasks.forResult(null);
        }
        Task task = ((TaskCompletionSource) ((AtomicReference) ex8Var.h).get()).getTask();
        a13 a13Var = (a13) nz2Var.e.b;
        sz4 sz4Var = new sz4();
        sz4Var.a = this;
        return task.onSuccessTask(a13Var, sz4Var);
    }
}
