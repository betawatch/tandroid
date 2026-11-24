// default package

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ng7 extends FutureTask {
    public final /* synthetic */ oy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng7(oy oyVar, mg7 mg7Var) {
        super(mg7Var);
        this.a = oyVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        oy oyVar = this.a;
        AtomicBoolean atomicBoolean = oyVar.d;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            oyVar.b(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            oyVar.b(null);
        } catch (ExecutionException e2) {
            rjb.k("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            rjb.k("An error occurred while executing doInBackground()", th);
        }
    }
}
