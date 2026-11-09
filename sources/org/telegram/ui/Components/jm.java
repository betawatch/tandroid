package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.pq0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ bn c;

    public jm(bn bnVar, int i7) {
        this.c = bnVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void D() {
        if (this.a) {
            this.c.g0(this.b);
        }
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void J() {
        this.c.j0(this.b, null);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final boolean z() {
        return false;
    }
}
