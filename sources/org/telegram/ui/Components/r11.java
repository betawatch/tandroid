package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u11 b;
    public final /* synthetic */ t11 c;

    public /* synthetic */ r11(u11 u11Var, t11 t11Var, int i10) {
        this.a = i10;
        this.b = u11Var;
        this.c = t11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c);
                break;
            case 1:
                this.b.b(this.c);
                break;
            default:
                this.b.b(this.c);
                break;
        }
    }
}
