package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;

    public /* synthetic */ qm0(sm0 sm0Var, int i10) {
        this.a = i10;
        this.b = sm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sm0 sm0Var = this.b;
                sm0Var.getClass();
                AndroidUtilities.runOnUIThread(new qm0(sm0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new qm0(this.b, 3));
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
