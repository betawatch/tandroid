package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.pc {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ b(f0 f0Var, int i7) {
        this.a = i7;
        this.b = f0Var;
    }

    @Override // org.telegram.messenger.pc
    public final void a(String str) {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                f0Var.m2 = str;
                f0Var.J2.O(true);
                break;
            default:
                f0 f0Var2 = this.b;
                f0Var2.m2 = str;
                f0Var2.J2.O(true);
                break;
        }
    }
}
