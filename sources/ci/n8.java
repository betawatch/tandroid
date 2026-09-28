package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ n8(u8 u8Var, int i10) {
        this.a = i10;
        this.b = u8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u8.Q(this.b);
                break;
            case 1:
                this.b.X();
                break;
            default:
                u8 u8Var = this.b;
                org.telegram.ui.Cells.j3 j3Var = u8Var.Y;
                if (u8Var.isShowing()) {
                    j3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(j3Var.b);
                    break;
                }
                break;
        }
    }
}
