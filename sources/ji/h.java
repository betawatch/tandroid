package ji;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m80 b;

    public /* synthetic */ h(m80 m80Var, int i10) {
        this.a = i10;
        this.b = m80Var;
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
                h80 h80Var = this.b.m;
                if (h80Var != null) {
                    AndroidUtilities.hideKeyboard(h80Var.getContentView());
                    break;
                }
                break;
            case 4:
                h80 h80Var2 = this.b.m;
                if (h80Var2 != null) {
                    AndroidUtilities.hideKeyboard(h80Var2.getContentView());
                    break;
                }
                break;
            case 5:
                h80 h80Var3 = this.b.m;
                if (h80Var3 != null) {
                    AndroidUtilities.hideKeyboard(h80Var3.getContentView());
                    break;
                }
                break;
            case 6:
                h80 h80Var4 = this.b.m;
                if (h80Var4 != null) {
                    AndroidUtilities.hideKeyboard(h80Var4.getContentView());
                    break;
                }
                break;
            case 7:
                h80 h80Var5 = this.b.m;
                if (h80Var5 != null) {
                    AndroidUtilities.hideKeyboard(h80Var5.getContentView());
                    break;
                }
                break;
            default:
                h80 h80Var6 = this.b.m;
                if (h80Var6 != null) {
                    AndroidUtilities.hideKeyboard(h80Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
