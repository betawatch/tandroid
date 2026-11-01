package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f8 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ f8(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    o8.Z(this.b);
                    break;
                }
                break;
            default:
                o8 o8Var = this.b;
                if (i10 == -1) {
                    o8.Z(o8Var);
                }
                if (i10 == 1) {
                    o8Var.k0();
                    break;
                }
                break;
        }
    }
}
