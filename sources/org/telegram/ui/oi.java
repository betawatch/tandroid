package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.cl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah.i1 n;

    public /* synthetic */ oi(pi piVar, int i10, boolean z10, org.telegram.ui.Components.cl0 cl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.a = i11;
        this.b = piVar;
        this.c = i10;
        this.d = z10;
        this.e = cl0Var;
        this.f = f7;
        this.h = f10;
        this.n = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new oi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                sn snVar = this.b.s;
                org.telegram.ui.Cells.a0 t82 = snVar.t8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    ah.d1.d(snVar, this.e, t82, null, this.f, this.h, this.n, i10, 1);
                    ah.d1.f();
                    break;
                }
                break;
        }
    }
}
