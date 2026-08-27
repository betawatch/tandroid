package lh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                org.telegram.ui.Cells.g3 g3Var = j8Var.U;
                if (j8Var.isShowing()) {
                    g3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(g3Var.b);
                    break;
                }
                break;
        }
    }
}
