package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ im0 b;

    public /* synthetic */ gm0(im0 im0Var, int i10) {
        this.a = i10;
        this.b = im0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                im0 im0Var = this.b;
                im0Var.getClass();
                AndroidUtilities.runOnUIThread(new gm0(im0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gm0(this.b, 3));
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
