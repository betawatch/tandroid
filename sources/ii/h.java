package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y70 b;

    public /* synthetic */ h(y70 y70Var, int i10) {
        this.a = i10;
        this.b = y70Var;
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
                t70 t70Var = this.b.m;
                if (t70Var != null) {
                    AndroidUtilities.hideKeyboard(t70Var.getContentView());
                    break;
                }
                break;
            case 4:
                t70 t70Var2 = this.b.m;
                if (t70Var2 != null) {
                    AndroidUtilities.hideKeyboard(t70Var2.getContentView());
                    break;
                }
                break;
            case 5:
                t70 t70Var3 = this.b.m;
                if (t70Var3 != null) {
                    AndroidUtilities.hideKeyboard(t70Var3.getContentView());
                    break;
                }
                break;
            case 6:
                t70 t70Var4 = this.b.m;
                if (t70Var4 != null) {
                    AndroidUtilities.hideKeyboard(t70Var4.getContentView());
                    break;
                }
                break;
            case 7:
                t70 t70Var5 = this.b.m;
                if (t70Var5 != null) {
                    AndroidUtilities.hideKeyboard(t70Var5.getContentView());
                    break;
                }
                break;
            default:
                t70 t70Var6 = this.b.m;
                if (t70Var6 != null) {
                    AndroidUtilities.hideKeyboard(t70Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
