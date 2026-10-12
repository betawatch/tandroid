package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2 b;
    public final /* synthetic */ bi.o1 c;

    public /* synthetic */ s2(w2 w2Var, bi.o1 o1Var, int i10) {
        this.a = i10;
        this.b = w2Var;
        this.c = o1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w2 w2Var = this.b;
                w2Var.getClass();
                AndroidUtilities.runOnUIThread(new s2(w2Var, this.c, 1), 320L);
                break;
            default:
                w2 w2Var2 = this.b;
                w2Var2.getClass();
                this.c.run(new bi.o1(w2Var2, 8));
                break;
        }
    }
}
