package nh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;
    public final /* synthetic */ b0 c;

    public /* synthetic */ l2(p2 p2Var, b0 b0Var, int i10) {
        this.a = i10;
        this.b = p2Var;
        this.c = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p2 p2Var = this.b;
                p2Var.getClass();
                AndroidUtilities.runOnUIThread(new l2(p2Var, this.c, 1), 320L);
                break;
            default:
                p2 p2Var2 = this.b;
                p2Var2.getClass();
                this.c.run(new b0(p2Var2, 2));
                break;
        }
    }
}
