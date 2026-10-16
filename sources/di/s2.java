package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
