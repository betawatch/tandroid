package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.o70;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o70 b;

    public /* synthetic */ g3(o70 o70Var, int i10) {
        this.a = i10;
        this.b = o70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                j70 j70Var = this.b.m;
                if (j70Var != null) {
                    AndroidUtilities.hideKeyboard(j70Var.getContentView());
                    break;
                }
                break;
            case 2:
                j70 j70Var2 = this.b.m;
                if (j70Var2 != null) {
                    AndroidUtilities.hideKeyboard(j70Var2.getContentView());
                    break;
                }
                break;
            case 3:
                j70 j70Var3 = this.b.m;
                if (j70Var3 != null) {
                    AndroidUtilities.hideKeyboard(j70Var3.getContentView());
                    break;
                }
                break;
            case 4:
                j70 j70Var4 = this.b.m;
                if (j70Var4 != null) {
                    AndroidUtilities.hideKeyboard(j70Var4.getContentView());
                    break;
                }
                break;
            case 5:
                j70 j70Var5 = this.b.m;
                if (j70Var5 != null) {
                    AndroidUtilities.hideKeyboard(j70Var5.getContentView());
                    break;
                }
                break;
            case 6:
                j70 j70Var6 = this.b.m;
                if (j70Var6 != null) {
                    AndroidUtilities.hideKeyboard(j70Var6.getContentView());
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
