package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;

    public /* synthetic */ c8(j8 j8Var, int i10) {
        this.a = i10;
        this.b = j8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                j8 j8Var = this.b;
                org.telegram.ui.Cells.h3 h3Var = j8Var.Y;
                if (j8Var.isShowing()) {
                    h3Var.d.requestFocus();
                    AndroidUtilities.showKeyboard(h3Var.d);
                    break;
                }
                break;
        }
    }
}
