package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ i8(r8 r8Var, int i3) {
        this.a = i3;
        this.b = r8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        switch (this.a) {
            case 0:
                if (i3 == -1) {
                    r8.Z(this.b);
                    break;
                }
                break;
            default:
                r8 r8Var = this.b;
                if (i3 == -1) {
                    r8.Z(r8Var);
                }
                if (i3 == 1) {
                    r8Var.k0();
                    break;
                }
                break;
        }
    }
}
