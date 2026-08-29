package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ q2(f3 f3Var, int i10) {
        this.a = i10;
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
