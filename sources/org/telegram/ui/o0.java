package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o0 extends b8.hf {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ o0(i4 i4Var, int i3) {
        this.a = i3;
        this.b = i4Var;
    }

    @Override // b8.hf
    public final void a(boolean z10) {
        switch (this.a) {
            case 0:
                if (z10) {
                    this.b.i0.h(false);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.t2 t2Var = this.b.J;
                if (t2Var != null) {
                    t2Var.E0 = z10;
                    break;
                }
                break;
        }
    }

    @Override // b8.hf
    public void b() {
        switch (this.a) {
            case 0:
                if (org.telegram.messenger.g0.I3()) {
                    org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(this.b.h0, null));
                    break;
                }
                break;
        }
    }
}
