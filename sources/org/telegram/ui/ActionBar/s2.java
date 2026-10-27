package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
