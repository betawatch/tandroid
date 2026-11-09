package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d31 implements st0 {
    public int a;
    public boolean b;
    public final /* synthetic */ e31 c;

    public d31(e31 e31Var) {
        this.c = e31Var;
    }

    @Override // org.telegram.ui.Components.st0
    public final void K(int i7, boolean z9) {
        if (this.a == i7 && this.b == z9) {
            return;
        }
        this.a = i7;
        this.b = z9;
        if (i7 > org.telegram.messenger.g0.L(20.0f)) {
            e31 e31Var = this.c;
            if (e31Var.g0) {
                return;
            }
            e31Var.n0.q0 = false;
            e31Var.g0 = true;
        }
    }
}
