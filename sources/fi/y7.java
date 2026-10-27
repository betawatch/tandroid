package fi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
