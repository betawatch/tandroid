package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pn0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ mo0 d;

    public /* synthetic */ pn0(mo0 mo0Var, int i7) {
        this.c = i7;
        this.d = mo0Var;
    }

    @Override // g.p
    public final int i(int i7) {
        switch (this.c) {
            case 0:
                if (i7 == 0) {
                    return this.d.C1.J;
                }
                return 1;
            case 1:
                jo0 jo0Var = this.d.H1;
                return (i7 == jo0Var.x || i7 == jo0Var.y || i7 == jo0Var.D || i7 == jo0Var.F || jo0Var.d(i7) == 0) ? 4 : 1;
            default:
                if (i7 == 0) {
                    return this.d.D1.J;
                }
                return 1;
        }
    }
}
