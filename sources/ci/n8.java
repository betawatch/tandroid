package ci;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                org.telegram.ui.Cells.i3 i3Var = u8Var.Y;
                if (u8Var.isShowing()) {
                    i3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.b);
                    break;
                }
                break;
        }
    }
}
