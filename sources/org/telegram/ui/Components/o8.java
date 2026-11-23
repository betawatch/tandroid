package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ o8(x8 x8Var, int i7) {
        this.a = i7;
        this.b = x8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == -1) {
                    x8.Z(this.b);
                    break;
                }
                break;
            default:
                x8 x8Var = this.b;
                if (i7 == -1) {
                    x8.Z(x8Var);
                }
                if (i7 == 1) {
                    x8Var.k0();
                    break;
                }
                break;
        }
    }
}
