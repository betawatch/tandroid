package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;
    public final /* synthetic */ bi.o1 c;

    public /* synthetic */ u2(y2 y2Var, bi.o1 o1Var, int i10) {
        this.a = i10;
        this.b = y2Var;
        this.c = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y2 y2Var = this.b;
                y2Var.getClass();
                AndroidUtilities.runOnUIThread(new u2(y2Var, this.c, 1), 320L);
                break;
            default:
                y2 y2Var2 = this.b;
                y2Var2.getClass();
                this.c.run(new bi.o1(y2Var2, 8));
                break;
        }
    }
}
