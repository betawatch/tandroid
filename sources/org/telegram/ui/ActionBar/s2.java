package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3 b;

    public /* synthetic */ s2(k3 k3Var, int i10) {
        this.a = i10;
        this.b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k3 k3Var = this.b;
                k3Var.getClass();
                try {
                    k3Var.dismissInternal();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                k3 k3Var2 = this.b;
                AndroidUtilities.removeFromParent(k3Var2.container);
                k3Var2.attachedFragment.getLayoutContainer().addView(k3Var2.container);
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
