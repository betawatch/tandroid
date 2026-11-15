package aa;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class n implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ ia.c d;
    public final /* synthetic */ p e;

    public n(p pVar, long j3, Throwable th2, Thread thread, ia.c cVar) {
        this.e = pVar;
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
        p pVar = this.e;
        String g10 = pVar.g();
        if (g10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        pVar.c.r();
        e0 e0Var = pVar.m;
        e0Var.getClass();
        String concat = "Persisting fatal event for session ".concat(g10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        e0Var.g(this.b, this.c, "crash", new ca.c(g10, j10, hd.o.a), true);
        try {
            dVar = pVar.g;
            str = ".ae" + j3;
            dVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File((File) dVar.d, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        ia.c cVar = this.d;
        pVar.c(false, cVar, false);
        pVar.d(new e().a, Boolean.FALSE);
        return !pVar.b.a() ? Tasks.forResult(null) : ((TaskCompletionSource) ((AtomicReference) cVar.i).get()).getTask().onSuccessTask(pVar.e.a, new cb.c(this, g10));
    }
}
