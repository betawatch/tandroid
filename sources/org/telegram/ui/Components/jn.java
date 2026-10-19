package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
