package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
