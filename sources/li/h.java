package li;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l80 b;

    public /* synthetic */ h(l80 l80Var, int i10) {
        this.a = i10;
        this.b = l80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                this.b.s();
                break;
            case 2:
                this.b.s();
                break;
            case 3:
                g80 g80Var = this.b.m;
                if (g80Var != null) {
                    AndroidUtilities.hideKeyboard(g80Var.getContentView());
                    break;
                }
                break;
            case 4:
                g80 g80Var2 = this.b.m;
                if (g80Var2 != null) {
                    AndroidUtilities.hideKeyboard(g80Var2.getContentView());
                    break;
                }
                break;
            case 5:
                g80 g80Var3 = this.b.m;
                if (g80Var3 != null) {
                    AndroidUtilities.hideKeyboard(g80Var3.getContentView());
                    break;
                }
                break;
            case 6:
                g80 g80Var4 = this.b.m;
                if (g80Var4 != null) {
                    AndroidUtilities.hideKeyboard(g80Var4.getContentView());
                    break;
                }
                break;
            case 7:
                g80 g80Var5 = this.b.m;
                if (g80Var5 != null) {
                    AndroidUtilities.hideKeyboard(g80Var5.getContentView());
                    break;
                }
                break;
            default:
                g80 g80Var6 = this.b.m;
                if (g80Var6 != null) {
                    AndroidUtilities.hideKeyboard(g80Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
