package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class n8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ n8(w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    w8.U(this.b);
                    break;
                }
                break;
            default:
                w8 w8Var = this.b;
                if (i10 == -1) {
                    w8.U(w8Var);
                }
                if (i10 == 1) {
                    w8Var.f0();
                    break;
                }
                break;
        }
    }
}
