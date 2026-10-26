package fi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ y7(f8 f8Var, int i10) {
        this.a = i10;
        this.b = f8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f8.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                f8 f8Var = this.b;
                org.telegram.ui.Cells.g3 g3Var = f8Var.Y;
                if (f8Var.isShowing()) {
                    g3Var.d.requestFocus();
                    AndroidUtilities.showKeyboard(g3Var.d);
                    break;
                }
                break;
        }
    }
}
