package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                t8.O(this.b);
                break;
            case 1:
                this.b.W();
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
