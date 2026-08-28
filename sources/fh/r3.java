package fh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x60 b;

    public /* synthetic */ r3(x60 x60Var, int i9) {
        this.a = i9;
        this.b = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.s();
                break;
            case 1:
                s60 s60Var = this.b.m;
                if (s60Var != null) {
                    AndroidUtilities.hideKeyboard(s60Var.getContentView());
                    break;
                }
                break;
            case 2:
                s60 s60Var2 = this.b.m;
                if (s60Var2 != null) {
                    AndroidUtilities.hideKeyboard(s60Var2.getContentView());
                    break;
                }
                break;
            case 3:
                s60 s60Var3 = this.b.m;
                if (s60Var3 != null) {
                    AndroidUtilities.hideKeyboard(s60Var3.getContentView());
                    break;
                }
                break;
            case 4:
                s60 s60Var4 = this.b.m;
                if (s60Var4 != null) {
                    AndroidUtilities.hideKeyboard(s60Var4.getContentView());
                    break;
                }
                break;
            case 5:
                s60 s60Var5 = this.b.m;
                if (s60Var5 != null) {
                    AndroidUtilities.hideKeyboard(s60Var5.getContentView());
                    break;
                }
                break;
            case 6:
                s60 s60Var6 = this.b.m;
                if (s60Var6 != null) {
                    AndroidUtilities.hideKeyboard(s60Var6.getContentView());
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
