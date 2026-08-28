package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ji implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.uj0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ hg.r0 n;

    public /* synthetic */ ji(ki kiVar, int i9, boolean z10, org.telegram.ui.Components.uj0 uj0Var, float f10, float f11, hg.r0 r0Var, int i10) {
        this.a = i10;
        this.b = kiVar;
        this.c = i9;
        this.d = z10;
        this.e = uj0Var;
        this.f = f10;
        this.h = f11;
        this.n = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ji(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                qn qnVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = qnVar.q8(this.c, true);
                if (this.d) {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    hg.n0.d(qnVar, this.e, q82, null, this.f, this.h, this.n, i9, 1);
                    hg.n0.f();
                    break;
                }
                break;
        }
    }
}
