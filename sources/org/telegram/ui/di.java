package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class di extends sf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.q1 f;
    public final /* synthetic */ wm g;

    public /* synthetic */ di(wm wmVar, int i3, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.g = wmVar;
        this.e = i3;
        this.f = q1Var;
    }

    @Override // sf.b
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.e, 22), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.e, 25), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new cg.l0(this, this.e, 26), 240L);
                    break;
                }
                break;
        }
    }

    @Override // sf.b
    public final void d() {
        switch (this.d) {
            case 0:
                int i3 = this.e;
                wm wmVar = this.g;
                wmVar.Xb = i3;
                wmVar.Yb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i10 = this.e;
                wm wmVar2 = this.g;
                wmVar2.Xb = i10;
                wmVar2.Yb = 5;
                wmVar2.ac = null;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                wm wmVar3 = this.g;
                wmVar3.Xb = i11;
                wmVar3.Yb = 7;
                this.f.invalidate();
                break;
        }
    }
}
