package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kn extends org.telegram.ui.iu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ go c;

    public kn(go goVar, int i10) {
        this.c = goVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.iu0, org.telegram.ui.qu0
    public final boolean z() {
        return false;
    }
}
