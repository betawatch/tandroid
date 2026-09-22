package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l80 b;

    public /* synthetic */ e80(l80 l80Var, int i10) {
        this.a = i10;
        this.b = l80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l80 l80Var = this.b;
                l80Var.h.postOnAnimation(new e80(l80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
