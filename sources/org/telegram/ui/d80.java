package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k80 b;

    public /* synthetic */ d80(k80 k80Var, int i10) {
        this.a = i10;
        this.b = k80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k80 k80Var = this.b;
                k80Var.h.postOnAnimation(new d80(k80Var, 1));
                break;
            default:
                this.b.X();
                break;
        }
    }
}
