package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo0 b;

    public /* synthetic */ in0(mo0 mo0Var, int i7) {
        this.a = i7;
        this.b = mo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mo0 mo0Var = this.b;
                mo0Var.v2 = true;
                r00 r00Var = mo0Var.t2;
                r00Var.r.setText("");
                org.telegram.messenger.g0.K3(r00Var.r);
                break;
            default:
                us usVar = new us(5);
                mo0 mo0Var2 = this.b;
                if (!mo0Var2.d) {
                    usVar.run();
                    break;
                } else {
                    r00 r00Var2 = mo0Var2.t2;
                    if (r00Var2 != null) {
                        org.telegram.messenger.g0.v1(r00Var2.r);
                    }
                    org.telegram.messenger.g0.i3(usVar, 300L);
                    break;
                }
        }
    }
}
