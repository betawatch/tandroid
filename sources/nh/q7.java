package nh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;

    public /* synthetic */ q7(y7 y7Var, int i10) {
        this.a = i10;
        this.b = y7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y7.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                y7 y7Var = this.b;
                org.telegram.ui.Cells.g3 g3Var = y7Var.U;
                if (y7Var.isShowing()) {
                    g3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(g3Var.b);
                    break;
                }
                break;
        }
    }
}
