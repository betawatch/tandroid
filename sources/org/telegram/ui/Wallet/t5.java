package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;

    public /* synthetic */ t5(u5 u5Var, int i7) {
        this.a = i7;
        this.b = u5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new t5(this.b, 1));
                break;
            default:
                this.b.a();
                break;
        }
    }
}
