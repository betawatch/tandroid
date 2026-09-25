package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;
    public final /* synthetic */ ai.y1 c;

    public /* synthetic */ t2(x2 x2Var, ai.y1 y1Var, int i10) {
        this.a = i10;
        this.b = x2Var;
        this.c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x2 x2Var = this.b;
                x2Var.getClass();
                AndroidUtilities.runOnUIThread(new t2(x2Var, this.c, 1), 320L);
                break;
            default:
                x2 x2Var2 = this.b;
                x2Var2.getClass();
                this.c.run(new ai.y1(x2Var2, 8));
                break;
        }
    }
}
