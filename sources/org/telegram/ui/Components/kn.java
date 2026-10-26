package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class kn extends org.telegram.ui.gu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ go c;

    public kn(go goVar, int i10) {
        this.c = goVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void D() {
        if (this.a) {
            this.c.e0(this.b);
        }
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void J() {
        this.c.h0(this.b, null);
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.gu0, org.telegram.ui.ou0
    public final boolean z() {
        return false;
    }
}
