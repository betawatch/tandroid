package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
