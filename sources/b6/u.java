package b6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.q5;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class u implements com.google.android.gms.common.api.o {
    public final /* synthetic */ q5 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ l c;

    public u(q5 q5Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.a = q5Var;
        this.b = taskCompletionSource;
        this.c = lVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.e()) {
            this.b.setException(m.m(status));
            return;
        }
        q5 q5Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) q5Var;
        m.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        m.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.J(basePendingResult.j()));
    }
}
