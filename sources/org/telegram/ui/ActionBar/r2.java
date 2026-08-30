package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ r2(g3 g3Var, int i10) {
        this.a = i10;
        this.b = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g3 g3Var = this.b;
                AndroidUtilities.removeFromParent(g3Var.container);
                g3Var.attachedFragment.getLayoutContainer().addView(g3Var.container);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                g3 g3Var2 = this.b;
                g3Var2.getClass();
                try {
                    g3Var2.dismissInternal();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
        }
    }
}
