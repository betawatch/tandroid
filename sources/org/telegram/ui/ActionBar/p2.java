package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ p2(h3 h3Var, int i10) {
        this.a = i10;
        this.b = h3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h3 h3Var = this.b;
                h3Var.getClass();
                try {
                    h3Var.dismissInternal();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                h3 h3Var2 = this.b;
                AndroidUtilities.removeFromParent(h3Var2.container);
                h3Var2.attachedFragment.getLayoutContainer().addView(h3Var2.container);
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
