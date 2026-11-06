package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.mq0 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ bn c;

    public jm(bn bnVar, int i7) {
        this.c = bnVar;
        this.b = i7;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void D() {
        if (this.a) {
            this.c.g0(this.b);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void J() {
        this.c.j0(this.b, null);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void W() {
        this.a = true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean z() {
        return false;
    }
}
