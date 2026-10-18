package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class jn extends org.telegram.ui.bu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fo c;

    public jn(fo foVar, int i10) {
        this.c = foVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.bu0, org.telegram.ui.ju0
    public final boolean z() {
        return false;
    }
}
