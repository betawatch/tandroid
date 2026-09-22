package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f3 b;

    public /* synthetic */ o2(f3 f3Var, int i10) {
        this.a = i10;
        this.b = f3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f3 f3Var = this.b;
                f3Var.getClass();
                try {
                    f3Var.dismissInternal();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                f3 f3Var2 = this.b;
                AndroidUtilities.removeFromParent(f3Var2.container);
                f3Var2.attachedFragment.getLayoutContainer().addView(f3Var2.container);
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
