package a9;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements j {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ e(h hVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit, int i10) {
        this.a = i10;
        this.b = hVar;
        this.c = runnable;
        this.d = j10;
        this.e = j11;
        this.f = timeUnit;
    }

    @Override // a9.j
    public final ScheduledFuture a(i iVar) {
        switch (this.a) {
            case 0:
                h hVar = this.b;
                return hVar.b.scheduleAtFixedRate(new f(hVar, this.c, iVar, 0), this.d, this.e, this.f);
            default:
                h hVar2 = this.b;
                return hVar2.b.scheduleWithFixedDelay(new f(hVar2, this.c, iVar, 2), this.d, this.e, this.f);
        }
    }
}
