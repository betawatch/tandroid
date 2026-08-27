package org.telegram.ui.ActionBar;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e3 b;

    public /* synthetic */ p2(e3 e3Var, int i10) {
        this.a = i10;
        this.b = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e3 e3Var = this.b;
                AndroidUtilities.removeFromParent(e3Var.container);
                e3Var.attachedFragment.getLayoutContainer().addView(e3Var.container);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                e3 e3Var2 = this.b;
                e3Var2.getClass();
                try {
                    e3Var2.dismissInternal();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
        }
    }
}
