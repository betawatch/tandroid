package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j8 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;

    public /* synthetic */ j8(s8 s8Var, int i7) {
        this.a = i7;
        this.b = s8Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == -1) {
                    s8.Z(this.b);
                    break;
                }
                break;
            default:
                s8 s8Var = this.b;
                if (i7 == -1) {
                    s8.Z(s8Var);
                }
                if (i7 == 1) {
                    s8Var.k0();
                    break;
                }
                break;
        }
    }
}
