package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;

    public /* synthetic */ b80(i80 i80Var, int i10) {
        this.a = i10;
        this.b = i80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i80 i80Var = this.b;
                i80Var.h.postOnAnimation(new b80(i80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
