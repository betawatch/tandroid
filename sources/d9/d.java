package d9;

import androidx.biometric.f0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements h {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.a = i10;
        this.b = gVar;
        this.c = runnable;
        this.d = j10;
        this.e = j11;
        this.f = timeUnit;
    }

    @Override // d9.h
    public final ScheduledFuture a(f0 f0Var) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                return gVar.b.scheduleAtFixedRate(new e(gVar, this.c, f0Var, 0), this.d, this.e, this.f);
            default:
                g gVar2 = this.b;
                return gVar2.b.scheduleWithFixedDelay(new e(gVar2, this.c, f0Var, 2), this.d, this.e, this.f);
        }
    }
}
