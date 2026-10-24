package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class jn extends org.telegram.ui.cu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ fo c;

    public jn(fo foVar, int i10) {
        this.c = foVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.cu0, org.telegram.ui.ku0
    public final boolean z() {
        return false;
    }
}
