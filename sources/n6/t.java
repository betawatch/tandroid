package n6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import v7.g5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class t implements com.google.android.gms.common.api.o {
    public final /* synthetic */ g5 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ k c;

    public t(g5 g5Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.a = g5Var;
        this.b = taskCompletionSource;
        this.c = kVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(l.m(status));
            return;
        }
        g5 g5Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) g5Var;
        l.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        l.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.b(basePendingResult.j()));
    }
}
