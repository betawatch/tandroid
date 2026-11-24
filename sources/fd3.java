// default package

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class fd3 implements jd3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id3 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ fd3(id3 id3Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, byte b) {
        this.a = b;
        this.b = id3Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // jd3
    public final ScheduledFuture a(l69 l69Var) {
        byte b = this.a;
        Runnable runnable = this.c;
        id3 id3Var = this.b;
        switch (b) {
            case 0:
                return id3Var.b.scheduleAtFixedRate(new gd3(id3Var, runnable, l69Var, (byte) 0), this.d, this.e, this.f);
            default:
                return id3Var.b.scheduleWithFixedDelay(new gd3(id3Var, runnable, l69Var, (byte) 2), this.d, this.e, this.f);
        }
    }
}
