package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
