package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
