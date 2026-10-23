package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.dl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah.i1 n;

    public /* synthetic */ mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.dl0 dl0Var, float f7, float f10, ah.i1 i1Var, int i11) {
        this.a = i11;
        this.b = niVar;
        this.c = i10;
        this.d = z10;
        this.e = dl0Var;
        this.f = f7;
        this.h = f10;
        this.n = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                qn qnVar = this.b.s;
                org.telegram.ui.Cells.a0 t82 = qnVar.t8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    ah.d1.d(qnVar, this.e, t82, null, this.f, this.h, this.n, i10, 1);
                    ah.d1.f();
                    break;
                }
                break;
        }
    }
}
