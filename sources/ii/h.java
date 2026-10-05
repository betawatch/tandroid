package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b80 b;

    public /* synthetic */ h(b80 b80Var, int i10) {
        this.a = i10;
        this.b = b80Var;
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
                w70 w70Var = this.b.m;
                if (w70Var != null) {
                    AndroidUtilities.hideKeyboard(w70Var.getContentView());
                    break;
                }
                break;
            case 4:
                w70 w70Var2 = this.b.m;
                if (w70Var2 != null) {
                    AndroidUtilities.hideKeyboard(w70Var2.getContentView());
                    break;
                }
                break;
            case 5:
                w70 w70Var3 = this.b.m;
                if (w70Var3 != null) {
                    AndroidUtilities.hideKeyboard(w70Var3.getContentView());
                    break;
                }
                break;
            case 6:
                w70 w70Var4 = this.b.m;
                if (w70Var4 != null) {
                    AndroidUtilities.hideKeyboard(w70Var4.getContentView());
                    break;
                }
                break;
            case 7:
                w70 w70Var5 = this.b.m;
                if (w70Var5 != null) {
                    AndroidUtilities.hideKeyboard(w70Var5.getContentView());
                    break;
                }
                break;
            default:
                w70 w70Var6 = this.b.m;
                if (w70Var6 != null) {
                    AndroidUtilities.hideKeyboard(w70Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
