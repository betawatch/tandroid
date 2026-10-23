package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
