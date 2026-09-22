package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class aj extends nf.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ bo g;

    public /* synthetic */ aj(bo boVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.g = boVar;
        this.e = i10;
        this.f = t1Var;
    }

    @Override // nf.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 21), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 23), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 24), 240L);
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
                bo boVar = this.g;
                boVar.vb = i10;
                boVar.wb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                bo boVar2 = this.g;
                boVar2.vb = i11;
                boVar2.wb = 5;
                boVar2.yb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                bo boVar3 = this.g;
                boVar3.vb = i12;
                boVar3.wb = 7;
                this.f.invalidate();
                break;
        }
    }
}
