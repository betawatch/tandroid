package ag;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;
    public final /* synthetic */ g1 c;

    public /* synthetic */ k0(n0 n0Var, g1 g1Var, int i10) {
        this.a = i10;
        this.b = n0Var;
        this.c = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(this.b, this.c, 1));
                break;
            default:
                n0 n0Var = this.b;
                n0Var.getClass();
                n0Var.i = this.c.a;
                break;
        }
    }
}
