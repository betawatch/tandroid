package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ q2(f3 f3Var, int i9) {
        this.a = i9;
        this.b = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f3 f3Var = this.b;
                AndroidUtilities.removeFromParent(f3Var.container);
                f3Var.attachedFragment.getLayoutContainer().addView(f3Var.container);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                f3 f3Var2 = this.b;
                f3Var2.getClass();
                try {
                    f3Var2.dismissInternal();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
