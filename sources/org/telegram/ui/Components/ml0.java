package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol0 b;

    public /* synthetic */ ml0(ol0 ol0Var, int i10) {
        this.a = i10;
        this.b = ol0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ol0 ol0Var = this.b;
                ol0Var.getClass();
                AndroidUtilities.runOnUIThread(new ml0(ol0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ml0(this.b, 3));
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
