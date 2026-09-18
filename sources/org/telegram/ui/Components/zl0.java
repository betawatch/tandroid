package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm0 b;

    public /* synthetic */ zl0(bm0 bm0Var, int i10) {
        this.a = i10;
        this.b = bm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bm0 bm0Var = this.b;
                bm0Var.getClass();
                AndroidUtilities.runOnUIThread(new zl0(bm0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new zl0(this.b, 3));
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
