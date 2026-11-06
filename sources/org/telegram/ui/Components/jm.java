package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
