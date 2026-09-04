package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class aj extends of.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ co g;

    public /* synthetic */ aj(co coVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = coVar;
        this.e = i10;
        this.f = t1Var;
    }

    @Override // of.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 22), 240L);
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

    @Override // of.e
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                co coVar = this.g;
                coVar.wb = i10;
                coVar.xb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                co coVar2 = this.g;
                coVar2.wb = i11;
                coVar2.xb = 5;
                coVar2.zb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                co coVar3 = this.g;
                coVar3.wb = i12;
                coVar3.xb = 7;
                this.f.invalidate();
                break;
        }
    }
}
