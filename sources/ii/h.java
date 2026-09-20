package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.v70;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v70 b;

    public /* synthetic */ h(v70 v70Var, int i10) {
        this.a = i10;
        this.b = v70Var;
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
                q70 q70Var = this.b.m;
                if (q70Var != null) {
                    AndroidUtilities.hideKeyboard(q70Var.getContentView());
                    break;
                }
                break;
            case 4:
                q70 q70Var2 = this.b.m;
                if (q70Var2 != null) {
                    AndroidUtilities.hideKeyboard(q70Var2.getContentView());
                    break;
                }
                break;
            case 5:
                q70 q70Var3 = this.b.m;
                if (q70Var3 != null) {
                    AndroidUtilities.hideKeyboard(q70Var3.getContentView());
                    break;
                }
                break;
            case 6:
                q70 q70Var4 = this.b.m;
                if (q70Var4 != null) {
                    AndroidUtilities.hideKeyboard(q70Var4.getContentView());
                    break;
                }
                break;
            case 7:
                q70 q70Var5 = this.b.m;
                if (q70Var5 != null) {
                    AndroidUtilities.hideKeyboard(q70Var5.getContentView());
                    break;
                }
                break;
            default:
                q70 q70Var6 = this.b.m;
                if (q70Var6 != null) {
                    AndroidUtilities.hideKeyboard(q70Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
