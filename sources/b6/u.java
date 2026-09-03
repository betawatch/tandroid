package b6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.o5;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u implements com.google.android.gms.common.api.o {
    public final /* synthetic */ o5 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ l c;

    public u(o5 o5Var, TaskCompletionSource taskCompletionSource, l lVar) {
        this.a = o5Var;
        this.b = taskCompletionSource;
        this.c = lVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.e()) {
            this.b.setException(m.m(status));
            return;
        }
        o5 o5Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) o5Var;
        m.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        m.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.f(basePendingResult.j()));
    }
}
