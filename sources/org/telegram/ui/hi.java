package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class hi extends vf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.r1 f;
    public final /* synthetic */ bn g;

    public /* synthetic */ hi(bn bnVar, int i7, org.telegram.ui.Cells.r1 r1Var, int i10) {
        this.d = i10;
        this.g = bnVar;
        this.e = i7;
        this.f = r1Var;
    }

    @Override // vf.b
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, this.e, 26), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ai.w0(this, this.e, 29), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.h3(new ii(this, this.e, 0), 240L);
                    break;
                }
                break;
        }
    }

    @Override // vf.b
    public final void d() {
        switch (this.d) {
            case 0:
                int i7 = this.e;
                bn bnVar = this.g;
                bnVar.ac = i7;
                bnVar.bc = 6;
                this.f.invalidate();
                break;
            case 1:
                int i10 = this.e;
                bn bnVar2 = this.g;
                bnVar2.ac = i10;
                bnVar2.bc = 5;
                bnVar2.dc = null;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                bn bnVar3 = this.g;
                bnVar3.ac = i11;
                bnVar3.bc = 7;
                this.f.invalidate();
                break;
        }
    }
}
