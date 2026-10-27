package o6;

import a8.z9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class t implements com.google.android.gms.common.api.o {
    public final /* synthetic */ z9 a;
    public final /* synthetic */ TaskCompletionSource b;
    public final /* synthetic */ k c;

    public t(z9 z9Var, TaskCompletionSource taskCompletionSource, k kVar) {
        this.a = z9Var;
        this.b = taskCompletionSource;
        this.c = kVar;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        if (!status.b()) {
            this.b.setException(l.m(status));
            return;
        }
        z9 z9Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) z9Var;
        l.j("Result has already been consumed.", !basePendingResult.j);
        try {
            if (!basePendingResult.d.await(0L, timeUnit)) {
                basePendingResult.e(Status.n);
            }
        } catch (InterruptedException unused) {
            basePendingResult.e(Status.f);
        }
        l.j("Result is not ready.", basePendingResult.g());
        this.b.setResult(this.c.f(basePendingResult.j()));
    }
}
