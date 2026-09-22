package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj0 b;

    public /* synthetic */ ii0(dj0 dj0Var, int i10) {
        this.a = i10;
        this.b = dj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                dj0 dj0Var = this.b;
                dj0Var.getClass();
                vh.f.f(false);
                vh.f fVar = dj0Var.i0;
                if (fVar != null) {
                    fVar.b(dj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var, 0));
                break;
            case 2:
                vh.f.f(false);
                dj0 dj0Var2 = this.b;
                vh.f fVar2 = dj0Var2.i0;
                if (fVar2 != null) {
                    fVar2.b(dj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
