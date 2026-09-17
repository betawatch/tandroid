package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class w8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ w8(f9 f9Var, int i10) {
        this.a = i10;
        this.b = f9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    f9.U(this.b);
                    break;
                }
                break;
            default:
                f9 f9Var = this.b;
                if (i10 == -1) {
                    f9.U(f9Var);
                }
                if (i10 == 1) {
                    f9Var.f0();
                    break;
                }
                break;
        }
    }
}
