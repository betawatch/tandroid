package f9;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class l implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ c3.g d;
    public final /* synthetic */ o e;

    public l(o oVar, long j10, Throwable th, Thread thread, c3.g gVar) {
        this.e = oVar;
        this.a = j10;
        this.b = th;
        this.c = thread;
        this.d = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        k9.c cVar;
        String str;
        long j10 = this.a;
        long j11 = j10 / 1000;
        o oVar = this.e;
        String e9 = oVar.e();
        if (e9 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        oVar.c.k();
        com.google.firebase.messaging.m mVar = oVar.m;
        mVar.getClass();
        String concat = "Persisting fatal event for session ".concat(e9);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", concat, null);
        }
        mVar.t(this.b, this.c, e9, "crash", j11, true);
        try {
            cVar = oVar.g;
            str = ".ae" + j10;
            cVar.getClass();
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
        if (!new File(cVar.b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        c3.g gVar = this.d;
        oVar.c(false, gVar);
        new f(oVar.f);
        o.a(oVar, f.b, Boolean.FALSE);
        if (!oVar.b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) oVar.e.b;
        return ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).getTask().onSuccessTask(executor, new xe.b(this, executor, e9));
    }
}
