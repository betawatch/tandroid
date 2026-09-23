package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.o70;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o70 b;

    public /* synthetic */ h(o70 o70Var, int i10) {
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
                this.b.s();
                break;
            case 2:
                this.b.s();
                break;
            case 3:
                j70 j70Var = this.b.m;
                if (j70Var != null) {
                    AndroidUtilities.hideKeyboard(j70Var.getContentView());
                    break;
                }
                break;
            case 4:
                j70 j70Var2 = this.b.m;
                if (j70Var2 != null) {
                    AndroidUtilities.hideKeyboard(j70Var2.getContentView());
                    break;
                }
                break;
            case 5:
                j70 j70Var3 = this.b.m;
                if (j70Var3 != null) {
                    AndroidUtilities.hideKeyboard(j70Var3.getContentView());
                    break;
                }
                break;
            case 6:
                j70 j70Var4 = this.b.m;
                if (j70Var4 != null) {
                    AndroidUtilities.hideKeyboard(j70Var4.getContentView());
                    break;
                }
                break;
            case 7:
                j70 j70Var5 = this.b.m;
                if (j70Var5 != null) {
                    AndroidUtilities.hideKeyboard(j70Var5.getContentView());
                    break;
                }
                break;
            default:
                j70 j70Var6 = this.b.m;
                if (j70Var6 != null) {
                    AndroidUtilities.hideKeyboard(j70Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
