package ki;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.i80;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;

    public /* synthetic */ h(i80 i80Var, int i10) {
        this.a = i10;
        this.b = i80Var;
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
                d80 d80Var = this.b.m;
                if (d80Var != null) {
                    AndroidUtilities.hideKeyboard(d80Var.getContentView());
                    break;
                }
                break;
            case 4:
                d80 d80Var2 = this.b.m;
                if (d80Var2 != null) {
                    AndroidUtilities.hideKeyboard(d80Var2.getContentView());
                    break;
                }
                break;
            case 5:
                d80 d80Var3 = this.b.m;
                if (d80Var3 != null) {
                    AndroidUtilities.hideKeyboard(d80Var3.getContentView());
                    break;
                }
                break;
            case 6:
                d80 d80Var4 = this.b.m;
                if (d80Var4 != null) {
                    AndroidUtilities.hideKeyboard(d80Var4.getContentView());
                    break;
                }
                break;
            case 7:
                d80 d80Var5 = this.b.m;
                if (d80Var5 != null) {
                    AndroidUtilities.hideKeyboard(d80Var5.getContentView());
                    break;
                }
                break;
            default:
                d80 d80Var6 = this.b.m;
                if (d80Var6 != null) {
                    AndroidUtilities.hideKeyboard(d80Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
