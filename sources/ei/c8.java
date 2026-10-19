package ei;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
                j8.R(this.b);
                break;
            case 1:
                this.b.Y();
                break;
            default:
                j8 j8Var = this.b;
                org.telegram.ui.Cells.i3 i3Var = j8Var.Y;
                if (j8Var.isShowing()) {
                    i3Var.b.requestFocus();
                    AndroidUtilities.showKeyboard(i3Var.b);
                    break;
                }
                break;
        }
    }
}
