package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class jn extends org.telegram.ui.zt0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fo c;

    public jn(fo foVar, int i10) {
        this.c = foVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final boolean z() {
        return false;
    }
}
