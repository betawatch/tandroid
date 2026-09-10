package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w70 b;

    public /* synthetic */ i(w70 w70Var, int i10) {
        this.a = i10;
        this.b = w70Var;
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
                r70 r70Var = this.b.m;
                if (r70Var != null) {
                    AndroidUtilities.hideKeyboard(r70Var.getContentView());
                    break;
                }
                break;
            case 4:
                r70 r70Var2 = this.b.m;
                if (r70Var2 != null) {
                    AndroidUtilities.hideKeyboard(r70Var2.getContentView());
                    break;
                }
                break;
            case 5:
                r70 r70Var3 = this.b.m;
                if (r70Var3 != null) {
                    AndroidUtilities.hideKeyboard(r70Var3.getContentView());
                    break;
                }
                break;
            case 6:
                r70 r70Var4 = this.b.m;
                if (r70Var4 != null) {
                    AndroidUtilities.hideKeyboard(r70Var4.getContentView());
                    break;
                }
                break;
            case 7:
                r70 r70Var5 = this.b.m;
                if (r70Var5 != null) {
                    AndroidUtilities.hideKeyboard(r70Var5.getContentView());
                    break;
                }
                break;
            default:
                r70 r70Var6 = this.b.m;
                if (r70Var6 != null) {
                    AndroidUtilities.hideKeyboard(r70Var6.getContentView());
                    break;
                }
                break;
        }
    }
}
