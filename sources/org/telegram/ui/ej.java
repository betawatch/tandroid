package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ej extends pf.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ fo g;

    public /* synthetic */ ej(fo foVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = foVar;
        this.e = i10;
        this.f = u1Var;
    }

    @Override // pf.c
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 21), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 24), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 25), 240L);
                    break;
                }
                break;
        }
    }

    @Override // pf.c
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                fo foVar = this.g;
                foVar.wb = i10;
                foVar.xb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                fo foVar2 = this.g;
                foVar2.wb = i11;
                foVar2.xb = 5;
                foVar2.zb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                fo foVar3 = this.g;
                foVar3.wb = i12;
                foVar3.xb = 7;
                this.f.invalidate();
                break;
        }
    }
}
