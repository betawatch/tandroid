// default package

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class le7 extends FutureTask {
    public final /* synthetic */ nx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le7(nx nxVar, ke7 ke7Var) {
        super(ke7Var);
        this.a = nxVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        nx nxVar = this.a;
        AtomicBoolean atomicBoolean = nxVar.d;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            nxVar.b(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            nxVar.b(null);
        } catch (ExecutionException e2) {
            fyb.j("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            fyb.j("An error occurred while executing doInBackground()", th);
        }
    }
}
