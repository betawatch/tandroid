package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ am0 b;

    public /* synthetic */ yl0(am0 am0Var, int i10) {
        this.a = i10;
        this.b = am0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                am0 am0Var = this.b;
                am0Var.getClass();
                AndroidUtilities.runOnUIThread(new yl0(am0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new yl0(this.b, 3));
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
