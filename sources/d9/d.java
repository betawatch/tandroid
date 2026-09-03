package d9;

import androidx.biometric.e0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public final ScheduledFuture a(e0 e0Var) {
        switch (this.a) {
            case 0:
                g gVar = this.b;
                return gVar.b.scheduleAtFixedRate(new e(gVar, this.c, e0Var, 0), this.d, this.e, this.f);
            default:
                g gVar2 = this.b;
                return gVar2.b.scheduleWithFixedDelay(new e(gVar2, this.c, e0Var, 2), this.d, this.e, this.f);
        }
    }
}
