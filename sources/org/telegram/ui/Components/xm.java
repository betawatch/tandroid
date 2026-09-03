package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xm extends org.telegram.ui.fu0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rn c;

    public xm(rn rnVar, int i10) {
        this.c = rnVar;
        this.b = i10;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void D() {
        if (this.a) {
            this.c.b0(this.b);
        }
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void I() {
        this.c.e0(this.b, null);
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final void V() {
        this.a = true;
    }

    @Override // org.telegram.ui.fu0, org.telegram.ui.ou0
    public final boolean z() {
        return false;
    }
}
