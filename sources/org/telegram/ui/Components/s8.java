package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s8 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ b9 b;

    public /* synthetic */ s8(b9 b9Var, int i10) {
        this.a = i10;
        this.b = b9Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    b9.U(this.b);
                    break;
                }
                break;
            default:
                b9 b9Var = this.b;
                if (i10 == -1) {
                    b9.U(b9Var);
                }
                if (i10 == 1) {
                    b9Var.f0();
                    break;
                }
                break;
        }
    }
}
