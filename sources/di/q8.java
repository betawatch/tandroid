package di;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                org.telegram.ui.Cells.i3 i3Var = x8Var.Y;
                if (x8Var.isShowing()) {
                    i3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.b);
                    break;
                }
                break;
        }
    }
}
