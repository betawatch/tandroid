package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h3 b;

    public /* synthetic */ q2(h3 h3Var, int i10) {
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
