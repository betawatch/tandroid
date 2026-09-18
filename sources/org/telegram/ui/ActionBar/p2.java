package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g3 b;

    public /* synthetic */ p2(g3 g3Var, int i10) {
        this.a = i10;
        this.b = g3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g3 g3Var = this.b;
                g3Var.getClass();
                try {
                    g3Var.dismissInternal();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                g3 g3Var2 = this.b;
                AndroidUtilities.removeFromParent(g3Var2.container);
                g3Var2.attachedFragment.getLayoutContainer().addView(g3Var2.container);
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
