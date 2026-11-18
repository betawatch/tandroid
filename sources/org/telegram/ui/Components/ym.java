package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ym extends org.telegram.ui.oq0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rn c;

    public ym(rn rnVar, int i7) {
        this.c = rnVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void D() {
        if (this.a) {
            this.c.g0(this.b);
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void J() {
        this.c.j0(this.b, null);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean z() {
        return false;
    }
}
