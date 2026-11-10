package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class im extends org.telegram.ui.qq0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ an c;

    public im(an anVar, int i7) {
        this.c = anVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void D() {
        if (this.a) {
            this.c.g0(this.b);
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void J() {
        this.c.j0(this.b, null);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean z() {
        return false;
    }
}
