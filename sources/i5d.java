// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class i5d implements d58 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ e58 c;

    public i5d(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, e58 e58Var) {
        this.a = basePendingResult;
        this.b = taskCompletionSource;
        this.c = e58Var;
    }

    @Override // d58
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(dod.a(status));
            return;
        }
        BasePendingResult basePendingResult = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ite.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        ite.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.n0(basePendingResult.j()));
    }
}
