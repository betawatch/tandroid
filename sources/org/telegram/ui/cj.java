package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class cj extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ eo g;

    public /* synthetic */ cj(eo eoVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = eoVar;
        this.e = i10;
        this.f = t1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bi.s(this, this.e, 20), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bi.s(this, this.e, 22), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bi.s(this, this.e, 23), 240L);
                    break;
                }
                break;
        }
    }

    @Override // nf.e
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                eo eoVar = this.g;
                eoVar.wb = i10;
                eoVar.xb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                eo eoVar2 = this.g;
                eoVar2.wb = i11;
                eoVar2.xb = 5;
                eoVar2.zb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                eo eoVar3 = this.g;
                eoVar3.wb = i12;
                eoVar3.xb = 7;
                this.f.invalidate();
                break;
        }
    }
}
