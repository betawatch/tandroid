package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y2 b;
    public final /* synthetic */ ai.y1 c;

    public /* synthetic */ u2(y2 y2Var, ai.y1 y1Var, int i10) {
        this.a = i10;
        this.b = y2Var;
        this.c = y1Var;
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
                this.c.run(new ai.y1(y2Var2, 8));
                break;
        }
    }
}
