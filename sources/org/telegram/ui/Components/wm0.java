package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ym0 b;

    public /* synthetic */ wm0(ym0 ym0Var, int i10) {
        this.a = i10;
        this.b = ym0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ym0 ym0Var = this.b;
                ym0Var.getClass();
                AndroidUtilities.runOnUIThread(new wm0(ym0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new wm0(this.b, 3));
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
