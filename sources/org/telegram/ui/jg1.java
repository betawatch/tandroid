package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg1 b;

    public /* synthetic */ jg1(kg1 kg1Var, int i10) {
        this.a = i10;
        this.b = kg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.o51 o51Var = this.b.a;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.o51 o51Var2 = this.b.a;
                if (o51Var2 != null) {
                    o51Var2.U2.N(true);
                    break;
                }
                break;
        }
    }
}
