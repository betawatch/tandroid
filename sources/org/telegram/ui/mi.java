package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.fk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ kg.q0 n;

    public /* synthetic */ mi(ni niVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f9, float f10, kg.q0 q0Var, int i11) {
        this.a = i11;
        this.b = niVar;
        this.c = i10;
        this.d = z10;
        this.e = fk0Var;
        this.f = f9;
        this.h = f10;
        this.n = q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new mi(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 1), 50L);
                break;
            default:
                tn tnVar = this.b.s;
                org.telegram.ui.Cells.a0 q82 = tnVar.q8(this.c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                    kg.m0.d(tnVar, this.e, q82, null, this.f, this.h, this.n, i10, 1);
                    kg.m0.f();
                    break;
                }
                break;
        }
    }
}
