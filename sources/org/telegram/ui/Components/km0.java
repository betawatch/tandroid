package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class km0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm0 b;

    public /* synthetic */ km0(mm0 mm0Var, int i10) {
        this.a = i10;
        this.b = mm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mm0 mm0Var = this.b;
                mm0Var.getClass();
                AndroidUtilities.runOnUIThread(new km0(mm0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new km0(this.b, 3));
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
