package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ n2(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                e3Var.getClass();
                try {
                    e3Var.dismissInternal();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                e3 e3Var2 = this.b;
                AndroidUtilities.removeFromParent(e3Var2.container);
                e3Var2.attachedFragment.getLayoutContainer().addView(e3Var2.container);
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
