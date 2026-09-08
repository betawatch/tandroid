package ji;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;

    public /* synthetic */ h(n70 n70Var, int i10) {
        this.a = i10;
        this.b = n70Var;
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
                i70 i70Var = this.b.m;
                if (i70Var != null) {
                    AndroidUtilities.hideKeyboard(i70Var.getContentView());
                    break;
                }
                break;
            case 4:
                i70 i70Var2 = this.b.m;
                if (i70Var2 != null) {
                    AndroidUtilities.hideKeyboard(i70Var2.getContentView());
                    break;
                }
                break;
            case 5:
                i70 i70Var3 = this.b.m;
                if (i70Var3 != null) {
                    AndroidUtilities.hideKeyboard(i70Var3.getContentView());
                    break;
                }
                break;
            case 6:
                i70 i70Var4 = this.b.m;
                if (i70Var4 != null) {
                    AndroidUtilities.hideKeyboard(i70Var4.getContentView());
                    break;
                }
                break;
            case 7:
                i70 i70Var5 = this.b.m;
                if (i70Var5 != null) {
                    AndroidUtilities.hideKeyboard(i70Var5.getContentView());
                    break;
                }
                break;
            default:
                i70 i70Var6 = this.b.m;
                if (i70Var6 != null) {
                    AndroidUtilities.hideKeyboard(i70Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
