package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class t8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ t8(c9 c9Var, int i10) {
        this.a = i10;
        this.b = c9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    c9.U(this.b);
                    break;
                }
                break;
            default:
                c9 c9Var = this.b;
                if (i10 == -1) {
                    c9.U(c9Var);
                }
                if (i10 == 1) {
                    c9Var.f0();
                    break;
                }
                break;
        }
    }
}
