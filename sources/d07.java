// default package

import android.util.Pair;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class d07 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f07 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ ja6 d;
    public final /* synthetic */ jt6 e;

    public /* synthetic */ d07(f07 f07Var, Pair pair, ja6 ja6Var, jt6 jt6Var, byte b) {
        this.a = b;
        this.b = f07Var;
        this.c = pair;
        this.d = ja6Var;
        this.e = jt6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jt6 jt6Var = this.e;
        ja6 ja6Var = this.d;
        Pair pair = this.c;
        f07 f07Var = this.b;
        switch (b) {
            case 0:
                f07Var.b.i.s(((Integer) pair.first).intValue(), (vz6) pair.second, ja6Var, jt6Var);
                break;
            default:
                f07Var.b.i.u(((Integer) pair.first).intValue(), (vz6) pair.second, ja6Var, jt6Var);
                break;
        }
    }
}
