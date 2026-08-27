package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class li implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.wj0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ig.q0 n;

    public /* synthetic */ li(mi miVar, int i10, boolean z10, org.telegram.ui.Components.wj0 wj0Var, float f10, float f11, ig.q0 q0Var, int i11) {
        this.a = i11;
        this.b = miVar;
        this.c = i10;
        this.d = z10;
        this.e = wj0Var;
        this.f = f10;
        this.h = f11;
        this.n = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new li(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                rn rnVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = rnVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount;
                    ig.m0.d(rnVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    ig.m0.f();
                    break;
                }
                break;
        }
    }
}
