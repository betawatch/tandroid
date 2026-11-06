package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w21 implements qt0 {
    public int a;
    public boolean b;
    public final /* synthetic */ x21 c;

    public w21(x21 x21Var) {
        this.c = x21Var;
    }

    @Override // org.telegram.ui.Components.qt0
    public final void K(int i7, boolean z9) {
        if (this.a == i7 && this.b == z9) {
            return;
        }
        this.a = i7;
        this.b = z9;
        if (i7 > org.telegram.messenger.g0.L(20.0f)) {
            x21 x21Var = this.c;
            if (x21Var.g0) {
                return;
            }
            x21Var.n0.q0 = false;
            x21Var.g0 = true;
        }
    }
}
