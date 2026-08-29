package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.j70;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j70 b;

    public /* synthetic */ g3(j70 j70Var, int i10) {
        this.a = i10;
        this.b = j70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                e70 e70Var = this.b.m;
                if (e70Var != null) {
                    AndroidUtilities.hideKeyboard(e70Var.getContentView());
                    break;
                }
                break;
            case 2:
                e70 e70Var2 = this.b.m;
                if (e70Var2 != null) {
                    AndroidUtilities.hideKeyboard(e70Var2.getContentView());
                    break;
                }
                break;
            case 3:
                e70 e70Var3 = this.b.m;
                if (e70Var3 != null) {
                    AndroidUtilities.hideKeyboard(e70Var3.getContentView());
                    break;
                }
                break;
            case 4:
                e70 e70Var4 = this.b.m;
                if (e70Var4 != null) {
                    AndroidUtilities.hideKeyboard(e70Var4.getContentView());
                    break;
                }
                break;
            case 5:
                e70 e70Var5 = this.b.m;
                if (e70Var5 != null) {
                    AndroidUtilities.hideKeyboard(e70Var5.getContentView());
                    break;
                }
                break;
            case 6:
                e70 e70Var6 = this.b.m;
                if (e70Var6 != null) {
                    AndroidUtilities.hideKeyboard(e70Var6.getContentView());
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
