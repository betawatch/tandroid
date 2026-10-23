package ki;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j80 b;

    public /* synthetic */ h(j80 j80Var, int i10) {
        this.a = i10;
        this.b = j80Var;
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
                e80 e80Var = this.b.m;
                if (e80Var != null) {
                    AndroidUtilities.hideKeyboard(e80Var.getContentView());
                    break;
                }
                break;
            case 4:
                e80 e80Var2 = this.b.m;
                if (e80Var2 != null) {
                    AndroidUtilities.hideKeyboard(e80Var2.getContentView());
                    break;
                }
                break;
            case 5:
                e80 e80Var3 = this.b.m;
                if (e80Var3 != null) {
                    AndroidUtilities.hideKeyboard(e80Var3.getContentView());
                    break;
                }
                break;
            case 6:
                e80 e80Var4 = this.b.m;
                if (e80Var4 != null) {
                    AndroidUtilities.hideKeyboard(e80Var4.getContentView());
                    break;
                }
                break;
            case 7:
                e80 e80Var5 = this.b.m;
                if (e80Var5 != null) {
                    AndroidUtilities.hideKeyboard(e80Var5.getContentView());
                    break;
                }
                break;
            default:
                e80 e80Var6 = this.b.m;
                if (e80Var6 != null) {
                    AndroidUtilities.hideKeyboard(e80Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
