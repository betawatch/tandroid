package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hn0 b;

    public /* synthetic */ fn0(hn0 hn0Var, int i10) {
        this.a = i10;
        this.b = hn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hn0 hn0Var = this.b;
                hn0Var.getClass();
                AndroidUtilities.runOnUIThread(new fn0(hn0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fn0(this.b, 3));
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
