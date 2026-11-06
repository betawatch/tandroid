package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class c31 implements qt0 {
    public int a;
    public boolean b;
    public final /* synthetic */ d31 c;

    public c31(d31 d31Var) {
        this.c = d31Var;
    }

    @Override // org.telegram.ui.Components.qt0
    public final void K(int i7, boolean z9) {
        if (this.a == i7 && this.b == z9) {
            return;
        }
        this.a = i7;
        this.b = z9;
        if (i7 > org.telegram.messenger.g0.L(20.0f)) {
            d31 d31Var = this.c;
            if (d31Var.g0) {
                return;
            }
            d31Var.n0.q0 = false;
            d31Var.g0 = true;
        }
    }
}
