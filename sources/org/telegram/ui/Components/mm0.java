package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ om0 b;

    public /* synthetic */ mm0(om0 om0Var, int i10) {
        this.a = i10;
        this.b = om0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                om0 om0Var = this.b;
                om0Var.getClass();
                AndroidUtilities.runOnUIThread(new mm0(om0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new mm0(this.b, 3));
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
