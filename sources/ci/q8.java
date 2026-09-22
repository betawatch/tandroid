package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ q8(x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x8.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                x8 x8Var = this.b;
                org.telegram.ui.Cells.k3 k3Var = x8Var.Y;
                if (x8Var.isShowing()) {
                    k3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(k3Var.b);
                    break;
                }
                break;
        }
    }
}
