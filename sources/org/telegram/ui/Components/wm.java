package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wm extends org.telegram.ui.yt0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ qn c;

    public wm(qn qnVar, int i10) {
        this.c = qnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.yt0, org.telegram.ui.hu0
    public final boolean z() {
        return false;
    }
}
