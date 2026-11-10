package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x6 b;

    public /* synthetic */ u6(x6 x6Var, int i7) {
        this.a = i7;
        this.b = x6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x6.a(this.b);
                break;
            default:
                x6 x6Var = this.b;
                Runnable runnable = x6Var.c0;
                x6Var.c0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
