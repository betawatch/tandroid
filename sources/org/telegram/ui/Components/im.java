package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.eq0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ an c;

    public im(an anVar, int i3) {
        this.c = anVar;
        this.b = i3;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void D() {
        if (this.a) {
            this.c.g0(this.b);
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void J() {
        this.c.j0(this.b, null);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean z() {
        return false;
    }
}
