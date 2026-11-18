package a2;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c extends FutureTask {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, b bVar) {
        super(bVar);
        this.a = aVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        a aVar = this.a;
        AtomicBoolean atomicBoolean = aVar.d;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            aVar.b(obj);
        } catch (InterruptedException e10) {
            Log.w("AsyncTask", e10);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            aVar.b(null);
        } catch (ExecutionException e11) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
        } catch (Throwable th2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th2);
        }
    }
}
