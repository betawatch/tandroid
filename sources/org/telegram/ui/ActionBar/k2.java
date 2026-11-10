package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j5 b;

    public /* synthetic */ k2(j5 j5Var, int i7) {
        this.a = i7;
        this.b = j5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            case 1:
                j5 j5Var = this.b;
                if (!j5Var.D && j5Var.N) {
                    j5Var.c();
                    break;
                }
                break;
            default:
                this.b.a(true);
                break;
        }
    }
}
