package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ni implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.fl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ bh.x0 n;

    public /* synthetic */ ni(oi oiVar, int i10, boolean z10, org.telegram.ui.Components.fl0 fl0Var, float f7, float f10, bh.x0 x0Var, int i11) {
        this.a = i11;
        this.b = oiVar;
        this.c = i10;
        this.d = z10;
        this.e = fl0Var;
        this.f = f7;
        this.h = f10;
        this.n = x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ni(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                un unVar = this.b.s;
                org.telegram.ui.Cells.z x82 = unVar.x8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    bh.s0.d(unVar, this.e, x82, null, this.f, this.h, this.n, i10, 1);
                    bh.s0.f();
                    break;
                }
                break;
        }
    }
}
