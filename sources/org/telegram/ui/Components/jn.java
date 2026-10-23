package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
