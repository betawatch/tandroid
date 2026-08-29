package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki0 b;

    public /* synthetic */ ph0(ki0 ki0Var, int i10) {
        this.a = i10;
        this.b = ki0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                ki0 ki0Var = this.b;
                ki0Var.getClass();
                gh.j.f(false);
                gh.j jVar = ki0Var.e0;
                if (jVar != null) {
                    jVar.b(ki0Var.B);
                }
                AndroidUtilities.runOnUIThread(new ph0(ki0Var, 0));
                break;
            case 2:
                gh.j.f(false);
                ki0 ki0Var2 = this.b;
                gh.j jVar2 = ki0Var2.e0;
                if (jVar2 != null) {
                    jVar2.b(ki0Var2.B);
                }
                AndroidUtilities.runOnUIThread(new ph0(ki0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
