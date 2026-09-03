package i9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ e3.g d;
    public final /* synthetic */ n e;

    public l(n nVar, long j10, Throwable th2, Thread thread, e3.g gVar) {
        this.e = nVar;
        this.a = j10;
        this.b = th2;
        this.c = thread;
        this.d = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        n9.b bVar;
        String str;
        long j10 = this.a;
        long j11 = j10 / 1000;
        n nVar = this.e;
        String e6 = nVar.e();
        if (e6 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        nVar.c.n();
        a9.a aVar = nVar.m;
        aVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e6);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        aVar.t(this.b, this.c, e6, "crash", j11, true);
        try {
            bVar = nVar.g;
            str = ".ae" + j10;
            bVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(bVar.b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        e3.g gVar = this.d;
        nVar.c(false, gVar);
        new f(nVar.f);
        n.a(nVar, f.b, Boolean.FALSE);
        if (!nVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) nVar.e.b;
        return ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).getTask().onSuccessTask(executor, new f7.b(this, executor, e6));
    }
}
