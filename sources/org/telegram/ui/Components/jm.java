package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.nq0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ bn c;

    public jm(bn bnVar, int i7) {
        this.c = bnVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void D() {
        if (this.a) {
            this.c.g0(this.b);
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void J() {
        this.c.j0(this.b, null);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
