package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.w60;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;

    public /* synthetic */ m3(b70 b70Var, int i10) {
        this.a = i10;
        this.b = b70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                w60 w60Var = this.b.m;
                if (w60Var != null) {
                    AndroidUtilities.hideKeyboard(w60Var.getContentView());
                    break;
                }
                break;
            case 2:
                w60 w60Var2 = this.b.m;
                if (w60Var2 != null) {
                    AndroidUtilities.hideKeyboard(w60Var2.getContentView());
                    break;
                }
                break;
            case 3:
                w60 w60Var3 = this.b.m;
                if (w60Var3 != null) {
                    AndroidUtilities.hideKeyboard(w60Var3.getContentView());
                    break;
                }
                break;
            case 4:
                w60 w60Var4 = this.b.m;
                if (w60Var4 != null) {
                    AndroidUtilities.hideKeyboard(w60Var4.getContentView());
                    break;
                }
                break;
            case 5:
                w60 w60Var5 = this.b.m;
                if (w60Var5 != null) {
                    AndroidUtilities.hideKeyboard(w60Var5.getContentView());
                    break;
                }
                break;
            case 6:
                w60 w60Var6 = this.b.m;
                if (w60Var6 != null) {
                    AndroidUtilities.hideKeyboard(w60Var6.getContentView());
                    break;
                }
                break;
            case 7:
                this.b.s();
                break;
            default:
                this.b.s();
                break;
        }
    }
}
