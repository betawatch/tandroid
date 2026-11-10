package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ px0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ nx0(px0 px0Var, int i7, int i10) {
        this.a = i10;
        this.b = px0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                px0 px0Var = this.b;
                org.telegram.ui.Components.u61 u61Var = px0Var.b;
                ox0 ox0Var = px0Var.d;
                int i7 = this.c;
                u61Var.d(i7, ox0Var.i(i7));
                break;
            default:
                px0 px0Var2 = this.b;
                org.telegram.ui.Components.u61 u61Var2 = px0Var2.b;
                ox0 ox0Var2 = px0Var2.d;
                int i10 = this.c;
                u61Var2.d(i10, ox0Var2.i(i10));
                break;
        }
    }
}
