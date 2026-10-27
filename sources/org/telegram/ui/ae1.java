package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf1 b;

    public /* synthetic */ ae1(cf1 cf1Var, int i10) {
        this.a = i10;
        this.b = cf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cf1 cf1Var = this.b;
                cf1Var.x0();
                cf1Var.B0();
                break;
            case 1:
                this.b.x0();
                break;
            case 2:
                this.b.O0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                cf1 cf1Var2 = this.b;
                cf1Var2.A0 = null;
                cf1Var2.V0(true, false);
                break;
            default:
                cf1 cf1Var3 = this.b;
                cf1Var3.N.postOnAnimation(new ae1(cf1Var3, 1));
                break;
        }
    }
}
