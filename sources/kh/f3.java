package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.p70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p70 b;

    public /* synthetic */ f3(p70 p70Var, int i10) {
        this.a = i10;
        this.b = p70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                k70 k70Var = this.b.m;
                if (k70Var != null) {
                    AndroidUtilities.hideKeyboard(k70Var.getContentView());
                    break;
                }
                break;
            case 2:
                k70 k70Var2 = this.b.m;
                if (k70Var2 != null) {
                    AndroidUtilities.hideKeyboard(k70Var2.getContentView());
                    break;
                }
                break;
            case 3:
                k70 k70Var3 = this.b.m;
                if (k70Var3 != null) {
                    AndroidUtilities.hideKeyboard(k70Var3.getContentView());
                    break;
                }
                break;
            case 4:
                k70 k70Var4 = this.b.m;
                if (k70Var4 != null) {
                    AndroidUtilities.hideKeyboard(k70Var4.getContentView());
                    break;
                }
                break;
            case 5:
                k70 k70Var5 = this.b.m;
                if (k70Var5 != null) {
                    AndroidUtilities.hideKeyboard(k70Var5.getContentView());
                    break;
                }
                break;
            case 6:
                k70 k70Var6 = this.b.m;
                if (k70Var6 != null) {
                    AndroidUtilities.hideKeyboard(k70Var6.getContentView());
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
