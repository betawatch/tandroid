package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm0 b;

    public /* synthetic */ fm0(hm0 hm0Var, int i10) {
        this.a = i10;
        this.b = hm0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hm0 hm0Var = this.b;
                hm0Var.getClass();
                AndroidUtilities.runOnUIThread(new fm0(hm0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fm0(this.b, 3));
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
