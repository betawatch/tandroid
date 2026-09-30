package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.v70;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a80 b;

    public /* synthetic */ h(a80 a80Var, int i10) {
        this.a = i10;
        this.b = a80Var;
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
                v70 v70Var = this.b.m;
                if (v70Var != null) {
                    AndroidUtilities.hideKeyboard(v70Var.getContentView());
                    break;
                }
                break;
            case 4:
                v70 v70Var2 = this.b.m;
                if (v70Var2 != null) {
                    AndroidUtilities.hideKeyboard(v70Var2.getContentView());
                    break;
                }
                break;
            case 5:
                v70 v70Var3 = this.b.m;
                if (v70Var3 != null) {
                    AndroidUtilities.hideKeyboard(v70Var3.getContentView());
                    break;
                }
                break;
            case 6:
                v70 v70Var4 = this.b.m;
                if (v70Var4 != null) {
                    AndroidUtilities.hideKeyboard(v70Var4.getContentView());
                    break;
                }
                break;
            case 7:
                v70 v70Var5 = this.b.m;
                if (v70Var5 != null) {
                    AndroidUtilities.hideKeyboard(v70Var5.getContentView());
                    break;
                }
                break;
            default:
                v70 v70Var6 = this.b.m;
                if (v70Var6 != null) {
                    AndroidUtilities.hideKeyboard(v70Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
