package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ p8(y8 y8Var, int i7) {
        this.a = i7;
        this.b = y8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == -1) {
                    y8.Z(this.b);
                    break;
                }
                break;
            default:
                y8 y8Var = this.b;
                if (i7 == -1) {
                    y8.Z(y8Var);
                }
                if (i7 == 1) {
                    y8Var.k0();
                    break;
                }
                break;
        }
    }
}
