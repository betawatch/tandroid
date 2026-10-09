package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class aj extends of.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.u1 f;
    public final /* synthetic */ zn g;

    public /* synthetic */ aj(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.g = znVar;
        this.e = i10;
        this.f = u1Var;
    }

    @Override // of.e
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.e, 20), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.e, 23), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.p8(this, this.e, 24), 240L);
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
                zn znVar = this.g;
                znVar.wb = i10;
                znVar.xb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i11 = this.e;
                zn znVar2 = this.g;
                znVar2.wb = i11;
                znVar2.xb = 5;
                znVar2.zb = null;
                this.f.invalidate();
                break;
            default:
                int i12 = this.e;
                zn znVar3 = this.g;
                znVar3.wb = i12;
                znVar3.xb = 7;
                this.f.invalidate();
                break;
        }
    }
}
