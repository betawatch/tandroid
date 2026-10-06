package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ei0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi0 b;

    public /* synthetic */ ei0(zi0 zi0Var, int i10) {
        this.a = i10;
        this.b = zi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                zi0 zi0Var = this.b;
                zi0Var.getClass();
                vh.f.f(false);
                vh.f fVar = zi0Var.i0;
                if (fVar != null) {
                    fVar.b(zi0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ei0(zi0Var, 0));
                break;
            case 2:
                vh.f.f(false);
                zi0 zi0Var2 = this.b;
                vh.f fVar2 = zi0Var2.i0;
                if (fVar2 != null) {
                    fVar2.b(zi0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ei0(zi0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
