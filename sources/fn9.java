// default package

import android.os.Handler;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ on9 b;
    public final /* synthetic */ cp9 c;
    public final /* synthetic */ long d;

    public /* synthetic */ fn9(on9 on9Var, cp9 cp9Var, long j, byte b) {
        this.a = b;
        this.b = on9Var;
        this.c = cp9Var;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                on9 on9Var = this.b;
                on9Var.c.post(new fn9(on9Var, this.c, this.d, (byte) 1));
                break;
            default:
                on9 on9Var2 = this.b;
                cp9 cp9Var = this.c;
                long j = this.d;
                if (on9Var2.U && on9Var2.F == cp9Var) {
                    on9Var2.j.b("camera switch first preview frame: path=DUAL_ACTIVE, totalElapsedMs=" + on9.x(j));
                    jp9 jp9Var = (jp9) on9Var2.k.b;
                    Handler handler = jp9Var.i;
                    kj4 kj4Var = jp9Var.d;
                    Objects.requireNonNull(kj4Var);
                    handler.post(new v59(kj4Var, (byte) 17));
                    break;
                }
                break;
        }
    }
}
