// default package

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class cn5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dn5 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ cn5(dn5 dn5Var, long j, long j2, byte b) {
        this.a = b;
        this.b = dn5Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dn5 dn5Var = this.b;
                ConcurrentHashMap concurrentHashMap = dn5Var.h.u;
                String str = dn5Var.a.e;
                long j = this.c;
                long j2 = this.d;
                concurrentHashMap.put(str, new long[]{j, j2});
                hl.c3(new cn5(dn5Var, j, j2, (byte) 1));
                break;
            default:
                wm5 wm5Var = this.b.a;
                jn7.f(wm5Var.o).k(jn7.X1, wm5Var.e, Long.valueOf(this.c), Long.valueOf(this.d));
                break;
        }
    }
}
