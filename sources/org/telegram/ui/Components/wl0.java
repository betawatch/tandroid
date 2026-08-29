package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl0 b;

    public /* synthetic */ wl0(yl0 yl0Var, int i10) {
        this.a = i10;
        this.b = yl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yl0 yl0Var = this.b;
                yl0Var.getClass();
                AndroidUtilities.runOnUIThread(new wl0(yl0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new wl0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
