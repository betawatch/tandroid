package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.q70;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q70 b;

    public /* synthetic */ g3(q70 q70Var, int i10) {
        this.a = i10;
        this.b = q70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                l70 l70Var = this.b.m;
                if (l70Var != null) {
                    AndroidUtilities.hideKeyboard(l70Var.getContentView());
                    break;
                }
                break;
            case 2:
                l70 l70Var2 = this.b.m;
                if (l70Var2 != null) {
                    AndroidUtilities.hideKeyboard(l70Var2.getContentView());
                    break;
                }
                break;
            case 3:
                l70 l70Var3 = this.b.m;
                if (l70Var3 != null) {
                    AndroidUtilities.hideKeyboard(l70Var3.getContentView());
                    break;
                }
                break;
            case 4:
                l70 l70Var4 = this.b.m;
                if (l70Var4 != null) {
                    AndroidUtilities.hideKeyboard(l70Var4.getContentView());
                    break;
                }
                break;
            case 5:
                l70 l70Var5 = this.b.m;
                if (l70Var5 != null) {
                    AndroidUtilities.hideKeyboard(l70Var5.getContentView());
                    break;
                }
                break;
            case 6:
                l70 l70Var6 = this.b.m;
                if (l70Var6 != null) {
                    AndroidUtilities.hideKeyboard(l70Var6.getContentView());
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
