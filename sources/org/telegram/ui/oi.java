package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oi extends ve.d {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.t1 f;
    public final /* synthetic */ qn g;

    public /* synthetic */ oi(qn qnVar, int i9, org.telegram.ui.Cells.t1 t1Var, int i10) {
        this.d = i10;
        this.g = qnVar;
        this.e = i9;
        this.f = t1Var;
    }

    @Override // ve.d
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.e, 20), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.e, 22), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new bg.c2(this, this.e, 23), 240L);
                    break;
                }
                break;
        }
    }

    @Override // ve.d
    public final void d() {
        switch (this.d) {
            case 0:
                int i9 = this.e;
                qn qnVar = this.g;
                qnVar.sb = i9;
                qnVar.tb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i10 = this.e;
                qn qnVar2 = this.g;
                qnVar2.sb = i10;
                qnVar2.tb = 5;
                qnVar2.vb = null;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                qn qnVar3 = this.g;
                qnVar3.sb = i11;
                qnVar3.tb = 7;
                this.f.invalidate();
                break;
        }
    }
}
