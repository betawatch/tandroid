package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.h5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t implements com.google.android.gms.common.api.o {
    public final /* synthetic */ h5 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ k c;

    public t(h5 h5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.a = h5Var;
        this.b = taskCompletionSource;
        this.c = kVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(l.l(status));
            return;
        }
        h5 h5Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) h5Var;
        l.i("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        l.i("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.e(basePendingResult.j()));
    }
}
