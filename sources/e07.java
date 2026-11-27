// default package

import android.util.Pair;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class e07 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f07 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ e07(f07 f07Var, Pair pair, byte b) {
        this.a = b;
        this.b = f07Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Pair pair = this.c;
        f07 f07Var = this.b;
        switch (b) {
            case 0:
                f07Var.b.i.I(((Integer) pair.first).intValue(), (vz6) pair.second);
                break;
            default:
                f07Var.b.i.y(((Integer) pair.first).intValue(), (vz6) pair.second);
                break;
        }
    }
}
