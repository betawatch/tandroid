// default package

import android.util.Pair;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
