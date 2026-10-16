package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ m8(t8 t8Var, int i10) {
        this.a = i10;
        this.b = t8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t8.R(this.b);
                break;
            case 1:
                this.b.Y();
                break;
            default:
                t8 t8Var = this.b;
                org.telegram.ui.Cells.j3 j3Var = t8Var.Y;
                if (t8Var.isShowing()) {
                    j3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.b);
                    break;
                }
                break;
        }
    }
}
