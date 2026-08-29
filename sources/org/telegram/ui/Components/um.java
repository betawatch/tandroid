package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class um extends org.telegram.ui.pt0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ on c;

    public um(on onVar, int i10) {
        this.c = onVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.pt0, org.telegram.ui.xt0
    public final boolean z() {
        return false;
    }
}
