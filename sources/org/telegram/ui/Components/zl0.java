package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
