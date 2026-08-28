package e9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ c3.h d;
    public final /* synthetic */ o e;

    public l(o oVar, long j10, Throwable th, Thread thread, c3.h hVar) {
        this.e = oVar;
        this.a = j10;
        this.b = th;
        this.c = thread;
        this.d = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        j9.c cVar;
        String str;
        long j10 = this.a;
        long j11 = j10 / 1000;
        o oVar = this.e;
        String e10 = oVar.e();
        if (e10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        oVar.c.k();
        com.google.firebase.messaging.m mVar = oVar.m;
        mVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e10);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        mVar.t(this.b, this.c, e10, "crash", j11, true);
        try {
            cVar = oVar.g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e11);
        }
        if (!new File(cVar.b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        c3.h hVar = this.d;
        oVar.c(false, hVar);
        new f(oVar.f);
        o.a(oVar, f.b, Boolean.FALSE);
        if (!oVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) oVar.e.b;
        return ((TaskCompletionSource) ((AtomicReference) hVar.i).get()).getTask().onSuccessTask(executor, new we.b(this, executor, e10));
    }
}
