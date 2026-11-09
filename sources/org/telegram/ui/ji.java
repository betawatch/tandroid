package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ji extends vf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.q1 f;
    public final /* synthetic */ cn g;

    public /* synthetic */ ji(cn cnVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.g = cnVar;
        this.e = i7;
        this.f = q1Var;
    }

    @Override // vf.b
    public final void c(boolean z9) {
        switch (this.d) {
            case 0:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.e, 22), 240L);
                    break;
                }
                break;
            case 1:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.e, 25), 240L);
                    break;
                }
                break;
            default:
                if (!z9) {
                    org.telegram.messenger.g0.i3(new bg.m0(this, this.e, 26), 240L);
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
                cn cnVar = this.g;
                cnVar.Yb = i7;
                cnVar.Zb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i10 = this.e;
                cn cnVar2 = this.g;
                cnVar2.Yb = i10;
                cnVar2.Zb = 5;
                cnVar2.bc = null;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                cn cnVar3 = this.g;
                cnVar3.Yb = i11;
                cnVar3.Zb = 7;
                this.f.invalidate();
                break;
        }
    }
}
