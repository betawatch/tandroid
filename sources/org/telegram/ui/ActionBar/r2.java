package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ r2(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b;
                AndroidUtilities.removeFromParent(h3Var.container);
                h3Var.attachedFragment.getLayoutContainer().addView(h3Var.container);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                h3 h3Var2 = this.b;
                h3Var2.getClass();
                try {
                    h3Var2.dismissInternal();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
        }
    }
}
