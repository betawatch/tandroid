package li;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;

    public /* synthetic */ h(k80 k80Var, int i10) {
        this.a = i10;
        this.b = k80Var;
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
                f80 f80Var = this.b.m;
                if (f80Var != null) {
                    AndroidUtilities.hideKeyboard(f80Var.getContentView());
                    break;
                }
                break;
            case 4:
                f80 f80Var2 = this.b.m;
                if (f80Var2 != null) {
                    AndroidUtilities.hideKeyboard(f80Var2.getContentView());
                    break;
                }
                break;
            case 5:
                f80 f80Var3 = this.b.m;
                if (f80Var3 != null) {
                    AndroidUtilities.hideKeyboard(f80Var3.getContentView());
                    break;
                }
                break;
            case 6:
                f80 f80Var4 = this.b.m;
                if (f80Var4 != null) {
                    AndroidUtilities.hideKeyboard(f80Var4.getContentView());
                    break;
                }
                break;
            case 7:
                f80 f80Var5 = this.b.m;
                if (f80Var5 != null) {
                    AndroidUtilities.hideKeyboard(f80Var5.getContentView());
                    break;
                }
                break;
            default:
                f80 f80Var6 = this.b.m;
                if (f80Var6 != null) {
                    AndroidUtilities.hideKeyboard(f80Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
