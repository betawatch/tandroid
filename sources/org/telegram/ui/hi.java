package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                an anVar = this.g;
                anVar.Wb = i7;
                anVar.Xb = 6;
                this.f.invalidate();
                break;
            case 1:
                int i10 = this.e;
                an anVar2 = this.g;
                anVar2.Wb = i10;
                anVar2.Xb = 5;
                anVar2.Zb = null;
                this.f.invalidate();
                break;
            default:
                int i11 = this.e;
                an anVar3 = this.g;
                anVar3.Wb = i11;
                anVar3.Xb = 7;
                this.f.invalidate();
                break;
        }
    }
}
