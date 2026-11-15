package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class hi extends vf.b {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ org.telegram.ui.Cells.q1 f;
    public final /* synthetic */ an g;

    public /* synthetic */ hi(an anVar, int i7, org.telegram.ui.Cells.q1 q1Var, int i10) {
        this.d = i10;
        this.g = anVar;
        this.e = i7;
        this.f = q1Var;
    }

    @Override // vf.b
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.v0(this, this.e, 23), 240L);
                    break;
                }
                break;
            case 1:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.v0(this, this.e, 26), 240L);
                    break;
                }
                break;
            default:
                if (!z10) {
                    org.telegram.messenger.g0.i3(new ai.v0(this, this.e, 27), 240L);
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
                an anVar = this.g;
                anVar.Zb = i7;
                anVar.ac = 6;
                this.f.invalidate();
                break;
            case 1:
                int i10 = this.e;
                an anVar2 = this.g;
                anVar2.Zb = i10;
                anVar2.ac = 5;
                anVar2.cc = null;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                an anVar3 = this.g;
                anVar3.Zb = i11;
                anVar3.ac = 7;
                this.f.invalidate();
                break;
        }
    }
}
