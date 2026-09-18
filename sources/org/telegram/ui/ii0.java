package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                vh.g.f(false);
                vh.g gVar = dj0Var.i0;
                if (gVar != null) {
                    gVar.b(dj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var, 0));
                break;
            case 2:
                vh.g.f(false);
                dj0 dj0Var2 = this.b;
                vh.g gVar2 = dj0Var2.i0;
                if (gVar2 != null) {
                    gVar2.b(dj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new ii0(dj0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
