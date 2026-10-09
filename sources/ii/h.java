package ii;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p80 b;

    public /* synthetic */ h(p80 p80Var, int i10) {
        this.a = i10;
        this.b = p80Var;
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
                k80 k80Var = this.b.m;
                if (k80Var != null) {
                    AndroidUtilities.hideKeyboard(k80Var.getContentView());
                    break;
                }
                break;
            case 4:
                k80 k80Var2 = this.b.m;
                if (k80Var2 != null) {
                    AndroidUtilities.hideKeyboard(k80Var2.getContentView());
                    break;
                }
                break;
            case 5:
                k80 k80Var3 = this.b.m;
                if (k80Var3 != null) {
                    AndroidUtilities.hideKeyboard(k80Var3.getContentView());
                    break;
                }
                break;
            case 6:
                k80 k80Var4 = this.b.m;
                if (k80Var4 != null) {
                    AndroidUtilities.hideKeyboard(k80Var4.getContentView());
                    break;
                }
                break;
            case 7:
                k80 k80Var5 = this.b.m;
                if (k80Var5 != null) {
                    AndroidUtilities.hideKeyboard(k80Var5.getContentView());
                    break;
                }
                break;
            default:
                k80 k80Var6 = this.b.m;
                if (k80Var6 != null) {
                    AndroidUtilities.hideKeyboard(k80Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
