package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ in0 b;

    public /* synthetic */ gn0(in0 in0Var, int i10) {
        this.a = i10;
        this.b = in0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                in0 in0Var = this.b;
                in0Var.getClass();
                AndroidUtilities.runOnUIThread(new gn0(in0Var, 2));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gn0(this.b, 3));
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
